package com.application.semester4.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.application.semester4.model.PembayaranModel;
import com.application.semester4.R;


import java.util.ArrayList;

public class PembayaranAdapter extends ArrayAdapter<PembayaranModel> {

    private ArrayList<PembayaranModel> list;
    private LayoutInflater inflater;
    private int res;

    public PembayaranAdapter(Context context, int resource, ArrayList<PembayaranModel> list) {
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

            holder.ID = (TextView) convertView.findViewById(R.id.listIdPembayaran);
            holder.IDPUSH = (TextView) convertView.findViewById(R.id.listID1);
            holder.Nama = (TextView) convertView.findViewById(R.id.listNamaPembayar);
            holder.Kamar = (TextView) convertView.findViewById(R.id.listKamarPembayar);
            holder.Biaya = (TextView) convertView.findViewById(R.id.listTotalBiaya);
            holder.Periode = (TextView) convertView.findViewById(R.id.ListPeriode);
            holder.Tanggal = (TextView) convertView.findViewById(R.id.listTanggalBayar);

            convertView.setTag(holder);

        } else {

            holder = (MyHolder) convertView.getTag();
        }

        holder.ID.setText("# "+list.get(position).getId());
        holder.IDPUSH.setText(list.get(position).getId());
        holder.Nama.setText(list.get(position).getNama());
        holder.Kamar.setText("No Kamar : "+list.get(position).getKamar());
        holder.Biaya.setText("RP. "+list.get(position).getBiaya());
        holder.Periode.setText(list.get(position).getPeriod());
        holder.Tanggal.setText(list.get(position).getTgl());


        return convertView;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public void remove(PembayaranModel object) {
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
        TextView IDPUSH;
        TextView Nama;
        TextView Kamar;
        TextView Biaya;
        TextView Periode;
        TextView Tanggal;


    }
}
