package lab.src.main.java.agh.po.animals;

public class Snake extends Animal {
    public Snake(String name) {
        super(name, 0);
    }

    @Override
    public String getDescription() {
        return name + legs ;
    }
}
