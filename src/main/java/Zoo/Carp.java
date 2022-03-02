package Zoo;

public class Carp extends Fish {

    private String purpose() {
        return "Just be";
    }

    public void  printInfo() {
        System.out.printf("Type: Carp.\t Breath: %s.\t Movement: %s.\t Purpose: %s \n", breath(), movement(), purpose());
    }
}
