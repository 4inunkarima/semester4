package com.application.semester4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ListPesananku extends AppCompatActivity {

    public static final String ROOT_URL = "http://192.168.100.8/ProjectWebSmstr4/member/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_pesananku);
    }
}
