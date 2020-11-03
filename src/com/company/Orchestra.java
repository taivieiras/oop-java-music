package com.company;

public abstract class Orchestra {

    private String setBrand;
    private String setType;


    public String getbrand() {
        return brand;
    }

    public void setBrand(String getBrand) {
        this.setBrand = setBrand;
    }


    public String getType() {
        return getType;
    }

    public void setType(String type) {
        this.setType = setType;
    }

    public abstract void Move(int strings, String instrumental);

}
