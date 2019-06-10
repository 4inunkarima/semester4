package com.application.semester4.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.application.semester4.R;
import com.application.semester4.model.Model;

import java.util.ArrayList;

public class ViewAdapter extends BaseAdapter {


    private Context context;
    private ArrayList<Model> models;

    public ViewAdapter(Context context, ArrayList<Model> models) {
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

        if (convertView == null){
            convertView = View.inflate(context , R.layout.list_items , null);
        }

        ImageView listImages = (ImageView) convertView.findViewById(R.id.imgCard);
        TextView listTitle1 = (TextView) convertView.findViewById(R.id.txtText1);
        TextView listTitle2 = (TextView) convertView.findViewById(R.id.txtText2);
        TextView listTitle3 = (TextView) convertView.findViewById(R.id.txtText3);

        Model model = models.get(position);
        listImages.setImageResource(model.getListImage());
        listTitle1.setText(model.getListTitle1());
        listTitle2.setText(model.getListTitle2());
        listTitle3.setText(model.getListTitle3());

        return convertView;
    }
}
