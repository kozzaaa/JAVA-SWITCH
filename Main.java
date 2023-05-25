import java.util.Scanner;

public class Main {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoje imię: ");
        String name = scanner.next();
        System.out.println("Witaj " + name);

        Float x, y;

        System.out.println("Podaj pierwsza liczbe: ");
        x = scanner.nextFloat();

        System.out.println("Podaj druga liczbe: ");
        y = scanner.nextFloat();

        System.out.println(name + " masz do wyboru: 1. Mnozenie, 2.Dzielnie");

        Integer wybor;

        wybor = scanner.nextInt();

        switch (wybor) {
            case 1:
                System.out.println(x * y);
            break;

            case 2:
                System.out.println(x / y);
            break;

            default:
                System.out.println("Nie ma takiego wyboru");
        }
    }
}
