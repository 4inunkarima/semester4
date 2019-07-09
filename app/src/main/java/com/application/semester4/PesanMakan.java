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
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import org.w3c.dom.Text;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by muhammadyusuf on 01/19/2017.
 * kodingindonesia
 */

public class PesanMakan extends AppCompatActivity implements View.OnClickListener {

    private EditText kamarPemesan;
    private Spinner menu;
    private Spinner text;

    private Button btnAdd;

    String [] MAKANLIST = {"Nasi Soto","Nasi Lalapan","Nasi Sop","Nasi Campur"};
    String makan = "";


    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_pesan_makan);

        kamarPemesan = (EditText) findViewById(R.id.KamarPemesan);
        menu = (Spinner) findViewById(R.id.pilihMenu);

        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,MAKANLIST);
        menu.setAdapter(adapter);
        menu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(
                    AdapterView<?> adapterView, View view,
                    int i, long l) {
                String text = menu.getSelectedItem().toString();
                makan = text;
            }


            public void onNothingSelected(
                    AdapterView<?> adapterView) {

            }
        });

        //Inisialisasi dari View
        kamarPemesan = (EditText) findViewById(R.id.KamarPemesan);
        menu = (Spinner) findViewById(R.id.pilihMenu);

        btnAdd = (Button) findViewById(R.id.kirimmakan);
        btnAdd.setOnClickListener(this);
    }


    //Dibawah ini merupakan perintah untuk Menambahkan Pegawai (CREATE)
    private void addPesanan(){
        final String menu_makan = makan;

        final String kamar_pemesan = "1";

        class AddPesanan extends AsyncTask<Void,Void,String>{

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
                Toast.makeText(PesanMakan.this,"Sukses",Toast.LENGTH_LONG).show();
                Intent i = new Intent(PesanMakan.this, DashboardActivity.class);
                startActivity(i);
                finish();
            }

            @Override
            protected String doInBackground(Void... v) {
                HashMap<String,String> params = new HashMap<>();
                params.put("data_penghuni_id", "5");
                params.put("data_kamar_id", kamar_pemesan);
                params.put("menu_sarapan_id", (Arrays.asList(MAKANLIST).indexOf(makan) + 1) + "");

                Log.d("Data", params.toString());

                RequestHandler rh = new RequestHandler();
                String res = rh.sendPostRequest(konfigurasi.URL_ADD_PESAN, params);
                return res;
            }


        }


        AddPesanan ae = new AddPesanan();
        ae.execute();
    }


    @Override
    public void onClick(View v) {
        if(v == btnAdd)
            addPesanan();
    }

}
