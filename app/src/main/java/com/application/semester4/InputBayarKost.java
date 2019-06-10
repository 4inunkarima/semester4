package com.application.semester4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

public class InputBayarKost extends AppCompatActivity {
    String [] MONTHLIST = {"Januari","Februari","Maret","April","Mei"};
    MaterialBetterSpinner periode;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_input_bayar_kost);

        periode = (MaterialBetterSpinner) findViewById(R.id.pilihPeriode);
        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,MONTHLIST);
        periode.setAdapter(adapter);
    }
}