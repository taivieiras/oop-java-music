package com.company;

public  class Message {

    static boolean showMessage = true;

    public static void DebugMessage(String message) {

        if (showMessage) { System.out.println(message); }
    }
}