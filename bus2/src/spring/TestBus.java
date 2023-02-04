package spring;

import spring.bus.Bus;

public class TestBus {
    public static void main(String[] args) {
        Bus bus1 = new Bus(1, 100, 20, 30);
        Bus bus2 = new Bus(1, 100, 20, 30);
        if (bus1.equals(bus2)) System.out.println("같은 버스 입니다. 두번째 버스는 운행을 중단합니다.");
        bus1.take(2);
        bus1.setFuel(-50);
        bus1.getFuel();
        bus1.status();
        bus1.setFuel(10);
        bus1.getFuel();
        bus1.status();
        bus1.take(45);
        bus1.take(5);
        bus1.setFuel(-55);
        bus1.status();
        bus1.getFuel();
    }
}
