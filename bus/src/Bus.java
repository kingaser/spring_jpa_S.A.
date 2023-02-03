public class Bus extends PublicTransport{


    private int passengerCount; // 승객 수
    private int price = 1500;          // 버스 요금
    private int money = 0;

    public Bus(int number, int totalPassenger, int speed) { // 버스생성자에 버스 번호와 최대 승객수
        super(number, totalPassenger, speed);
        System.out.println(number + "번 버스객체 만들어짐!");
    }


    public int remainCount() {
        return getTotalPassenger() - passengerCount;
    }

    @Override
    public int take(int passenger) {   // 승객 탑승

        if (passenger + passenger > getTotalPassenger()) {
            System.out.println("최대 승객 수를 초과했습니다.");
        } else {
            passengerCount += passenger;
            this.money += passenger * price;        // 승객 탑승
            System.out.println("탑승 승객 수 = " + passenger);
        }
        return passengerCount;
    }
    public void status() {
        if (getStatus()) System.out.println("상태 : 운행중");
        else System.out.println("상태 : 차고지행");
    }

    public int getPrice() {
        return price;
    }

    public int getMoney() {
        return money;
    }

}
