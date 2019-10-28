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

    public int getwallet(int modifier){
        return Playerwallet.GetWallet(modifier);
    }
}
