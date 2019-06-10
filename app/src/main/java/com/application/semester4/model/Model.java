package com.application.semester4.model;

public class Model {

    private int listImage;
    private String listTitle1;
    private String listTitle2;
    private String listTitle3;

    public Model (int listImage, String listTitle1, String listTitle2, String listTitle3){

        this.listImage = listImage;
        this.listTitle1 = listTitle1;
        this.listTitle2 = listTitle2;
        this.listTitle3 = listTitle3;
    }

    public int getListImage() {
        return listImage;
    }

    public void setListImage(int listImage) {
        this.listImage = listImage;
    }

    public String getListTitle1() {
        return listTitle1;
    }

    public void setListTitle1(String listTitle1) {
        this.listTitle1 = listTitle1;
    }

    public String getListTitle2() {
        return listTitle2;
    }

    public void setListTitle2(String listTitle2) {
        this.listTitle2 = listTitle2;
    }

    public String getListTitle3() {
        return listTitle3;
    }

    public void setListTitle3(String listTitle3) {
        this.listTitle3 = listTitle3;
    }
}
