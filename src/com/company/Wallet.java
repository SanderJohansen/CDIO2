package com.company;

public class Wallet {

    private int Wallet = 1000;

    public int GetWallet() {
        return Wallet;
    }

    public String SetWallet(int modifier){
        String a;
        if(modifier < 0) {
            if((Wallet + modifier) < 0){
                a = "remove " + Integer.toString(Wallet) + " from";
                Wallet = 0;
            } else {
                a = "remove " + Integer.toString((-modifier)) + " from";
                Wallet += modifier;
            }
        } else {
            a = "add " + Integer.toString(modifier) + " to";
            Wallet += modifier;
        }
        return a;
    }
}
