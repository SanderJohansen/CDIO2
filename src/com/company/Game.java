package com.company;

public class Game {

    public static void CallGame() {
        while (getWallet1() <= 3000 && getWallet2() <= 3000) {
            switch (face_sum()) {
                case 2:
                    System.out.println();
                    System.out.println("You walk into a tower, and find a pouch with 250 gold in it!");
                    break;
                case 3:
                    System.out.println();
                    System.out.println("You fall into a crater, and lose 100 gold coins duing the fall");
                    break;
                case 4:
                    System.out.println("");
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    System.out.println();
                    break;
                case 6:
                    System.out.println();
                    System.out.println();
                    break;
                case 7:
                    System.out.println();
                    System.out.println();
                    break;
                case 8:
                    System.out.println();
                    System.out.println();
                    break;
                case 9:
                    System.out.println();
                    System.out.println();
                    break;
                case 10:
                    System.out.println();
                    System.out.println();
                    break;
                case 11:
                    System.out.println();
                    System.out.println();
                    break;
                case 12:
                    System.out.println();
                    System.out.println();
                    break;

            }
        }

        }


    }

