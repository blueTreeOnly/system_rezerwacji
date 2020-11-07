import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String hotelName = "Overlook";
        int systemVersion = 1;
        boolean isDeveloperVersion = true;

        showSystemInfo(hotelName, systemVersion, isDeveloperVersion);

        Scanner input = new Scanner(System.in);

        int option = getActionFromUser(input);

        if (option == 1) {
            Guest newGuest = createNewGuest(input);
        } else if (option == 2) {
            Room room = createNewRoom(input);
        } else if (option == 3) {
            System.out.println("Wybrano opcję 3.");
        } else {
            System.out.println("Wybrano niepoprawną akcję.");
        }
    }

    private static void showSystemInfo(String hotelName, int systemVersion, boolean isDeveloperVersion) {

        System.out.print("Witam w systemie rezerwacji dla hotelu " + hotelName);
        System.out.println("Aktualna wersja systemu: " + systemVersion);
        System.out.println("Wersja developerska: " + isDeveloperVersion);
        System.out.println("\n=========================\n");
    }

    private static int getActionFromUser(Scanner in) {

        System.out.println("1. Dodaj nowego gościa.");
        System.out.println("2. Dodaj nowy pokój.");
        System.out.println("3. Wyszukaj gościa.");
        System.out.println("Wybierz opcję: ");
        int option = 0;
        try {
            option = in.nextInt();
        } catch (Exception e) {
            System.out.println("Niepoprawne dane wejsciowe, wprowadz liczbę.");
            e.printStackTrace();
        }
        return option;
    }

    private static Guest createNewGuest(Scanner input) {

        System.out.println("Tworzymy nowego gościa.");
        try {
            System.out.println("Podaj imię: ");
            String firstName = input.next();
            System.out.println("Podaj nazwisko: ");
            String lastName = input.next();
            System.out.println("Podaj wiek: ");
            int age = input.nextInt();
            Guest newGuest = new Guest(firstName, lastName, age);
            System.out.println(newGuest.getInfo());
            return newGuest;
        } catch (Exception e) {
            System.out.println("Zły wiek, używaj liczb.");
            return null;
        }
    }

    private static Room createNewRoom(Scanner input) {
        System.out.println("Tworzymy nowy pokój.");
        try {
            System.out.println("Numer: ");
            int number = input.nextInt();
            BedType bedType = chooseBed(input);
            Room newRoom = new Room(number, bedType);
            System.out.println(newRoom.getInfo());
            return newRoom;
        } catch (Exception e) {
            System.out.println("Używaj liczb.");
            e.printStackTrace();
            return null;
        }

    }

    private static BedType chooseBed(Scanner input) {
        System.out.println("Podaj ilość łóżek: ");
        System.out.println("1. Pojedyncze łóżko");
        System.out.println("2. Podwójne łóżko.");
        System.out.println("3. King Size.");
        System.out.println("Wybierz opcję: ");
        int bedType = input.nextInt();
        if (bedType == 1) {
            return BedType.SINGLE;
        }
        if (bedType == 2) {
            return BedType.DOUBLE;
        }
        if (bedType == 3) {
            return BedType.KING_SIZE;
        } else {
            return null;
        }
    }
}

