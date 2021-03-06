package com.application.semester4;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

public class SettingActivity extends AppCompatActivity {
    private SessionHandler session;
    private Toolbar toolbar;
    TextView textView , listPenghuni, menuactivity, peraturan, about;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_setting);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        session = new SessionHandler(getApplicationContext());

        textView = (TextView) findViewById(R.id.txtProf);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this,Profile.class);
                startActivity(intent);
            }
        });

        menuactivity = (TextView) findViewById(R.id.btnPesan);
        menuactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });

        peraturan = (TextView) findViewById(R.id.btnPeraturan);
        peraturan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this, PeraturanActivity.class);
                startActivity(intent);
            }
        });

        about = (TextView) findViewById(R.id.btnDetail);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });

        listPenghuni = (TextView) findViewById(R.id.daftarPenghuni);
        listPenghuni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this,DaftarPenghuni.class);
                startActivity(intent);
            }
        });

        Button tambah = findViewById(R.id.btnTambah);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SettingActivity.this, InputPenghuni.class);
                startActivity(i);
                finish();
            }
        });


        Button logoutBtn = findViewById(R.id.btnLogout);

        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                session.logoutUser();
                Intent i = new Intent(SettingActivity.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        });


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.dashboard:
                        Intent intent0 = new Intent(SettingActivity.this, DashboardActivity.class);
                        startActivity(intent0);
                        break;

                    case R.id.settings:

                        break;
                }
                return false;
            }
        });
    }

}
