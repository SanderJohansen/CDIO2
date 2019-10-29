package com.company;

import java.util.Scanner;

public class Gameboard {

    static Diceroller Rolled = new Diceroller();
    static Scanner scan = new Scanner(System.in);
    static Intro_to_game Rules = new Intro_to_game();
    static Board field = new Board();

    public void CallGame() {
        System.out.println("What is player 1´s name?");
        Player Player1 = new Player(scan.nextLine());
        System.out.println("What is player 2´s name?");
        Player Player2 = new  Player(scan.nextLine());

        Rules.Intro(Player1.getname(), Player2.getname());
        System.out.println("----------------------------------------------");

        int i = 0;
        while (Player1.getwallet() <= 3000 && Player2.getwallet() <= 3000) {
            if(i%2==0) {
                System.out.println("It´s " + Player1.getname() +"´s turn, press enter to roll");
            }
            else{
                System.out.println("It´s " + Player2.getname() +"´s turn, press enter to roll");
            }
            String input = scan.nextLine();

            Rolled.Roll();
            System.out.println("you rolled, " + Rolled.face_sum());

            field.text(Rolled.face_sum());
            if(i % 2 == 0) {
                Player1.setwallet(field.points(Rolled.face_sum()));
                System.out.println("your new balance is, " + Player1.getwallet());
            } else {
                Player2.setwallet(field.points(Rolled.face_sum()));
                System.out.println("your new balance is, " + Player2.getwallet());
            }
            i += field.turneffect(Rolled.face_sum());
            System.out.println("----------------------------------------------");
        }
        if (Player1.getwallet() > 3000){
            System.out.println(Player1.getname() + " wins with, " + Player1.getwallet() + " points");
        }
        if (Player2.getwallet() > 3000){
            System.out.println(Player2.getname() + " wins with, " + Player2.getwallet() + " points");
        }
    }
}



