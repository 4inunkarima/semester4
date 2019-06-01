package com.application.semester4;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class NotificationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_notification);

        TextView title = (TextView) findViewById(R.id.notifications);
        title.setText("Notification Activity");

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.dashboard:
                        Intent intent0 = new Intent(NotificationActivity.this, DashboardActivity.class);
                        startActivity(intent0);
                        break;
                    case R.id.event:
                        Intent intent1 = new Intent( NotificationActivity.this, EventActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.notifications:
                        Intent intent2 = new Intent( NotificationActivity.this, EventActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.settings:
                        Intent intent3 = new Intent(NotificationActivity.this, SettingActivity.class);
                        startActivity(intent3);
                        break;
                }
                return false;
            }
        });
    }
}