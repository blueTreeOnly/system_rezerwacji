public class Guest {

    String firstName;
    String lastName;
    int age;

    public Guest(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        System.out.println("Utworzyłem gościa o takich danych: ");
        System.out.println("Imie: " + firstName);
        System.out.println("Nazwisko: " + lastName);
        System.out.println("Wiek: " + age);

    }
}
