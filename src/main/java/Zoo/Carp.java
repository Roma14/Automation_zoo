package Zoo;

public class Carp extends Fish {

    private String purpose() {
        return "Just be";
    }

    @Override
    public void  printInfo() {
        System.out.printf("Type: Carp.\nBreath: %s.\nMovement: %s.\nPurpose: %s.\n", breath(), movement(), purpose());
    }
}
