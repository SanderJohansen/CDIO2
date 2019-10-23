package com.company;

public class Diceroller {
    Die obj = new Die();

    public Diceroller() {
        obj.Roll();
    }

    public void Roll(){
        obj.Roll();
    }

    public int face_sum(){
        return obj.GetFacevalue();
    }
}