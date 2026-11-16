package lab.src.main.java.agh.po.animals;

public class Parrot extends Animal {
    public Parrot(String name) {
        super(name, 2);
    }

    @Override
    public String getDescription() {
        return name + legs;


    }
}
