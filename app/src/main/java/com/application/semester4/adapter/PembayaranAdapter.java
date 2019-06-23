package com.application.semester4.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.application.semester4.R;
import com.application.semester4.model.Model;
import com.application.semester4.model.ModelPembayaran;

import java.util.ArrayList;

public class PembayaranAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<ModelPembayaran> models;

    public PembayaranAdapter(Context context, ArrayList<ModelPembayaran> models) {
        this.context = context;
        this.models = models;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public Object getItem(int position) {
        return models.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = View.inflate(context, R.layout.list_pembayaran, null);
        }

        ImageView listImages = (ImageView) convertView.findViewById(R.id.imgCard);
        TextView listTitle1 = (TextView) convertView.findViewById(R.id.txtText1);
        TextView listTitle2 = (TextView) convertView.findViewById(R.id.txtText2);
        TextView listTitle3 = (TextView) convertView.findViewById(R.id.txtText3);
        TextView listTitle4 = (TextView) convertView.findViewById(R.id.txtText4);
        TextView listTitle5 = (TextView) convertView.findViewById(R.id.txtText5);
        TextView listTitle6 = (TextView) convertView.findViewById(R.id.txtText6);
        TextView listTitle7 = (TextView) convertView.findViewById(R.id.txtText7);
        TextView listTitle8 = (TextView) convertView.findViewById(R.id.txtText8);

        ModelPembayaran model = models.get(position);
        listImages.setImageResource(model.getListImage());
        listTitle1.setText(model.getListTitle1());
        listTitle2.setText(model.getListTitle2());
        listTitle3.setText(model.getListTitle3());
        listTitle4.setText(model.getListTitle4());
        listTitle5.setText(model.getListTitle5());
        listTitle6.setText(model.getListTitle6());
        listTitle7.setText(model.getListTitle7());
        listTitle8.setText(model.getListTitle8());

        return convertView;
    }

}

