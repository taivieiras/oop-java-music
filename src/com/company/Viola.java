package com.company;

public class Viola extends Flute {

    public Viola() {

        Message.DebugMessage("Creating a Viola");
    }


    @Override
    public String toString() {

        return String.format("viola");
    }

    @Override
    public void Move(int strings, String instrumental) {

        Message.DebugMessage(String.format("There is %s strings on %i ", strings, instrumental));
    }

}