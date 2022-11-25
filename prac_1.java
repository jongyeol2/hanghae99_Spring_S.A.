package prac;
public class prac_1 {
    public static void main(String[] args) {
    Bus bus1 = new Bus(100);
        System.out.println("-------------------------");
    bus1.drive();
        System.out.println("-------------------------");
    bus1.passengerPlus(20);
    bus1.passengerPlus(10);
    bus1.passengerPlus(1);
    bus1.passengerPlus(-10);
        System.out.println("-------------------------");
    bus1.fuelChange(5);
    bus1.fuelChange(-100);
        System.out.println("-------------------------");
    bus1.drive();
        System.out.println("-------------------------");
    Bus bus2 = new Bus(100);
    Bus bus3 = new Bus(100);
        System.out.println("-------------------------");
    bus3.speedPlus(10);
    bus3.speedPlus(-50);
    bus3.speedPlus(20);


    }
}
