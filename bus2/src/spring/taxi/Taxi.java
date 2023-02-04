package spring.taxi;

import spring.bus.Bus;
import spring.transpost.abstractTransport;

import java.util.Objects;

public class Taxi extends abstractTransport {

    private String destination;
    private int distance;
    private final int basicDistance = 1;
    private int price;
    private int money;
    private final int BASIC_PRICE = 3000;
    private final int DISTANCE_PRICE = 1000;


    public Taxi(int number, int fuel, int speed, int totalPassenger, int distance, String destination) {
        super(number, fuel, speed, totalPassenger);
        this.distance = distance;
        this.destination = destination;
    }

    public void payment(Taxi taxi) {
        if (taxi.distance > basicDistance) {
            price = (taxi.distance - basicDistance) * DISTANCE_PRICE;
            money += price;
        } else {
            price = BASIC_PRICE;
            money += price;
        }
    }

    @Override
    public void status() {
        if (super.isPossible) System.out.println("운행");
        else System.out.println("일반");
    }

    @Override
    public void take(int passenger) {
        this.passengerCount += passenger;
        System.out.println("탑승 승객 수 : " + passenger);
        System.out.println("잔여 승객 수 : " + (totalPassenger - passenger));
    }

    @Override
    public boolean equals(Object o) {
        return super.number == ((Taxi)o).number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

}
