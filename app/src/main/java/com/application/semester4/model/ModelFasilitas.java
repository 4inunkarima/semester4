
package com.application.semester4.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelFasilitas {

    @SerializedName("id_fasilitas")
    @Expose
    private String idFasilitas;

    @SerializedName("nama_fasilitas")
    @Expose
    private String namaFasilitas;

    @SerializedName("status")
    @Expose
    private String statusFasilitas;

    @SerializedName("keterangan")
    @Expose
    private String keteranganFasilitas;

    public static final String id_laporan = "ID_LAPORAN";
    public static final String nama_fasilitas = "ID_LAPORAN";
    public static final String status = "ID_LAPORAN";
    public static final String keterangan = "ID_LAPORAN";

    public ModelFasilitas(String idfasi, String nama, String stat, String ket) {
        this.idFasilitas = idfasi;
        this.namaFasilitas = nama;
        this.statusFasilitas = stat;
        this.keteranganFasilitas = ket;
    }

    /**
     *
     * @return
     *     The idFasilitas
     */
    public String getIdFasi() {
        return idFasilitas;
    }

    /**
     *
     * @param idFasilitas
     *     The id_fasilitas
     */
    public void setIdFasilitas(String idFasilitas) {
        this.idFasilitas = idFasilitas;
    }

    /**
     *
     * @return
     *     The nama
     */
    public String getNama() {
        return namaFasilitas;
    }

    /**
     *
     * @param namaFasilitas
     *     The NamaFasilitas
     */
    public void setNama(String namaFasilitas) {
        this.namaFasilitas = namaFasilitas;
    }

    /**
     *
     * @return
     *     The stat
     */
    public String getStatus() {
        return statusFasilitas;
    }

    /**
     *
     * @param statusFasilitas
     *     The StatusPenghuni
     */
    public void setStatus(String statusFasilitas) {
        this.statusFasilitas = statusFasilitas;
    }

    /**
     *
     * @return
     *     The kett
     */
    public String getKeterangan() {
        return keteranganFasilitas;
    }

    /**
     *
     * @param keteranganFasilitas
     *     The KeteranganFasilitas
     */
    public void setKeterangan(String keteranganFasilitas) {
        this.keteranganFasilitas = keteranganFasilitas;
    }

}
