package spring;

import spring.taxi.Taxi;

public class TestTaxi {
    public static void main(String[] args) {
        Taxi taxi1 = new Taxi(1, 100, 0, 4);
        Taxi taxi2 = new Taxi(1, 100, 0, 4);
        if (taxi1.equals(taxi2)) System.out.println("같은 번호의 택시입니다.");
        else System.out.println("다른 번호의 택시입니다.");
        taxi1.getFuel();
        taxi1.status();
        taxi1.take(2, "서울역");
        taxi1.status();
        taxi1.setFuel(-80);
        taxi1.setFuel(20);
        taxi1.getMoney();
        taxi1.take(5);
        taxi1.take(3, "구로디지털단지역");
        taxi1.status();
        taxi1.setFuel(-20);
        taxi1.getFuel();
        taxi1.getMoney();
        taxi1.status();
        taxi1.setFuel(-20);
        taxi1.getFuel();
        taxi1.status();
    }
}
