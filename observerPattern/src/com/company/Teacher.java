package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Teacher extends Publisher {
    private ArrayList<String> topics;
    private Random _random;

    public Teacher(){
        this.topics = new ArrayList<>();
        this._random = new Random();

        this.topics.add("Refactorings");
        this.topics.add("Hobbies");
        this.topics.add("Design Patterns");
    };

    public String getTopic(){
        int size = this.topics.size();
        int index = this._random.nextInt(size);

        return this.topics.get(index);
    }

    public void teach(){
        String topic = this.getTopic();
        this.currentTopic = topic;

        String sayHello = "Hello, my name is Anissa, your teacher for today.";
        String intro = String.format("This course is about %s", topic);

        Console.writeLine(sayHello);
        Console.writeLine(intro);

        this.notifyObservers();
    }
}
