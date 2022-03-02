package Zoo;

public class Crow extends Bird {

    private String hobby() {
        return "steal shiny things";
    }

    public void  printInfo() {
        System.out.printf("Type: Crow.\t Breath: %s.\t Movement: %s.\t Hobby: %s\n", breath(), movement(), hobby());
    }
}
