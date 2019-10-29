package com.company;

import java.util.Scanner;


public class Intro_to_game {
    static Rules Give = new Rules();
    static Scanner scan = new Scanner(System.in);

    public Intro_to_game(){
    }

    public void Intro(String Player1, String Player2) {

        System.out.println("Welcome " + Player1 + " and " + Player2);
        while (0 == 0) {
            System.out.println("----------------------------------");
            System.out.println("Do you want to start the game, or do you want the rules of the game?");
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

