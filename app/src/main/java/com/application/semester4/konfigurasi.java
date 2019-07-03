package com.application.semester4;

/**
 * Created by muhammadyusuf on 01/19/2017.
 * kodingindonesia
 */

public class konfigurasi {

    //Dibawah ini merupakan Pengalamatan dimana Lokasi Skrip CRUD PHP disimpan
    //Pada tutorial Kali ini, karena kita membuat localhost maka alamatnya tertuju ke IP komputer
    //dimana File PHP tersebut berada
    //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
    public static final String URL_GET_ALL = "http://192.168.100.12/ProjectWebSmstr4/member/daftar_penghuni.php";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_penghuni_id = "id";
    public static final String KEY_nama_pemghuni = "name";
    public static final String KEY_no_kamar = "no_kamar";
    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_data_penghuni_id = "id";
    public static final String TAG_nama_lengkap = "nama";
    public static final String TAG_no_kamar = "kamar";

    //ID karyawan
    //emp itu singkatan dari Employee
    public static final String EMP_ID = "emp_id";
}
