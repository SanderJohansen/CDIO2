package com.company;

public class Wallet {

    private int Wallet = 1000;

    public int GetWallet() {
        return Wallet;
    }

    public void SetWallet(int modifier){
        Wallet += modifier;
        if(Wallet < 0)
            Wallet = 0;
    }
}
