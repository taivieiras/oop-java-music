package com.company;
public class Violin extends Orchestra {

    public Violin() {

        Message.DebugMessage("Creating a Violin");

        setBrand("Uknown brand");
        setType("Uknown type");


    }

    public Violin(String setbrand, String settype) {

        Message.DebugMessage("Creating a Violin with brand and type");

        setBrand(setbrand);
        setType(settype);
    }

    @Override
    public String toString() {

        return String.format("ToString() => V2 setbrand: %s, settype: %s", getBrand(), getType());
    }


    @Override
    public void Move(int strings, String instrumental)  {

    }
}