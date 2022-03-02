package Zoo;

public class Bird implements Organism {
    @Override
    public String breath() {
        return "breathe through the beak";
    }

    @Override
    public String movement() {
        return "fly";

    }
}
