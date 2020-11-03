package com.company;

public class Bass extends Cello {

    public Bass() {
        Message.DebugMessage("Creating a Bass");
    }

    @Override
    public String toString() {

        return String.format("bass");
    }

    @Override
    public void Move(int strings, String instrumental) {
    }
}