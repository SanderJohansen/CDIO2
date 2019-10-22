package com.company;

public class Wallet {


    private int Wallet1 = 1000;
    private int Wallet2 = 1000;

    public static void

    public int GetWalletPlayer1(int Modifier) {
        Wallet1 += Modifier;
        if (Wallet1 < 0)
            Wallet1 = 0;
        return Wallet1;
    }

    public int GetWalletPlayer2(int modifier) {
        Wallet2 += modifier;
        if (Wallet2 < 0)
            Wallet2 = 0;
        return Wallet2;


    }
}
