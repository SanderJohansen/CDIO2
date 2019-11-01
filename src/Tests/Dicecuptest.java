package Tests;

import com.company.Dicecup;

public class Dicecuptest {
    static Dicecup Dicecuptest = new Dicecup();
    static int a2; static int a3; static int a4; static int a5; static int a6; static int a7; static int a8; static int a9; static
    int a10; static int a11; static int a12;

    public static void main(String[]args){
        for(int i = 0; i < 10000; i++){
            Dicecuptest.Roll();
            switch(Dicecuptest.face_sum()) {
                case 2:
                    a2++;
                    break;
                case 3:
                    a3++;
                    break;
                case 4:
                    a4++;
                    break;
                case 5:
                    a5++;
                    break;
                case 6:
                    a6++;
                    break;
                case 7:
                    a7++;
                    break;
                case 8:
                    a8++;
                    break;
                case 9:
                    a9++;
                    break;
                case 10:
                    a10++;
                    break;
                case 11:
                    a11++;
                    break;
                case 12:
                    a12++;
                    break;
            }
        }
        System.out.print("2: " + a2 + " 3: " + a3 + " 4: " + a4 + " 5: " + a5 + " 6: " + a6 + " 7: " + a7);
        System.out.println(" 8: " + a8 + " 9: " + a9 + " 10: " + a10 + " 11: " + a11 + " 12: " + a12);
    }
}
