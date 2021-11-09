package day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private int maxCapacity;
    private List<Passenger> passengers = new ArrayList<>();

    public Plane(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public boolean addPassenger(Passenger passenger) {
        if (passengers.size() < maxCapacity) {
            return passengers.add(passenger);
        }
        else return false;
    }

    public int getNumberOfLuggage() {
        int sum = 0;
        for (Passenger currentPassenger : passengers) {
            sum += currentPassenger.getNumberOfLuggage();
        }
        return sum;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }
}