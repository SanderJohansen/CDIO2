package com.company;

public class Dicecup {
    private Die Die1 = new Die();
    private Die Die2 = new Die();

    public Dicecup() {
    }

    public void Roll(){
        Die1.Roll();
        Die2.Roll();
    }

    public int face_sum(){
        return Die1.GetFacevalue() + Die2.GetFacevalue();
    }
}