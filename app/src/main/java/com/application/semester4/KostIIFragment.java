package com.application.semester4;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class KostIIFragment extends ListActivity {
    String [] berita ={"Jadwal Pemilu","Indonesian Capres", "Debat Cawapres", "Bio Capres"};
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_kost2);

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, berita));

    }
}