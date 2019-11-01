package Tests;

import com.company.Wallet;
import org.junit.Test;

import static org.junit.Assert.*;

public class WalletTest {

    Wallet Wallettest = new Wallet();

    @Test
    public void setWallet1() {
        Wallettest.SetWallet(-1100);
        assertEquals(Wallettest.GetWallet(), 0);
    }

    @Test
    public void setWallet2(){
        Wallettest.SetWallet(200);
        assertEquals(Wallettest.GetWallet(), 1200);
    }

    @Test
    public void setWallet3(){
        Wallettest.SetWallet(-1000);
        assertEquals(Wallettest.GetWallet(), 0);
    }

    @Test
    public void setWallet4(){
        Wallettest.SetWallet(-375);
        assertEquals(Wallettest.GetWallet(), 625);
    }
}