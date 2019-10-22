package com.company;

public class Wallet {
    private static int Wallet1;
    private static int Wallet2;
    public static int Modifier;

    public Wallet() {
        Wallet1 = 1000;
        Wallet2 = 1000;
    }

    public static int getWallet1() {
        return Wallet1;
    }

    public static int getWallet2() {
        return Wallet2;
    }

    public static void setWallet1(int Modifier) {
        Wallet1 += Modifier;
    }

    public static void setWallet2(int modifier) {
        Wallet2 += modifier;
    }
}