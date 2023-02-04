package spring.taxi;

import spring.transpost.abstractTransport;

import java.util.HashMap;
import java.util.Map;

public class Taxi extends abstractTransport {

    private String destination;
    private Map<String, Integer> distance = new HashMap<>(){
        {
            put("서울역", 2);
            put("구로디지털단지역", 12);
        }
    };
    private final int basicDistance = 1;
    private int price;
    private int money;
    private final int BASIC_PRICE = 3000;
    private final int DISTANCE_PRICE = 1000;
    private boolean boarding = false;


    public Taxi(int number, int fuel, int speed, int totalPassenger) {
        super(number, fuel, speed, totalPassenger);
        System.out.println(number + "번 택시가 운행준비를 완료했습니다.");
    }

    public void payment(String destination) {
        if (distance.get(destination) > basicDistance) {
            price = (distance.get(destination) - basicDistance) * DISTANCE_PRICE + BASIC_PRICE;
            money += price;
        } else {
            price = BASIC_PRICE;
            money += price;
        }
        System.out.println("목적지까지의 거리 : " + distance.get(destination) + "km");
        System.out.println("지불할 요금 : " + price);
    }

    public void getMoney() {
        System.out.println("누적 요금 : " + money);
    }

    @Override
    public void status() {
        if (boarding) {
            if (super.fuel > 10) {
                System.out.println("운행");
                boarding = !boarding;
            }
            else System.out.println("운행 불가");
        }
        else {
            if (super.fuel > 10) System.out.println("빈차");
            else System.out.println("운행 불가");
        }
    }

    @Override
    public void take(int passenger) {
        if (passenger > super.totalPassenger) {
            System.out.println("최대 승객 수 초과");
        } else {
            System.out.println("목적지를 알려주세요!");
        }
    };

    public void take(int passenger, String destination) {
        this.passengerCount += passenger;
        System.out.println("탑승 승객 수 : " + passenger);
        System.out.println("잔여 승객 수 : " + (totalPassenger - passenger));
        System.out.println("기본 요금 확인 : " + this.BASIC_PRICE);
        System.out.println("목적지 확인 : " + destination);
        payment(destination);
        boarding = !boarding;
    }

}
