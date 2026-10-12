package lab.lab2;
//zadanie 2

import java.util.ArrayList;
import java.util.Arrays;

public class Zad2PorWyn {
    static void main(String[] args){
        ArrayList<Integer> wyg = Zad1Lotto.losuj();

        int zgod = 0;
        for (int i=1; i<6;i++) {
            if (wyg.contains(Integer.parseInt(args[i]))) {
                zgod ++;
            }
        }
        System.out.println("Twoje typy: " + Arrays.toString(args));
        System.out.println("Wylosowane liczby: " + wyg);
        System.out.println("Liczba trafień:" + zgod);
        }
    }

