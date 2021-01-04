package com.company;

public class Main {

    public static void main(String[] args) {
	Teacher andries = new Teacher();
	Student marie = new Marie();
	Student piet = new Piet();
	Student mina = new Mina();
	Student anissa = new Anissa();


	andries.subscribe(marie);
	andries.subscribe(piet);
	andries.subscribe(mina);
	andries.subscribe(anissa);



	andries.teach();

		andries.unsubscribe(anissa);

		andries.teach();
    }
}
