package com.company;
import java.util.Scanner;

public class Player {
    private String playername;
    private Wallet Playerwallet = new Wallet();

    public Player(String name){
        playername = name;
    }

    public String getname(){
        return playername;
    }

    public int getwallet(){
        return Playerwallet.GetWallet();
    }

    public String setwallet(int modifier){
        return Playerwallet.SetWallet(modifier);
    }

    public String tostring(){
        return playername + " wins with " + Playerwallet.Tostring() + " golden coins";
    }
}