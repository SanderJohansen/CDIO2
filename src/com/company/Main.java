package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;



public class Main extends Attributes{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is player 1´s name?");
        String player1 = scan.nextLine();
        System.out.println("\"What is player 2´s name?\"");
        String player2 = scan.nextLine();


        System.out.println("Welcome " + player1 + " and " + player2);

        System.out.println("Do you want the rules of the game, or do you want to start the game?");
        System.out.println("Type Rules for rules, and Start to start");


        String Start_function = scan.nextLine();


        if(Start_function == "Rules"){
            Rules();

        }






    }


    }

