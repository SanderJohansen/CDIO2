package com.company;
/*
public class Gameboard {

    static Wallet Show = new Wallet();
    static Diceroller Rolled = new Diceroller();
    static Intro_to_game Names = new Intro_to_game();



    public static void CallGame() {
        int i = 0;
        if(i%2==0) {
            System.out.println("It´s " + Player1 +"´s turn");
        }
        else{
            System.out.println("It´s " + Player2 +"´s turn");
        }

        while (Show.GetWalletPlayer1(0) <= 3000 && Show.GetWalletPlayer2(0) <= 3000) {
            System.out.println("----------------------------------------------");
            switch (Rolled.face_sum()) {
                case 2:
                    System.out.println("You hit " + Rolled.face_sum());
                    System.out.println("You walk into a tower, and find a pouch with 250 gold in it!");
                    if (i % 2 == 0) {
                        System.out.println(Player1 + "´s new balence is " + Show.GetWalletPlayer1(250));
                    } else {
                        System.out.println(Player2 + "´s new balence is " + Show.GetWalletPlayer1(250));
                    }
                    i = +1;
                    break;
                case 3:
                    System.out.println("You hit " + Rolled.face_sum());
                    System.out.println("You fall into a crater, and lose 100 gold coins duing the fall");
                    if (i % 2 == 0) {
                        System.out.println(Player1 + "´s new balance is " + Show.GetWalletPlayer1(-100));
                    } else {
                        System.out.println(Player2 + "´s new balance is " +Show.GetWalletPlayer1(-100));
                    }
                    i = +1;
                    break;
                case 4:
                    System.out.println("You hit " + Rolled.face_sum());
                    System.out.println("You arrive at the palace gates, ....... You earn 100 golden coins");
                    if (i % 2 == 0) {
                        System.out.println(Player1 + "´s new balance is " + Show.GetWalletPlayer1(250));
                    }else{
                    System.out.println(Player2 + "´s new balance is " + Show.GetWalletPlayer1(250));
                }
                break;
                case 5:
                    System.out.println(+Rolled.face_sum());
                    System.out.println("You get lost in a cold desert, and lose 20 gold coins");
                    if (i % 2 == 0) {
                        System.out.println(Player1 + "´s new balance is " + Show.GetWalletPlayer1(-20));
                    }
                    else{
                    System.out.println(Player2 + "´s new balance is " + Show.GetWalletPlayer1(-20));
                }i = +1;
                break;
                case 6:
                    System.out.println(+Rolled.face_sum());
                    System.out.println("You arrive at a walled city, ..... You get 180 coins");
                    if (i % 2 == 0) {
                        System.out.println(Player1 + "´s new balance is " + Show.GetWalletPlayer1(+180));
                    } else {
                        System.out.println(Player2 + "´s new balance is " + Show.GetWalletPlayer1(+180));
                    }
                    i = +1;
                    break;
                case 7:
                    System.out.println(+Rolled.face_sum());
                    System.out.println("You arrive at a monastery. They are some cheap fuckers. You get 0 golden coins");
                    if (i % 2 == 0) {
                        System.out.println(Player1 + "´s new balance is " + Show.GetWalletPlayer1(0));
                    } else {
                        System.out.println(Player2 + "´s new balance is " + Show.GetWalletPlayer1(0));
                    }
                    i = +1;
                    break;
                case 8:
                    System.out.println(+Rolled.face_sum());
                    System.out.println("You get lost in dark cave, and somehow you lost 70 golden coins in the dark");
                    if (i % 2 == 0) {
                        System.out.println(Player1 + "´s new balance is " + Show.GetWalletPlayer1(-70));
                    } else {
                        System.out.println(Player2 + "´s new balance is " + Show.GetWalletPlayer1(-70));
                    }
                    i = +1;
                    break;
                case 9:
                    System.out.println(+Rolled.face_sum());
                    System.out.println("You arrive at some huts in the mountains, the people that live there are friendly and give you 60 golden coins");
                    if (i % 2 == 0) {
                        System.out.println(Player1 + "´s new balance is " + Show.GetWalletPlayer1(+60));
                    } else {
                        System.out.println(Player2 + "´s new balance is " + Show.GetWalletPlayer1(+60));
                    }
                    i = +1;
                    break;
                case 10:
                    System.out.println(+Rolled.face_sum());
                    System.out.println("You arrive at the horrifying Werewall!! You hastily run away in fright, and lose 80 golden coins in the process");
                    if (i % 2 == 0) {
                        System.out.println(Player1 + "´s new balance is " + Show.GetWalletPlayer1(-80));
                    } else {
                        System.out.println(Player2 + "´s new balance is " + Show.GetWalletPlayer1(-80));
                    }
                    System.out.println("You are running so fast, that you get an extra turn");
                    break;
                case 11:
                    System.out.println(+Rolled.face_sum());
                    System.out.println("You fall into the pit, you lose 50 golden coins during the fall ");
                    if (i % 2 == 0) {
                        System.out.println(Player1 + "´s new balance is " + Show.GetWalletPlayer1(-50));
                    } else {
                        System.out.println(Player2 + "´s new balance is " + Show.GetWalletPlayer1(-50));
                    }
                    i = +1;
                    break;
                case 12:
                    System.out.println(+Rolled.face_sum());
                    System.out.println("You arrive at a goldmine, and decide to start mining. You strike gold! You get 650 golden coins");
                    if (i % 2 == 0) {
                        System.out.println(Player1 + "´s new balance is " + Show.GetWalletPlayer1(650));
                    } else {
                        System.out.println(Player2 + "´s new balance is " + Show.GetWalletPlayer1(650));
                    }
                    i = +1;
                    break;

            }


        }


    }
}

*/


