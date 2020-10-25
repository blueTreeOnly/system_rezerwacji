import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        String hotelName = "Overlook";
        int systemVersion = 1;
        boolean isDeveloperVersion = true;

        System.out.print("Witam w systemie rezerwacji dla hotelu " + hotelName);
        System.out.println("Aktualna wersja systemu: " + systemVersion);
        System.out.println("Wersja developerska: " + isDeveloperVersion);

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
            System.out.println("Niepoprawne dane wejsciowe, wprowadz liczbę.");
            e.printStackTrace();
        }

        if (option == 1) {
            System.out.println("Tworzymy nowego gościa.");
            try {
                System.out.print("Podaj imię: ");
                String firstName = input.next();
                System.out.print("Podaj nazwisko: ");
                String lastName = input.next();
                System.out.print("Podaj wiek: ");
                int age = input.nextInt();
                Guest newGuest = new Guest(firstName, lastName, age);
                String guestInfo = String.format("Stworzono gościa: %s %s (%d)",newGuest.firstName, newGuest.lastName, newGuest.age);
                System.out.println(guestInfo);
            } catch (Exception e) {
                System.out.println("Zły wiek, używaj liczb.");
                e.printStackTrace();
            }
        } else if (option == 2) {
            System.out.println("Wybrano opcję 2.");

            try {
                System.out.print("Podaj numer pokoju: ");
                int number = input.nextInt();
                System.out.print("Podaj ilość łóżek");
                int beds = input.nextInt();
                Room newRoom = new Room(number, beds);
                String roomInfo = String.format("Stworzyłem pokój o numerze: %d dla %d osób ", newRoom.number, newRoom.beds );
                System.out.println(roomInfo);

            } catch (Exception e) {
                System.out.println("Używaj liczb");
                e.printStackTrace();
            }
        } else if (option == 3) {
            System.out.println("Wybrano opcję 3.");
        } else {
            System.out.println("Wybrano niepoprawną akcję.");
        }
    }
}