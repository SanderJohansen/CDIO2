package com.company;

import java.util.Scanner;

public class Attributes extends Diceroller{








    public static String Rules(String T) {
        Scanner Myscan = new Scanner(System.in);
        String Playerinput = Myscan.nextLine();


        if (Playerinput == "Rules") {
            System.out.println("You start with a wallet with 1000 golden coins." +
                    "The goal of the game is to get 3000 golden coins" +
                    "You throw to dies and depending on what field you land on you either receive or lose points." );





        }
    }

}








