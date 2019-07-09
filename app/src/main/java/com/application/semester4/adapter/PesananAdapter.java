package com.application.semester4.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.application.semester4.model.PesananModel;
import com.application.semester4.R;


import java.util.ArrayList;

public class PesananAdapter extends ArrayAdapter<PesananModel> {

    private ArrayList<PesananModel> list;
    private LayoutInflater inflater;
    private int res;

    public PesananAdapter(Context context, int resource, ArrayList<PesananModel> list) {
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

            holder.ID = (TextView) convertView.findViewById(R.id.listIdPesanan);
            holder.IDPUSH = (TextView) convertView.findViewById(R.id.listshw_id);
            holder.Nama = (TextView) convertView.findViewById(R.id.listNamaPemesan);
            holder.Kamar = (TextView) convertView.findViewById(R.id.listKamarPemesan);
            holder.NamaPesanan = (TextView) convertView.findViewById(R.id.listNamaPesanan);
            holder.Tanggal = (TextView) convertView.findViewById(R.id.tanggalPesan);
            holder.Status = (TextView) convertView.findViewById(R.id.statusPesanan);

            convertView.setTag(holder);

        } else {

            holder = (MyHolder) convertView.getTag();
        }

        holder.ID.setText("# "+list.get(position).getId());
        holder.IDPUSH.setText(list.get(position).getId());
        holder.Nama.setText(list.get(position).getNama());
        holder.Kamar.setText("No Kamar : "+list.get(position).getKamar());
        holder.NamaPesanan.setText(list.get(position).getMenu());
        holder.Tanggal.setText(list.get(position).getTgl());
        holder.Status.setText(list.get(position).getStat());


        return convertView;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public void remove(PesananModel object) {
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
        TextView NamaPesanan;
        TextView Tanggal;
        TextView Status;


    }
}
