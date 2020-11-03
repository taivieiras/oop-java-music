package com.company;

public class Harp extends Orchestra {

    public Harp() {

        Message.DebugMessage("Creating a Harp");
    }

    @Override
    public String toString() {

        return String.format("harp");
    }

    @Override
    public void Move(int strings, String instrumental) {

        Message.DebugMessage(String.format("There is %s strings on %i ", strings, instrumental));
    }
}