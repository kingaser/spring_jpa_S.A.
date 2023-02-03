public class Main {
    public static void main(String[] args) {
        Bus busA = new Bus(1);
        Bus busB = new Bus(2);

        busA.take(2);
        System.out.println("잔여 승객 수 = " + busA.remainCount());
        System.out.println("요금 확인 = " + busA.price);
        busA.useGainFuel(-50);
        System.out.println("주유량 : " + busA.fuel);
        System.out.println(busA.status());

        busA.useGainFuel(10);
        System.out.println("주유량 : " + busA.fuel);
        busA.take(45);


        busA.take(5);
        System.out.println("잔여 승객 수 = " + busA.remainCount());
        System.out.println("요금 확인 = " + busA.price);

        busA.useGainFuel(-55);
        System.out.println("주유량 : " + busA.fuel);
        System.out.println(busA.status());
    }
}