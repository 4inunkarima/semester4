
package com.application.semester4.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PesananModel {

    @SerializedName("id_pesanan")
    @Expose
    private String idPesanan;

    @SerializedName("nama_pemesan")
    @Expose
    private String namaPemesan;

    @SerializedName("kamar_pemesan")
    @Expose
    private String kamarPemesan;

    @SerializedName("menu_pesanan")
    @Expose
    private String menuPesanan;

    @SerializedName("tanggal_pesanan")
    @Expose
    private String tanggalPesanan;

    @SerializedName("status_pesanan")
    @Expose
    private String statusPesanan;

    public static final String id_pesanan = "ID_PESANAN";
    public static final String nama_pemesan = "ID_PESANAN";
    public static final String kamar_pemesan = "ID_PESANAN";
    public static final String menu_pesanan = "ID_PESANAN";
    public static final String tanggal_pesanan = "ID_PESANAN";
    public static final String status_pesanan = "ID_PESANAN";

    public PesananModel(String id, String nama, String nokamar,String menu,String tgl,String stat) {
        this.idPesanan = id;
        this.namaPemesan = nama;
        this.kamarPemesan = nokamar;
        this.menuPesanan = menu;
        this.tanggalPesanan = tgl;
        this.statusPesanan = stat;
    }

    /**
     *
     * @return
     *     The idPesanan
     */
    public String getId() {
        return idPesanan;
    }

    /**
     *
     * @param idPesanan
     *     The id_pesanan
     */
    public void setIdPesanan(String idPesanan) {
        this.idPesanan = idPesanan;
    }

    /**
     *
     * @return
     *     The nama
     */
    public String getNama() {
        return namaPemesan;
    }

    /**
     *
     * @param namaPemesan
     *     The NamaPemesan
     */
    public void setNama(String namaPemesan) {
        this.namaPemesan = namaPemesan;
    }

    /**
     *
     * @return
     *     The kamar
     */
    public String getKamar() {
        return kamarPemesan;
    }

    /**
     *
     * @param kamarPemesan
     *     The KamarPemesan
     */
    public void setKamar(String kamarPemesan) {
        this.kamarPemesan = kamarPemesan;
    }

    /**
     *
     * @return
     *     The menu
     */
    public String getMenu() {
        return menuPesanan;
    }

    /**
     *
     * @param menuPesanan
     *     The MenuPesanan
     */
    public void setMenu(String menuPesanan) {
        this.menuPesanan = menuPesanan;
    }

    /**
     *
     * @return
     *     The tgl
     */
    public String getTgl() {
        return tanggalPesanan;
    }

    /**
     *
     * @param tanggalPesanan
     *     The TanggalPesanan
     */
    public void setTgl(String tanggalPesanan) { this.tanggalPesanan = tanggalPesanan;
    }

    /**
     *
     * @return
     *     The stat
     */
    public String getStat() {
        return statusPesanan;
    }

    /**
     *
     * @param statusPesanan
     *     The StatusPesanan
     */
    public void setStat(String statusPesanan) {
        this.statusPesanan = statusPesanan;
    }

}
