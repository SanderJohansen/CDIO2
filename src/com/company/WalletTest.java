package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class WalletTest {

    int Wallet1 = 1000;
    int Modifier = -2000;


    WalletTest(){
        Wallet1 += Modifier;
        if (Wallet1 < 0)
            Wallet1 = 0;
    }

    @Test
    public void getWalletPlayer1() {

        assertTrue(Wallet1>=0);



    }
}