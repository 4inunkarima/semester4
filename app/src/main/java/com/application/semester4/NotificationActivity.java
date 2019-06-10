package com.application.semester4;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.application.semester4.adapter.ViewAdapter;
import com.application.semester4.model.ListDetails;
import com.application.semester4.model.Model;

import java.util.ArrayList;

public class NotificationActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<Model> models;
    private ViewAdapter listAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_notification);

        listView = (ListView) findViewById(R.id.list_view);
        models = ListDetails.getList();
        listAdapter = new ViewAdapter(NotificationActivity.this,models);
        listView.setAdapter(listAdapter);
    }




    }