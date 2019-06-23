package com.application.semester4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.application.semester4.adapter.PembayaranAdapter;
import com.application.semester4.model.PembayaranDetails;
import com.application.semester4.model.PesananDetails;
import com.application.semester4.model.ModelPembayaran;

import java.util.ArrayList;

public class ListPembayaranku extends AppCompatActivity {

    private ListView listView;
    private ArrayList<ModelPembayaran>models;
    private PembayaranAdapter pembayaranAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_pembayaranku);

        listView = (ListView) findViewById(R.id.list_pembayaran);
        models = PembayaranDetails.getList();

        pembayaranAdapter = new PembayaranAdapter(ListPembayaranku.this,models);
        listView.setAdapter(pembayaranAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext(),DetailPembayaran.class);
                intent.putExtra("position",position);

                startActivity(intent);
            }
        });

    }

}
