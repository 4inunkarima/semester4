package com.application.semester4;

import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.widget.TabHost;


public class PenghuniActivity extends TabActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_penghuni);

        TabHost tabhost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;

        intent = new Intent().setClass(this, KostIFragment.class);//content pada tab yang akan kita buat
        spec = tabhost.newTabSpec("beranda").setIndicator("Beranda",null).setContent(intent);//mengeset nama tab dan mengisi content pada menu tab anda.
        tabhost.addTab(spec);//untuk membuat tabbaru disini bisa diatur sesuai keinginan anda

        intent = new Intent().setClass(this, KostIIFragment.class);
        spec = tabhost.newTabSpec("teman").setIndicator("Teman",null).setContent(intent);
        tabhost.addTab(spec);

    }
}
