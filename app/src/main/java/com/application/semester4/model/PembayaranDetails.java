package com.application.semester4.model;

import com.application.semester4.R;

import java.util.ArrayList;

public class PembayaranDetails {

    public static ArrayList<ModelPembayaran> getList() {
        ArrayList<ModelPembayaran> movieList = new ArrayList<>();
        movieList.add(new ModelPembayaran(R.drawable.user, "Kevin Harlis Oktaviano", "No Kamar 00","Total Biaya","Tanggal Bayar","Periode","Rp.800.000","27 may 2019","January"));
        movieList.add(new ModelPembayaran(R.drawable.user, "Kevin Harlis Oktaviano", "No Kamar 01","Total Biaya","Tanggal Bayar","Periode","Rp.800.000","27 Oktober 2019","Februari"));
        movieList.add(new ModelPembayaran(R.drawable.user, "Kevin Harlis Oktaviano", "No Kamar 02","Total Biaya","Tanggal Bayar","Periode","Rp.800.000","27 may 2019","Maret"));
        movieList.add(new ModelPembayaran(R.drawable.user, "Kevin Harlis Oktaviano", "No Kamar 04","Total Biaya","Tanggal Bayar","Periode","Rp.800.000","27 may 2019","April"));
        movieList.add(new ModelPembayaran(R.drawable.user, "Kevin Harlis Oktaviano", "No Kamar 05","Total Biaya","Tanggal Bayar","Periode","Rp.800.000","27 may 2019","Mei"));
        movieList.add(new ModelPembayaran(R.drawable.user, "Kevin Harlis Oktaviano", "No Kamar 06","Total Biaya","Tanggal Bayar","Periode","Rp.800.000","27 may 2019","Juni"));
        movieList.add(new ModelPembayaran(R.drawable.user, "Kevin Harlis Oktaviano", "No Kamar 07","Total Biaya","Tanggal Bayar","Periode","Rp.800.000","27 may 2019","July"));
        movieList.add(new ModelPembayaran(R.drawable.user, "Kevin Harlis Oktaviano", "No Kamar 08","Total Biaya","Tanggal Bayar","Periode","Rp.800.000","27 may 2019","Agustus"));
        movieList.add(new ModelPembayaran(R.drawable.user, "Kevin Harlis Oktaviano", "No Kamar 09","Total Biaya","Tanggal Bayar","Periode","Rp.800.000","27 may 2019","September"));

        return movieList;
    }
}
