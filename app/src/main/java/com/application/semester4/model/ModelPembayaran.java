package com.application.semester4.model;

public class ModelPembayaran {

    private int listImage;
    private String listTitle1;
    private String listTitle2;
    private String listTitle3;
    private String listTitle4;
    private String listTitle5;
    private String listTitle6;
    private String listTitle7;
    private String listTitle8;


    public ModelPembayaran (int listImage, String listTitle1, String listTitle2, String listTitle3, String listTitle4, String listTitle5, String listTitle6, String listTitle7, String listTitle8){

        this.listImage = listImage;
        this.listTitle1 = listTitle1;
        this.listTitle2 = listTitle2;
        this.listTitle3 = listTitle3;
        this.listTitle4 = listTitle4;
        this.listTitle5 = listTitle5;
        this.listTitle6 = listTitle6;
        this.listTitle7 = listTitle7;
        this.listTitle8 = listTitle8;
    }
    //image
    public int getListImage() {
        return listImage;
    }

    public void setListImage(int listImage) {
        this.listImage = listImage;
    }
    //txt1
    public String getListTitle1() {
        return listTitle1;
    }

    public void setListTitle1(String listTitle1) {
        this.listTitle1 = listTitle1;
    }
    //txt2
    public String getListTitle2() {
        return listTitle2;
    }

    public void setListTitle2(String listTitle2) {
        this.listTitle2 = listTitle2;
    }
    //txt3
    public String getListTitle3() {
        return listTitle3;
    }

    public void setListTitle3(String listTitle3) {
        this.listTitle3 = listTitle3;
    }
    //txt4
    public String getListTitle4() {
        return listTitle4;
    }

    public void setListTitle4(String listTitle3) {
        this.listTitle3 = listTitle4;
    }
    //txt5
    public String getListTitle5() {
        return listTitle5;
    }

    public void setListTitle5(String listTitle3) {
        this.listTitle3 = listTitle5;
    }
    //txt6
    public String getListTitle6() {
        return listTitle6;
    }

    public void setListTitle6(String listTitle6) {
        this.listTitle3 = listTitle6;
    }
    //txt7
    public String getListTitle7() {
        return listTitle7;
    }

    public void setListTitle7(String listTitle7) {
        this.listTitle3 = listTitle7;
    }
    //txt8
    public String getListTitle8() {
        return listTitle8;
    }

    public void setListTitle8(String listTitle8) {
        this.listTitle3 = listTitle8;
    }
}
