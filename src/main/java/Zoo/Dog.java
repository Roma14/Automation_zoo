package Zoo;

public class Dog extends Beast {
    public void sound() {
        System.out.println("bark");
    }
    private String purpose() {
        return "To be a good boy";
    }

    @Override
    public void printInfo() {
        System.out.printf("Type: Dog.\nBreath: %s.\nMovement: %s.\nMain activity: %s.\n", breath(), movement(),
                purpose());
    }

}
