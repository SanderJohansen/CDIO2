package com.company;

public class Diceroller {
    Die Die1 = new Die();
    Die Die2 = new Die();

    public Diceroller() {
    }

    public void Roll(){
        Die1.Roll();
        Die2.Roll();
    }

    public int face_sum(){
        return Die1.GetFacevalue() + Die2.GetFacevalue();
    }
}