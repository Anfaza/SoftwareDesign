package com.company;

public class Piet extends Student {

    public Piet(){
        super("Piet");
    }

    @Override

    public String getOpinion(){
        String msg = "So much fun this lesson %s";
        return msg;
    }
}
