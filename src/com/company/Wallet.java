package com.company;

public class Wallet {

    private int Wallet = 1000;

    public int GetWallet(int Modifier) {
        Wallet += Modifier;
        if (Wallet < 0)
            Wallet = 0;
        return Wallet;
    }
}
