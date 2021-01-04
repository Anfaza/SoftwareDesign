package com.company;

public class Mina extends Student {

    public Mina(){
        super("Mina");
    }
    @Override

    public String getOpinion(){

        String msg = "I like learning about %s";
        return msg;

    }

}
