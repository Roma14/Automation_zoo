package Zoo;

public class Parrot extends Bird{

    private String ability() {
        return "repeat bad words";
    }

    @Override
    public void printInfo() {
        System.out.printf("Type: Parrot.\nBreath: %s.\nMovement: %s.\nSuperpower: %s.\n", breath(), movement(),
                ability());
    }
}
