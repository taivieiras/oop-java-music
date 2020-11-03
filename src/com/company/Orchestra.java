package com.company;

public abstract class Orchestra {

    private String setBrand;
    private String setType;


    public static String getBrand() {
        return getBrand();
    }

    public void setBrand(String getBrand) {
        this.setBrand = setBrand;
    }


    public static String getType() {
        return getType();
    }

    public void setType(String type) {
        this.setType = setType;
    }

    public abstract void Move(int strings, String instrumental);

}
