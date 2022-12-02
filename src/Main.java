public class Main
{

    public static void main(String[] args) {

        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        Bus bus3 = new ElectricBus();

        Class objectClass = bus1.getClass();

        Bus ebus1 = new ElectricBus(5);
        ElectricBus ebus2 = new ElectricBus(4);

        System.out.println(objectClass.getName());
        System.out.println(bus1.equals(bus2));
        System.out.println(bus1.equals(bus3));


        ebus1.refuelTank(80);

        System.out.println("Количество автобусов = " + Bus.getCountCreatedBus());
        System.out.println("Количество автобусов = " + ElectricBus.getCountCreatedBus());
        System.out.println();
        System.out.println("Резерв топлива перед выездом = " + ebus1.getTankFullness());
        System.out.println("Резерв топлива после  50 км = " + ebus1.runDistance(50));
        System.out.println("Резерв топлива после 150 км = " + ebus1.runDistance(150));
        System.out.println("Резерв топлива после 350 км = " + ebus1.runDistance(350));
        System.out.println("Запас хода автобуса: " + ebus1.reserveRunning() + " км.");



    }
}
