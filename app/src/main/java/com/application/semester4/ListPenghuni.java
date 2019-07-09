package com.application.semester4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ListPenghuni extends AppCompatActivity {

    public static final String ROOT_URL = "http://10.10.3.224/ProjectWebSmstr4/member/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_penghuni);
    }
}
