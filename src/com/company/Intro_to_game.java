package com.company;

import java.util.Scanner;

public class Intro_to_game {
    private Rules Give = new Rules();
    private Scanner scan = new Scanner(System.in);

    public Intro_to_game(){
    }

    public void Intro(String Player1, String Player2) {

        System.out.println("Welcome " + Player1 + " and " + Player2);
        while (0 == 0) {
            System.out.println("----------------------------------");
            System.out.println("Do you want to start the game, or do you want the rules of the game?");
            System.out.println("Type 1 to start, and type 2 for rules");
            String Start_function = scan.nextLine();

            if (Start_function.equals("2")) {
                Give.Therules();

            }
            if (Start_function.equals("1")) {

                break;
            }
            if (!Start_function.equals("1") && !Start_function.equals("2")){
                System.out.println("You're not very bright, are you?");
            }
        }

    }
}