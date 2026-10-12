package lab.lab2;
//zadanie 3

import java.util.ArrayList;
import java.util.Arrays;

public class Zad3Timer {
    static void main(String[] args){
        double start = System.currentTimeMillis();
        int iteracja =0;
        while (1==1) {

            ArrayList<Integer> wyg = Zad1Lotto.losuj();
            int zgod = 0;
            for (int i = 0; i < 6; i++) {
                if (wyg.contains(Integer.parseInt(args[i]))) {
                    zgod++;
                }
            }
            if (zgod>=6){
                System.out.println("Ilość prób:" + iteracja);

                break;
            }
            else{
                iteracja ++;
            }
        }
        double end = System.currentTimeMillis();
        System.out.println("Czas: " + (end-start) + "ms");
    }
}
