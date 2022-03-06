package Zoo;

public class Lion extends Beast {


    private String activity() {
        return "roar";
    }

    @Override
    public void printInfo() {
        System.out.printf("Type: Lion.\nBreath: %s.\nMovement: %s.\nActivity: %s.\n", breath(), movement(),
                activity());
    }
}
