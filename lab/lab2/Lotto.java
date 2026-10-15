package lab.lab2;
import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        ArrayList<Integer> wyg = new ArrayList<>();
        while (wyg.size()<6){
            int k = (int) (1+ Math.floor(Math.random()*49));
            if (!wyg.contains(k)){
                wyg.add(k);
            }
        }
        System.out.println(wyg);
    }
}
