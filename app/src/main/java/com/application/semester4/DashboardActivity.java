package com.application.semester4;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_nav);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.dashboard:

                        break;
                    case R.id.event:
                        Intent intent1 = new Intent(DashboardActivity.this, EventActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.notifications:
                        Intent intent2 = new Intent(DashboardActivity.this, NotificationActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.settings:
                        Intent intent3 = new Intent(DashboardActivity.this, SettingActivity.class);
                        startActivity(intent3);
                        break;
                }


                return false;
            }
        });


    }
}
