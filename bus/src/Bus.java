public class Bus extends PublicTransport{


    int passengerCount; // 승객 수
    int price = 1500;          // 버스 요금
    int money = 0;

    public Bus(int number) { // 버스생성자에 버스 번호와 최대 승객수
        super(number);
    }


    public int remainCount() {
        return totalPassenger - passengerCount;
    }

    @Override
    public int changeSpeed(int speed) {
        return this.speed = speed;
    }

    @Override
    public int take(int passenger) {   // 승객 탑승

        if (passengerCount + passenger > totalPassenger) {
            System.out.println("최대 승객 수를 초과했습니다.");
        } else {
            passengerCount += passenger;
            this.money += passenger * price;        // 승객 탑승
            System.out.println("탑승 승객 수 = " + passenger);
        }
        return passengerCount;
    }
}
