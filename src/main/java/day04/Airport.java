package day04;

public class Airport {
    public static void main(String[] args) {
        Plane plane = new Plane(2);
        Passenger passenger = new Passenger("Töhötöm", "kghlvnsd", 4);

        plane.addPassenger(passenger);
        System.out.println(passenger.getName());
        Passenger passenger1 = new Passenger("Géza", "jslevbs", 2);
        plane.addPassenger(passenger1);
        Passenger passenger2 = new Passenger("Béla", "jsrevbs", 2);
        System.out.println(plane.addPassenger(passenger2));
    }
}