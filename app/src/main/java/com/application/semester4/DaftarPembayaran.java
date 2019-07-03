package com.application.semester4;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.application.semester4.API.ApiService;
import com.application.semester4.adapter.PembayaranAdapter;
import com.application.semester4.model.PembayaranModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DaftarPembayaran extends AppCompatActivity implements AdapterView.OnItemClickListener {


    ArrayList<PembayaranModel> dataPembayaran = new ArrayList<PembayaranModel>();
    ListView listview;
    PembayaranAdapter adapter;

    LinearLayout layout_loading;
    TextView text_load;
    ImageView icon_load;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_pembayaranku);

        layout_loading = (LinearLayout) findViewById(R.id.layout_loading);

        text_load = (TextView) findViewById(R.id.text_load);
        icon_load = (ImageView) findViewById(R.id.icon_load);

        listview = (ListView) findViewById(R.id.listBayar);
        listview.setOnItemClickListener(DaftarPembayaran.this);
        listview.setDividerHeight(0);
        setup();

    }

    public void setup() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ListPenghuni.ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiService service = retrofit.create(ApiService.class);

        Call<List<PembayaranModel>> call = service.getSemuaPembayaran();
        call.enqueue(new Callback<List<PembayaranModel>>() {
            @Override
            public void onResponse(Call<List<PembayaranModel>> call, Response<List<PembayaranModel>> response) {

                if (response.isSuccessful()) {
                    int jumlah = response.body().size();

                    for (int i = 0; i < jumlah; i++) {

                        PembayaranModel data = new PembayaranModel(
                                response.body().get(i).getId(),
                                response.body().get(i).getNama(),
                                response.body().get(i).getKamar(),
                                response.body().get(i).getBiay(),
                                response.body().get(i).getPeriod(),
                                response.body().get(i).getTgl());
                        dataPembayaran.add(data);
                        Log.d("RESPON", "onResponse: " + response.body().get(i).getId());

                    }
                    listview.setVisibility(View.VISIBLE);
                    adapter = new PembayaranAdapter(DaftarPembayaran.this, R.layout.list_pembayaran, dataPembayaran );
                    listview.setAdapter(adapter);

                    if (adapter.getCount() < 1 ) {
                        layout_loading.setVisibility(View.VISIBLE);
                        String error = "Daftar mahasiswa Kosong";
                        text_load.setText(error);
                        Bitmap icon = BitmapFactory.decodeResource(getResources(), R.drawable.ic_data_kosong);
                        icon_load.setImageBitmap(icon);
                    }
                } else {
                    String error = "Error Retrive Data from Server !!!";
                    text_load.setText(error);
                    Bitmap icon = BitmapFactory.decodeResource(getResources(), R.drawable.ic_network);
                    icon_load.setImageBitmap(icon);

                }

            }

            @Override
            public void onFailure(Call<List<PembayaranModel>> call, Throwable t) {
                String error = "Error Retrive Data from Server wwaau!!!\n" + t.getMessage();
                text_load.setText(error);
                Bitmap icon = BitmapFactory.decodeResource(getResources(), R.drawable.ic_network);
                icon_load.setImageBitmap(icon);
            }
        });

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            adapter.clear();
            setup();
        }
    }
}