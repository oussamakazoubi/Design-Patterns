package com.oussama.org.designPatterns.Singleton;

public class Logger {
    private static Logger instance;
    private static int numMessage;

    private Logger() {numMessage=0;}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    public int getNumMessage(){
        return numMessage;
    }

    public String log() {
        numMessage++;
        return "Logged Message "+numMessage;
    }
}

