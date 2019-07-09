
package com.application.semester4.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PembayaranModel {

    @SerializedName("id_pembayaran")
    @Expose
    private String idPembayaran;

    @SerializedName("nama_pembayar")
    @Expose
    private String namaPembayar;

    @SerializedName("kamar_pembayar")
    @Expose
    private String kamarPembayar;

    @SerializedName("biaya_pembayaran")
    @Expose
    private String biayaPembayaran;

    @SerializedName("periode_pembayaran")
    @Expose
    private String periodePembayaran;

    @SerializedName("tanggal_pembayaran")
    @Expose
    private String tanggalPembayaran;

    public static final String id_pembayaran= "ID_PEMBAYARAN";
    public static final String nama_pembayar = "ID_PEMBAYARAN";
    public static final String kamar_pembayar = "ID_PEMBAYARAN";
    public static final String biaya_pembayaran = "ID_PEMBAYARAN";
    public static final String periode_pembayaran = "ID_PEMBAYARAN";
    public static final String tanggal_pembayaran = "ID_PEMBAYARAN";

    public PembayaranModel(String id, String nama, String nokamar,String biay,String period,String tgl) {
        this.idPembayaran = id;
        this.namaPembayar = nama;
        this.kamarPembayar = nokamar;
        this.biayaPembayaran = biay;
        this.periodePembayaran = period;
        this.tanggalPembayaran = tgl;
    }

    /**
     *
     * @return
     *     The idPembayaran
     */
    public String getId() {
        return idPembayaran;
    }

    /**
     *
     * @param idPembayaran
     *     The id_pembayaran
     */
    public void setIdPembayaran(String idPembayaran) {
        this.idPembayaran = idPembayaran;
    }

    /**
     *
     * @return
     *     The nama
     */
    public String getNama() {
        return namaPembayar;
    }

    /**
     *
     * @param namaPembayar
     *     The NamaPembayar
     */
    public void setNama(String namaPembayar) {
        this.namaPembayar = namaPembayar;
    }

    /**
     *
     * @return
     *     The kamar
     */
    public String getKamar() {
        return kamarPembayar;
    }

    /**
     *
     * @param kamarPembayar
     *     The KamarPembayar
     */
    public void setKamar(String kamarPembayar) {
        this.kamarPembayar = kamarPembayar;
    }

    /**
     *
     * @return
     *     The biay
     */
    public String getBiaya() {
        return biayaPembayaran;
    }

    /**
     *
     * @param biayaPembayaran
     *     The BiayaPembayaran
     */
    public void setBiay(String biayaPembayaran) {
        this.biayaPembayaran = biayaPembayaran;
    }

    /**
     *
     * @return
     *     The period
     */
    public String getPeriod() {
        return periodePembayaran;
    }

    /**
     *
     * @param periodePembayaran
     *     The PeriodePembayaran
     */
    public void setPeriod(String periodePembayaran) {
        this.periodePembayaran = periodePembayaran;
    }

    /**
     *
     * @return
     *     The tgl
     */
    public String getTgl() {
        return tanggalPembayaran;
    }

    /**
     *
     * @param tanggalPembayaran
     *     The TanggalPembayaran
     */
    public void setTgl(String tanggalPembayaran) {
        this.tanggalPembayaran = tanggalPembayaran;
    }

}
