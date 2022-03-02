package Zoo;

public class Parrot extends Bird{

    private String ability() {
        return "repeat bad words";
    }

    public void  printInfo() {
        System.out.printf("Type: Parrot.\t Breath: %s.\t Movement: %s.\t Superpower: %s\n", breath(), movement(),
                ability());
    }
}
