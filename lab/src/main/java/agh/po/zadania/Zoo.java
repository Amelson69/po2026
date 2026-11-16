package lab.src.main.java.agh.po.zadania;

import lab.src.main.java.agh.po.animals.Animal;
import lab.src.main.java.agh.po.animals.Dog;
import lab.src.main.java.agh.po.animals.Parrot;
import lab.src.main.java.agh.po.animals.Snake;

public class Zoo {
    public void main() {
        Animal[] animals = new Animal[100];
        for (int i = 0; i < animals.length; i++) {
            int r = (int) (Math.random() * 3);
            if(r==0) animals[i] = new Dog("Burek");
            else if (r==1) animals[i] = new Parrot("Jurek");
            else animals[i] = new Snake("Szurek");
        }



        for (Animal animal : animals) {
                System.out.print(animal.getDescription()+", ");
            }
        }
    }

