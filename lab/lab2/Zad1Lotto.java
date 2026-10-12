package lab.lab2;
import java.util.ArrayList;


public class Zad1Lotto {
    public static ArrayList<Integer> losuj() {
        ArrayList<Integer> wyg = new ArrayList<>();
        while (wyg.size() < 6) {
            int k = (int) (1 + Math.floor(Math.random() * 49));
            if (!wyg.contains(k)) {
                wyg.add(k);
            }
        }
        return wyg;
    }

    public static void main(String[] args) {
        System.out.println(losuj());
    }
}
