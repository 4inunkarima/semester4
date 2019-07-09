package com.application.semester4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

public class PesanMakan extends AppCompatActivity {
    String [] MAKANLIST = {"Pilih Menu","Bubur","Nasi Pecel","Sandwich + Susu","Nasi Goreng"};
    String [] HARGALIST = {"RP.","RP.10,000","RP.15,000","RP.20,000","RP.15,000"};
    Spinner pilihan;
    EditText hasil;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_pesan_makan);

        pilihan = (Spinner) findViewById(R.id.pilihMenu);
        hasil = (EditText) findViewById(R.id.hargaPesan);
        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,MAKANLIST);
        pilihan.setAdapter(adapter);
        pilihan.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                switch (i){
                    case 0:
                        hasil.setText("" + HARGALIST[i]);
                        break;

                    case 1:
                        hasil.setText("" + HARGALIST[i]);
                        break;

                    case 2:
                        hasil.setText("" + HARGALIST[i]);
                        break;

                    case 3:
                        hasil.setText("" + HARGALIST[i]);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        Button kirim = findViewById(R.id.kirimmakan);

        kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PesanMakan.this, DashboardActivity.class);
                startActivity(i);
                finish();
            }
        });
        /*ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,SPINNERLIST);
        MaterialBetterSpinner betterSpinner = (MaterialBetterSpinner) findViewById(R.id.pilihMenu);
        betterSpinner.setAdapter(arrayAdapter);*/
    }
}
