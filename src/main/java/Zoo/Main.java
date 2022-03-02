package Zoo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Lion lion1 = new Lion();
        Dog dog1 = new Dog();
        Carp carp1 = new Carp();
        Parrot parrot1 = new Parrot();
        Crow crow1 = new Crow();

        int menuNumber;
        Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("1. Lion\n" + "2. Dog\n" + "3. Carp\n" +
                        "4. Parrot\n" + "5. Crow\n" + "0. Exit\n Please, enter the number");
                menuNumber = scanner.nextInt();
                switch (menuNumber) {
                    case 0:
                        break;
                    case 1:
                        lion1.printInfo();
                        break;
                    case 2:
                        dog1.printInfo();
                        break;
                    case 3:
                        carp1.printInfo();
                        break;
                    case 4:
                        parrot1.printInfo();
                        break;
                    case 5:
                        crow1.printInfo();
                        break;

                }
            } while (menuNumber != 0 );
        scanner.close();
    }
}
