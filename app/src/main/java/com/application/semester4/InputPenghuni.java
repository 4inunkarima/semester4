package com.application.semester4;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class InputPenghuni extends Activity implements
        CompoundButton.OnCheckedChangeListener {

    // Widget GUI
    CheckBox chkKost, chkWifi, chkMakan;
    TextView lblTotal;
    // Activity Variable
    int total = 0;
    int kostCost = 500000, wifiCost = 50000, makanCost = 300000;
    String totalBill = "Total Tagihan : RP.";

    /** Memanggil aktivitas yang pertama kali dibuat. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_input_penghuni);

        chkKost = (CheckBox) findViewById(R.id.chkKost);
        chkWifi = (CheckBox) findViewById(R.id.chkWifi);
        chkMakan = (CheckBox) findViewById(R.id.chkMakan);

        lblTotal = (TextView) findViewById(R.id.lblTotal);


        chkKost.setOnCheckedChangeListener(this);
        chkWifi.setOnCheckedChangeListener(this);
        chkMakan.setOnCheckedChangeListener(this);

    }

    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        if (buttonView == chkKost) {
            if (isChecked) {
                total = total + kostCost;
            } else {
                total = total - kostCost;
            }
        }
        if (buttonView == chkWifi) {
            if (isChecked) {
                total = total + wifiCost;
            } else {
                total = total - wifiCost;
            }
        }
        if (buttonView == chkMakan) {
            if (isChecked) {
                total = total + makanCost;
            } else {
                total = total - makanCost;
            }
        }
        lblTotal.setText(totalBill + total);

    }
}