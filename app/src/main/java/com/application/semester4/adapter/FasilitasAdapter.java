package com.application.semester4.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.application.semester4.model.ModelFasilitas;
import com.application.semester4.R;


import java.util.ArrayList;

public class FasilitasAdapter extends ArrayAdapter<ModelFasilitas> {

    private ArrayList<ModelFasilitas> list;
    private LayoutInflater inflater;
    private int res;

    public FasilitasAdapter(Context context, int resource, ArrayList<ModelFasilitas> list) {
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

            holder.ID = (TextView) convertView.findViewById(R.id.listIdLaporan);
            holder.Nama = (TextView) convertView.findViewById(R.id.listNamaFasilitas);
            holder.Status = (TextView) convertView.findViewById(R.id.listStatus);
            holder.Keterangan = (TextView) convertView.findViewById(R.id.listKeterangan);

            convertView.setTag(holder);

        } else {

            holder = (MyHolder) convertView.getTag();
        }

        holder.ID.setText(list.get(position).getIdFasi());
        holder.Nama.setText(list.get(position).getNama());
        holder.Status.setText(list.get(position).getStatus());
        holder.Keterangan.setText(list.get(position).getKeterangan());


        return convertView;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public void remove(ModelFasilitas object) {
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
        TextView Status;
        TextView Keterangan;


    }
}
