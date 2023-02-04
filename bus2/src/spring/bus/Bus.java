package spring.bus;

import spring.transpost.abstractTransport;


public class Bus extends abstractTransport {

    private final int price = 1500;

    public Bus(int number, int fuel, int speed, int totalPassenger) {
        super(number, fuel, speed, totalPassenger);
        System.out.println(number + "번 버스가 운행준비를 완료했습니다.");
    }

    @Override
    public void take(int passenger) {
        if (this.totalPassenger - this.passengerCount < passenger) {
            System.out.println("최대 승객 수 초과!!");
        } else {
            this.passengerCount += passenger;
            System.out.println("탑승 승객 수 : " + passenger);
            System.out.println("잔여 승객 수 : " + (totalPassenger - passenger));
            System.out.println("요금 확인 : " + price * passenger);
        }

    }
}
