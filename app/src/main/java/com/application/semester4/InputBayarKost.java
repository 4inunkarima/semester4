package com.application.semester4;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by muhammadyusuf on 01/19/2017.
 * kodingindonesia
 */

public class InputBayarKost extends AppCompatActivity implements View.OnClickListener {

    private EditText kamarPembayar;
    private MaterialBetterSpinner totalBiaya;
    private MaterialBetterSpinner periode;

    private Button btnAdd;

    String [] MONTHLIST = {"Januari","Februari","Maret","April","Mei","Juni","July","Agustus","September","Oktober","November","Desember"};
    String month = "";

    String [] BIAYALIST = {"Biaya Kost + Makan + Wifi","Biaya Kost + Wifi","Biaya Kost + Makan","Biaya Kost","Biaya Makan","Biaya Wifi"};
    String biaya = "";

    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_input_bayar_kost);

        periode = (MaterialBetterSpinner) findViewById(R.id.pilihPeriode);
        kamarPembayar = (EditText) findViewById(R.id.KamarPembayar);
        totalBiaya = (MaterialBetterSpinner) findViewById(R.id.TotalBayar);

        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,MONTHLIST);
        periode.setAdapter(adapter);
        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,BIAYALIST);
        totalBiaya.setAdapter(adapter);
        periode.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String spinner_value= adapterView.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),spinner_value,Toast.LENGTH_LONG).show();
                month = spinner_value;
            }
        });
        totalBiaya.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String spinner_value= adapterView.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),spinner_value,Toast.LENGTH_LONG).show();
                biaya = spinner_value;
            }
        });

        //Inisialisasi dari View
        kamarPembayar = (EditText) findViewById(R.id.Nokamar);
        totalBiaya = (MaterialBetterSpinner) findViewById(R.id.TotalBayar);
        periode = (MaterialBetterSpinner) findViewById(R.id.pilihPeriode);

        btnAdd = (Button) findViewById(R.id.kirimbayar);
        btnAdd.setOnClickListener(this);
    }


    //Dibawah ini merupakan perintah untuk Menambahkan Pegawai (CREATE)
    private void addPembayaran(){
        final String period = month;

        final String kamar_pembayar = "1";

        class AddPembayar extends AsyncTask<Void,Void,String>{

            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
//                loading = ProgressDialog.show(InputBayarKost.this,"Menambahkan...","Tunggu...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
//                loading.dismiss();
                Toast.makeText(InputBayarKost.this,"Sukses",Toast.LENGTH_LONG).show();
                Intent i = new Intent(InputBayarKost.this, DashboardActivity.class);
                startActivity(i);
                finish();
            }

            @Override
            protected String doInBackground(Void... v) {
                HashMap<String,String> params = new HashMap<>();
                params.put("data_penghuni_id", "5");
                params.put("data_kamar_id", kamar_pembayar);
                params.put("biaya_kost_id", (Arrays.asList(BIAYALIST).indexOf(biaya) + 1) + "");
                params.put("periode",period);

                Log.d("Data", params.toString());

                RequestHandler rh = new RequestHandler();
                String res = rh.sendPostRequest(konfigurasi.URL_ADD_BAYAR, params);
                return res;
            }


        }


        AddPembayar ae = new AddPembayar();
        ae.execute();
    }


    @Override
    public void onClick(View v) {
        if(v == btnAdd)
            addPembayaran();
    }
}
