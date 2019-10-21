package com.company;


public class Diceroller {
    private static int die1;
    private static int die2;

    // konstruerer klassen og ruller terningerne
    public Diceroller() {
        roll();
    }

    // ruller terningerne til tilfædig værdi mellem 1 og 6
    public static void roll(){
        die1 = (int)(Math.random() * 6) + 1;
        die2 = (int)(Math.random() * 6) + 1;
    }

    // henter værdien af terning 1
    public static int face_die1(){
        return die1;
    }

    // henter værdien af terning 2
    public static int face_die2(){
        return die2;
    }

    // henter summen af terningerne
    public static int face_sum(){
        int sum = die1 +die2;
        return sum;
    }
}
