package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;



public class Main{
    static Rules Give = new Rules();
    static Game Play = new Game();
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is player 1´s name?");
        String player1 = scan.nextLine();
        System.out.println("What is player 2´s name?");
        String player2 = scan.nextLine();


        System.out.println("Welcome " + player1 + " and " + player2);

        while(0 == 0) {
            System.out.println("----------------------------------");
            System.out.println("Do you want to start the game, or you want the rules of the game?");
            System.out.println("Type 1 to start, and type 2 for rules");
            int Start_function = scan.nextInt();

            if (Start_function == 2) {
                Give.Therules();

            }
            if (Start_function == 1) {
                System.out.println("Its " + player1 + "´s turn");
                break;
            }
        }
            Play.CallGame();








    }


    }

