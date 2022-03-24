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

    @Override
    public  void printInfo() {
        System.out.printf("Breath: %s.\n Movement: %s.", breath(), movement());
    }
}