package com.company;

import java.util.Scanner;


public class Intro_to_game {
    static Rules Give = new Rules();


    public void Intro() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is player 1´s name?");
        String Player1 = scan.nextLine();
        System.out.println("What is player 2´s name?");
        String Player2 = scan.nextLine();


        System.out.println("Welcome " + Player1 + " and " + Player2);
        while (0 == 0) {
            System.out.println("----------------------------------");
            System.out.println("Do you want to start the game, or you want the rules of the game?");
            System.out.println("Type 1 to start, and type 2 for rules");
            int Start_function = scan.nextInt();

            if (Start_function == 2) {
                Give.Therules();

            }
            if (Start_function == 1) {

                break;
            }
        }


    }
}

