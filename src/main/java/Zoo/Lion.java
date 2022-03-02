package Zoo;

public class Lion extends Beast {


    private String activity() {
        return "roar";
    }

    public void printInfo() {
        System.out.printf("Type: Lion.\t Breath: %s.\t Movement: %s.\t Activity: %s\n", breath(), movement(),
                activity());
    }
}
