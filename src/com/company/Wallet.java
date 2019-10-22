package com.company;

public class Wallet {
    private int Wallet1;
    private int Wallet2;
    public int Modifier;

    public Wallet() {
        Wallet1 = 1000;
        Wallet2 = 1000;
    }

    public int getWallet1() {
        return Wallet1;
    }

    public int getWallet2() {
        return Wallet2;
    }

    public void setWallet1(int Modifier) {
        Wallet1 += Modifier;
        if(Wallet1 < 0)
            Wallet1 = 0;
    }

    public void setWallet2(int modifier) {
        Wallet2 += modifier;
        if(Wallet2 < 0)
            Wallet2 = 0;
    }
}