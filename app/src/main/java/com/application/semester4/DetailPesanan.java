package com.application.semester4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.application.semester4.API.ApiService;
import com.application.semester4.model.PesananModel;

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

public class DetailPesanan extends AppCompatActivity {

    String ID_PESANAN;
    TextView  dtl_nama, dtl_kamar, dtl_pesanan, dtl_status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_detail_pesanan);

        ID_PESANAN = getIntent().getStringExtra(PesananModel.id_pesanan);


        dtl_nama = (TextView) findViewById(R.id.dtlNamaPemesan);
        dtl_kamar = (TextView) findViewById(R.id.dtlKamarPemesan);
        dtl_pesanan = (TextView) findViewById(R.id.dtlPesanan);
        dtl_status = (TextView) findViewById(R.id.dtlStatusPesanan);

        bindData();


    }

    public void bindData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ListPesananku.ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiService service = retrofit.create(ApiService.class);

        Call<List<PesananModel>> call = service.getSingleData(ID_PESANAN);
        call.enqueue(new Callback<List<PesananModel>>() {
            @Override
            public void onResponse(Call<List<PesananModel>> call, Response<List<PesananModel>> response) {

                if (response.isSuccessful()) {

                    for (int i = 0; i < response.body().size(); i++) {

                        dtl_nama.setText(response.body().get(i).getNama());
                        dtl_kamar.setText(response.body().get(i).getKamar());
                        dtl_pesanan.setText(response.body().get(i).getMenu());
                        dtl_status.setText(response.body().get(i).getStat());

                    }

                }

            }

            @Override
            public void onFailure(Call<List<PesananModel>> call, Throwable t) {

            }
        });
    }
}