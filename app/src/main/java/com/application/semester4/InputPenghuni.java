package com.application.semester4;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

/**
 * Created by muhammadyusuf on 01/19/2017.
 * kodingindonesia
 */

public class InputPenghuni extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    CheckBox chkKost, chkWifi, chkMakan;
    TextView lblTotal;
    // Activity Variable
    int total = 0;
    int kostCost = 500000, wifiCost = 50000, makanCost = 300000;
    String totalBill = "Total Tagihan : RP.";

    public static String penghuni_id = "";

    //Dibawah ini merupakan perintah untuk mendefinikan View
    private EditText namaPenghuni;
    private EditText noKtp;
    private EditText alamatPenghuni;
    private EditText hpPenghuni;
    private EditText kamarPenghuni;
    private CheckBox kost;
    private CheckBox wifi;
    private CheckBox makan;
    private TextView biayaPenghuni;

    private Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_input_penghuni);

        //Inisialisasi dari View
        namaPenghuni = (EditText) findViewById(R.id.NamaPenghuni);
        noKtp = (EditText) findViewById(R.id.NoKtp);
        alamatPenghuni = (EditText) findViewById(R.id.Alamat);
        hpPenghuni = (EditText) findViewById(R.id.Nohp);
        kamarPenghuni = (EditText) findViewById(R.id.Nokamar);
        kost = (CheckBox) findViewById(R.id.chkKost);
        wifi = (CheckBox) findViewById(R.id.chkWifi);
        makan = (CheckBox) findViewById(R.id.chkMakan);
        biayaPenghuni = (TextView) findViewById(R.id.lblTotal);

        btnAdd = (Button) findViewById(R.id.kirimpenghuni);

        kost.setOnCheckedChangeListener(this);
        wifi.setOnCheckedChangeListener(this);
        makan.setOnCheckedChangeListener(this);

        //Setting listeners to button
        btnAdd.setOnClickListener(this);
        }


    //Dibawah ini merupakan perintah untuk Menambahkan Pegawai (CREATE)
    private void addPenghuni(final int biaya_id){

        final String nama_penghuni = namaPenghuni.getText().toString().trim();
        final String no_ktp = noKtp.getText().toString().trim();
        final String alamat_penghuni = alamatPenghuni.getText().toString().trim();
        final String hp_penghuni = hpPenghuni.getText().toString().trim();
        final String kamar_penghuni = kamarPenghuni.getText().toString().trim();
        final String biaya_penghuni = biayaPenghuni.getText().toString().trim();

        class AddPenghuni extends AsyncTask<Void,Void,String>{

            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(InputPenghuni.this,"Menambahkan...","Tunggu...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                penghuni_id = s;
                Toast.makeText(InputPenghuni.this,"sukses",Toast.LENGTH_LONG).show();

            }

            @Override
            protected String doInBackground(Void... v) {
                HashMap<String,String> params = new HashMap<>();
                params.put("nama_lengkap",nama_penghuni);
                params.put("no_ktp",no_ktp);
                params.put("alamat",alamat_penghuni);
                params.put("no_hp",hp_penghuni);
                params.put("data_kamar_id",kamar_penghuni);
                params.put("biaya_kost_id",biaya_id + "");

                Log.d("Data", params.toString());

                RequestHandler rh = new RequestHandler();
                String res = rh.sendPostRequest(konfigurasi.URL_ADD, params);
                return res;
            }
        }

        AddPenghuni ae = new AddPenghuni();
        ae.execute();
    }

    @Override
    public void onClick(View v) {
        if(v == btnAdd){
            int id = 0;
            if(kost.isChecked() && makan.isChecked() && wifi.isChecked()) {
                id = 1;
            }
            addPenghuni(id);
        }

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (buttonView == kost) {
            if (isChecked) {
                total = total + kostCost;
            } else {
                total = total - kostCost;
            }
        }
        if (buttonView == wifi) {
            if (isChecked) {
                total = total + wifiCost;
            } else {
                total = total - wifiCost;
            }
        }
        if (buttonView == makan) {
            if (isChecked) {
                total = total + makanCost;
            } else {
                total = total - makanCost;
            }
        }
        biayaPenghuni.setText(totalBill + total);
    }
}
