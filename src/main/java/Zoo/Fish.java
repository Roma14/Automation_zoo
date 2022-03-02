package Zoo;

public class Fish implements Organism {

    @Override
    public  String breath() {
        return "breathe through the gills";
    }

    @Override
    public  String movement() {
        return "swim";
    }
}
