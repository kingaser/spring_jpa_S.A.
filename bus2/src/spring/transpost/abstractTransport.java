package spring.transpost;

import spring.bus.Bus;

import java.util.Objects;

public abstract class abstractTransport implements Transport {

    protected int number;
    private int fuel = 100;
    private int speed = 0;
    private int changeSpeed;
    protected int totalPassenger;
    protected int passengerCount;
    protected boolean isPossible;

    public abstractTransport(int number, int fuel, int speed, int totalPassenger) {
        this.number = number;
        this.fuel = fuel;
        this.speed = speed;
        this.totalPassenger = totalPassenger;
        start();
    }

    public void getFuel() {
        System.out.println("주유량 : " + this.fuel);
        if (this.fuel <= 10) {
            System.out.println("주유가 필요합니다!!");
            isPossible = false;
        }
        else if (this.fuel <= 50) isPossible = false;
        else isPossible = true;
    }

    public int setFuel(int fuel) {
        return this.fuel += fuel;
    }

    @Override
    public abstract void status();

    @Override
    public abstract void take(int passenger);

    @Override
    public boolean start() {
        return true;
    }

    @Override
    public void changeSpeed(int speed) {
        this.speed += speed;
        System.out.println("현재 속도 : " + this.speed);
    }

}
