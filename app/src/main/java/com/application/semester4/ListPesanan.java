package com.application.semester4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.application.semester4.adapter.PesananAdapter;
import com.application.semester4.model.PesananDetails;
import com.application.semester4.model.Model;

import java.util.ArrayList;

public class ListPesanan extends AppCompatActivity {

    private ListView listView;
    private ArrayList<Model>models;
    private PesananAdapter pesananAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_pesananku);

        listView = (ListView) findViewById(R.id.list_view);
        models = PesananDetails.getList();

        pesananAdapter = new PesananAdapter(ListPesanan.this,models);
        listView.setAdapter(pesananAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext(),DetailPesanan.class);
                intent.putExtra("position",position);

                startActivity(intent);
            }
        });

    }

}
