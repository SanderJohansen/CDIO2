package com.company;
import java.util.Scanner;

public class Player {
    public String playername;
    Wallet Playerwallet = new Wallet();

    public Player(String name){
        playername = name;
    }

    public String getname(){
        return playername;
    }

    public int getwallet(){
        return Playerwallet.GetWallet();
    }

    public void setwallet(int modifier){
        Playerwallet.SetWallet(modifier);
    }
}
