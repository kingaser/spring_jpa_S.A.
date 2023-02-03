public abstract class PublicTransport {

    int number;
    int fuel = 100;
    int speed = 0;
    final int totalPassenger = 30;

    public PublicTransport(int number) { // 차량 번호 기본생성자 설정
        this.number = number;
        System.out.println(number + "번 버스객체 만들어짐!");
    }

    public abstract int changeSpeed(int speed);

    public String status() {
        return fuel > 50 ? "상태 = 운행중" : "상태 = 차고지행";
    }

    public abstract int take(int price); // 승객 탑승

    public void useGainFuel(int fuel) {
        this.fuel += fuel;
        if (this.fuel < 10) System.out.println("주유가 필요합니다.");
    }

}
