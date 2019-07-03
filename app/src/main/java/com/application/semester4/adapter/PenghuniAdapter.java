    package com.application.semester4.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.application.semester4.model.PenghuniModel;
import com.application.semester4.R;


import java.util.ArrayList;

public class PenghuniAdapter extends ArrayAdapter<PenghuniModel> {

    private ArrayList<PenghuniModel> list;
    private LayoutInflater inflater;
    private int res;

    public PenghuniAdapter(Context context, int resource, ArrayList<PenghuniModel> list) {
        super(context, resource, list);
        this.list = list;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.res = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        MyHolder holder = null;


        if (convertView == null) {

            convertView = inflater.inflate(res, parent, false);

            holder = new MyHolder();

            holder.ID = (TextView) convertView.findViewById(R.id.listIdPenghuni);
            holder.Nama = (TextView) convertView.findViewById(R.id.listNamaPenghuni);
            holder.Kamar = (TextView) convertView.findViewById(R.id.listKamarPenghuni);

            convertView.setTag(holder);

        } else {

            holder = (MyHolder) convertView.getTag();
        }

        holder.ID.setText("# "+list.get(position).getId());
        holder.Nama.setText("Nama Penghuni : "+list.get(position).getNama());
        holder.Kamar.setText("No Kamar : "+list.get(position).getKamar());

        return convertView;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public void remove(PenghuniModel object) {
        super.remove(object);
    }

    @Override
    public void clear() {
        super.clear();
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    static class MyHolder {

        TextView ID;
        TextView Nama;
        TextView Kamar;


    }
}
