package com.application.semester4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

public class InputLaporanFasilitas extends AppCompatActivity {
    String [] FASILIST = {"Pilih Menu","Kursi","Kompor","Mesin Cuci","Meja kamar"};
    MaterialBetterSpinner pilihfasi;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_input_laporan);

        pilihfasi = (MaterialBetterSpinner) findViewById(R.id.pilihFasi);
        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,FASILIST);
        pilihfasi.setAdapter(adapter);
    }
}
