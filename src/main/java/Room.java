public class Room {

    int number;
    int beds;

    public Room(int number, int beds){
        this.number = number;
        this.beds = beds;

        System.out.println("Stworzyłem pokój o numerze: " + this.number +" na " + this.beds + " osób.");

    }
}
