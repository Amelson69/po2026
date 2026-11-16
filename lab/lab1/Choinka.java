
package lab.lab1;

public class Choinka {
    public static void main(String[] args) {

        int wysokosc = Integer.parseInt(args[0]);

        for (int i = 0; i < wysokosc; i++) {
            String h = "*";

            for (int k = 0; k < i; k++) {
                h = h + '*';
            }

            System.out.println(h);
        }
    }
}
