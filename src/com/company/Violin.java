package com.company;
public class Violin extends Orchestra {

    public Violin() {

        Message.DebugMessage("Creating a Violin");

        setBrand("Uknown brand");
        setType("Uknown type");


    }

    public Violin(String brand, String type) {

        Message.DebugMessage("Creating a Violin with brand and type");

        setBrand(brand);
        setType(type);
    }

    @Override
    public String toString() {

        return String.format("ToString() => V2 setbrand: %s, settype: %s", brand(), getType());
    }


    @Override
    public void Move(int strings, String instrumental)  {

    }
}