package com.company;

public class Violoncello extends Cello {

    public Violoncello() {
        Message.DebugMessage("Creating a Violoncello");

        setBrand("");
        setType("");
    }

    @Override
    public String toString() {

        return "I am a Violoncello";
    }

    @Override
    public void Move(int strings, String instrumental) {

    }
}