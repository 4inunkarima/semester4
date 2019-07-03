
package com.application.semester4.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PenghuniModel {

    @SerializedName("id_penghuni")
    @Expose
    private String idPenghuni;

    @SerializedName("nama_penghuni")
    @Expose
    private String namaPenghuni;

    @SerializedName("kamar_penghuni")
    @Expose
    private String kamarPenghuni;

    public static final String id_penghuni = "ID_PENGHUNI";
    public static final String nama_penghuni = "ID_PENGHUNI";
    public static final String no_penghuni = "ID_PENGHUNI";

    public PenghuniModel(String id, String nama, String nokamar) {
        this.idPenghuni = id;
        this.namaPenghuni = nama;
        this.kamarPenghuni = nokamar;
    }

    /**
     *
     * @return
     *     The idPenghuni
     */
    public String getId() {
        return idPenghuni;
    }

    /**
     *
     * @param idPenghuni
     *     The id_penghuni
     */
    public void setIdPenghuni(String idPenghuni) {
        this.idPenghuni = idPenghuni;
    }

    /**
     *
     * @return
     *     The nama
     */
    public String getNama() {
        return namaPenghuni;
    }

    /**
     *
     * @param namaPenghuni
     *     The NamaPenghuni
     */
    public void setNama(String namaPenghuni) {
        this.namaPenghuni = namaPenghuni;
    }

    /**
     *
     * @return
     *     The kamar
     */
    public String getKamar() {
        return kamarPenghuni;
    }

    /**
     *
     * @param kamarPenghuni
     *     The KamarPenghuni
     */
    public void setKamar(String kamarPenghuni) {
        this.kamarPenghuni = kamarPenghuni;
    }

}
