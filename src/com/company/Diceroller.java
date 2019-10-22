package com.company;

public class Diceroller {
    Die obj = new Die();

    public Diceroller() {
        obj.Roll();
    }

    public int face_sum(){
        obj.Roll();
        return obj.GetFacevalue();
    }
}