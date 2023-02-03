public class Main {
    public static void main(String[] args) {
        Bus busA = new Bus(1, 30, 30);
        Bus busB = new Bus(2, 20, 30);

        busA.take(2);
        System.out.println("잔여 승객 수 = " + busA.remainCount());
        System.out.println("요금 확인 = " + busA.getPrice());
        busA.setFuel(-50);
        System.out.println("주유량 : " + busA.getFuel());
        busA.getStatus();

        busA.setFuel(10);
        System.out.println("주유량 : " + busA.getFuel());
        busA.take(45);


        busA.take(5);
        System.out.println("잔여 승객 수 = " + busA.remainCount());
        System.out.println("요금 확인 = " + busA.getPrice());

        busA.setFuel(-55);
        System.out.println("주유량 : " + busA.getFuel());
        busA.getStatus();
    }
}