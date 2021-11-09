package day04;

public class Passenger {
    private String name;
    private String ticketNumber;
    private int numberOfLuggage;

    public Passenger(String name, String ticketNumber, int numberOfLuggage) {
        this.name = name;
        this.ticketNumber = ticketNumber;
        this.numberOfLuggage = numberOfLuggage;
    }

    public String getName() {
        return name;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public int getNumberOfLuggage() {
        return numberOfLuggage;
    }
}