public abstract class PublicTransport {

    private int number;
    private int fuel = 100;
    private int speed;
    private boolean status = true;
    private int totalPassenger;

    public PublicTransport(int number, int totalPassenger, int speed) { // 차량 번호 기본생성자 설정
        this.number = number;
        this.speed = speed;
        this.totalPassenger = totalPassenger;

    }

    public abstract int take(int price); // 승객 탑승


    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel += fuel;
        if (this.fuel < 10) System.out.println("주유가 필요합니다.");
        else if (this.fuel < 50) setStatus();
        else setStatus();
    }

    public int setSpeed(int speed) {
        return this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setStatus() {
        this.status = !this.status;
    }

    public boolean getStatus() {
        if (status) System.out.println("상태 : 운행중");
        else System.out.println("상태 : 차고지행");
        return status;
    }

    public int getTotalPassenger() {
        return totalPassenger;
    }
}
