import java.util.Scanner;


public class App {

    public static void main(String[] args) {

        String hotelName = "Overlook";
        int systemVersion = 1;
        boolean isDeveloperVersion = true;

        System.out.print("Witam w systemie rezerwacji dla hotelu");
        System.out.println(hotelName);
        System.out.println("Aktualna wersja systemu: ");
        System.out.println(systemVersion);
        System.out.println("Wersja developerska: ");
        System.out.println(isDeveloperVersion);

        System.out.println("\n=========================\n");

        Scanner input = new Scanner(System.in);
        System.out.println("1. Dodaj nowego gościa.");
        System.out.println("2. Dodaj nowy pokój.");
        System.out.println("3. Wyszukaj gościa.");
        System.out.println("Wybierz opcję: ");

        int option = 0;

        try {
            option = input.nextInt();
        } catch (Exception e) {
            System.out.println("Niepoprawne dane wejściowe, wprowadź liczbę.");
            e.printStackTrace();
        }

        if (option == 1) {
            System.out.println("Tworzymy nowego gościa");
            System.out.println("Podaj imię: ");
            String firstName = input.next();
            System.out.println("Podaj nawisko: ");
            String lastName = input.next();
            System.out.println("Podaj wiek: ");
            int age = 0;
            try {
                age = input.nextInt();
            } catch (Exception e) {
                System.out.println("Niepoprawne dane wejściowe, wprowadź liczbę.");
                e.printStackTrace();
            }

            Guest newGuest  = new Guest(firstName, lastName, age);



        } else if (option == 2) {
            System.out.println("Wybrano opcje 2. ");
        } else if (option == 3) {
            System.out.println("Wybrano opcje 3.");
        } else {
            System.out.println("Wybrano niepoprawną opcję");
        }
    }
}
