package com.company;

public class Board {

    public Board(){
    }

    public void text(int square){
        switch(square){
            case 2: {
                System.out.println("You walk into a tower, and find a pouch with 250 gold in it!");
                break;
            }
            case 3:{
                System.out.println("You fall into a crater, and lose 100 gold coins duing the fall");
                break;
            }
            case 4: {
                System.out.println("You arrive at the palace gates, ....... You earn 100 golden coins");
                break;
            }
            case 5: {
                System.out.println("You get lost in a cold desert, and lose 20 gold coins");
                break;
            }
            case 6: {
                System.out.println("You arrive at a walled city, ..... You get 180 coins");
                break;
            }
            case 7: {
                System.out.println("You arrive at a monastery. They are some cheap fuckers. You get 0 golden coins");
                break;
            }
            case 8: {
                System.out.println("You get lost in dark cave, and somehow you lost 70 golden coins in the dark");
                break;
            }
            case 9: {
                System.out.println("You arrive at some huts in the mountains, the people that live there are friendly and give you 60 golden coins");
                break;
            }
            case 10: {
                System.out.println("You arrive at the horrifying Werewall!! You hastily run away in fright, and lose 80 golden coins in the process");
                break;
            }
            case 11: {
                System.out.println("You fall into the pit, you lose 50 golden coins during the fall ");
                break;
            }
            case 12: {
                System.out.println("You arrive at a goldmine, and decide to start mining. You strike gold! You get 650 golden coins");
                break;
            }
        }
    }
}
