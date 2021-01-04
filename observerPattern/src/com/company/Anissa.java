package com.company;

public class Anissa extends Student {
    public  Anissa(){
        super("Anissa");
    }
    @Override
     public String getOpinion(){
        String msg = "I really like %s";

        return msg;
    }
}
