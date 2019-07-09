package com.application.semester4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.application.semester4.API.ApiService;
import com.application.semester4.model.PembayaranModel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DetailPembayaran extends AppCompatActivity {

    String ID_PEMBAYARAN;
    TextView nama, kamar, biaya, periode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_detail_pembayaran);

        ID_PEMBAYARAN = getIntent().getStringExtra(PembayaranModel.id_pembayaran);

        nama = (TextView) findViewById(R.id.dtlnamaPembayar);
        kamar = (TextView) findViewById(R.id.dtlkamarPembayar);
        biaya = (TextView) findViewById(R.id.dtltotalBiaya);
        periode = (TextView) findViewById(R.id.dtlperiodePembayaran);

        bindData();


    }

    public void bindData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ListPembayaran.ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiService service = retrofit.create(ApiService.class);

        Call<List<PembayaranModel>> call = service.getDetailPembayaran(ID_PEMBAYARAN);
        call.enqueue(new Callback<List<PembayaranModel>>() {
            @Override
            public void onResponse(Call<List<PembayaranModel>> call, Response<List<PembayaranModel>> response) {

                if (response.isSuccessful()) {

                    for (int i = 0; i < response.body().size(); i++) {

                        nama.setText(response.body().get(i).getNama());
                        kamar.setText(response.body().get(i).getKamar());
                        biaya.setText(response.body().get(i).getBiaya());
                        periode.setText(response.body().get(i).getPeriod());

                    }

                }

            }

            @Override
            public void onFailure(Call<List<PembayaranModel>> call, Throwable t) {

            }
        });
    }
}

