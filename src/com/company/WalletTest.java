package com.company;

import static org.junit.Assert.*;

public class WalletTest {

    Wallet Wallettest = new Wallet();

    @org.junit.Test
    public void setWallet() {
        Wallettest.SetWallet(-1100);
        assertEquals(Wallettest.GetWallet(), 0);
    }


}