package com.company;


public class Diceroller {
    private int die1;
    private int die2;

    // konstruerer klassen og ruller terningerne
    public Diceroller() {
        roll();
    }

    // ruller terningerne til tilfædig værdi mellem 1 og 6
    public void roll(){
        die1 = (int)(Math.random() * 6) + 1;
        die2 = (int)(Math.random() * 6) + 1;
    }

    // henter værdien af terning 1
    public int face_die1(){
        return die1;
    }

    // henter værdien af terning 2
    public int face_die2(){
        return die2;
    }

    // henter summen af terningerne
    public int face_sum(){
        return die1 + die2;
    }
}
