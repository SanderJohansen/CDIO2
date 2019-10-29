package com.company;

public class Board {

    public Board() {
    }

    public void text(int square) {
        switch (square) {
            case 2:
                System.out.println("You walk into a tower, and find a pouch with 250 gold in it!");
                break;
            case 3:
                System.out.println("You fall into a crater, and lose 100 gold coins during the fall");
                break;
            case 4:
                System.out.println("You arrive at the palace gates. They are very kind and you earn 100 golden coins");
                break;
            case 5:
                System.out.println("You get lost in a cold desert, and lose 20 gold coins");
                break;
            case 6:
                System.out.println("You arrive at a walled city. They don't want you there, so they pay you to leave. You get 180 coins");
                break;
            case 7:
                System.out.println("You arrive at a monastery and unfortunately they don't have any money. You get 0 golden coins");
                break;
            case 8:
                System.out.println("You get lost in a dark cave, and somehow you lost 70 golden coins in the dark");
                break;
            case 9:
                System.out.println("You arrive at some huts in the mountains, the people that live there are friendly and give you 60 golden coins");
                break;
            case 10:
                System.out.println("You arrive at the horrifying Werewall!!! You hastily run away in fright, and lose 80 golden coins in the process");
                break;
            case 11:
                System.out.println("You fall into the pit, you lose 50 golden coins during the fall ");
                break;
            case 12:
                System.out.println("You arrive at a goldmine, and decide to start mining. You strike gold! You get 650 golden coins");
                break;
        }
    }

    public int points(int square) {
        int a = 0;
        switch (square) {
            case 2:
                a = 250;
                break;
            case 3:
                a = -100;
                break;
            case 4:
                a = 100;
                break;
            case 5:
                a = -20;
                break;
            case 6:
                a = 180;
                break;
            case 7:
                a = 0;
                break;
            case 8:
                a = -70;
                break;
            case 9:
                a = 60;
                break;
            case 10:
                a = -80;
                break;
            case 11:
                a = -50;
                break;
            case 12:
                a = 650;
                break;
        }
        return a;
    }

    public int turneffect(int square){
        int a = 0;

        switch (square){
            case 10:
                break;
            default:
                a++;
                break;
        }
        return a;
    }
}