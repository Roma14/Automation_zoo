package Zoo;

public class Dog extends Beast {
    public void sound() {
        System.out.println("bark");
    }
    private String purpose() {
        return "To be a good boy";
    }

    public void  printInfo() {
        System.out.printf("Type: Dog.\t Breath: %s.\t Movement: %s.\t Main activity: %s\n", breath(), movement(),
                purpose());
    }

}
