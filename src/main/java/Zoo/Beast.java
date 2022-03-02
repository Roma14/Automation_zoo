package Zoo;

public class Beast implements Organism {

    @Override
    public  String breath() {
        return "breathe through the nose";
    }

    @Override
    public  String movement() {
        return "run";
    }
}
