package com.application.semester4.API;




import com.application.semester4.model.ModelFasilitas;
import com.application.semester4.model.PembayaranModel;
import com.application.semester4.model.PenghuniModel;
import com.application.semester4.model.PesananModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by JhonDev on 05/10/2016.
 */

public interface ApiService {

//    @FormUrlEncoded
//    @POST("tambah_data.php")
//    Call<ResponseBody> tambahData(@Field("nama") String nama, @Field("jenis") String jenis, @Field("keterangan") String keterangan);
//
//    @FormUrlEncoded
//    @POST("edit_data.php")
//    Call<ResponseBody> editData(@Field("id_barang") String id, @Field("nama_barang") String nama, @Field("jenis_barang") String jenis, @Field("keterangan_barang") String keterangan);
//
//    @FormUrlEncoded
//    @POST("hapus_data.php")
//    Call<ResponseBody> hapusData(@Field("id_barang") String id_barang);

    @GET("daftar_penghuni.php")
    Call<List<PenghuniModel>> getSemuaPenghuni();

    @GET("laporan_fasilitas.php")
    Call<List<ModelFasilitas>> getSemuaFasilitas();

    @GET("daftar_pesanan.php")
    Call<List<PesananModel>> getSemuaPesanan();

    @GET("pembayaran.php")
    Call<List<PembayaranModel>> getSemuaPembayaran();

//    @GET("single_data.php")
//    Call<List<ModelData>> getSingleData(@Query("id_barang") String id);

}
