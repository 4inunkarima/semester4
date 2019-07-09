package com.application.semester4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ListFasilitas extends AppCompatActivity {

    public static final String ROOT_URL = "http://192.168.43.28/ProjectWebSmstr4/member/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_fasilitas);
    }
}
