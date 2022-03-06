package Zoo;

public class Crow extends Bird {

    private String hobby() {
        return "steal shiny things";
    }

    @Override
    public void  printInfo() {
        System.out.printf("Type: Crow.\nBreath: %s.\nMovement: %s.\nHobby: %s\n", breath(), movement(), hobby());
    }
}
