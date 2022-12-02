import java.util.Objects;

public class Bus
{
    private double tankFullness;
    private final double fuelCapacity;
    private final double fuelConsumption;
    private static int countCreatedBus;

    public Bus(double tankFullness, double fuelCapacity, double fuelConsumption) {
        this.tankFullness = tankFullness;
        this.fuelCapacity = fuelCapacity;
        this.fuelConsumption = fuelConsumption;
        countCreatedBus++;
    }

    public Bus() {
        this.tankFullness = 0.0;
        this.fuelCapacity = 100.0;
        this.fuelConsumption = 7.7;
        countCreatedBus++;
    }

    public double getFuelCapacity() { return fuelCapacity; }
    public double getTankFullness() { return tankFullness; }
    public double getFuelConsumption() { return fuelConsumption; }
    public static int getCountCreatedBus() { return countCreatedBus; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return Double.compare(bus.tankFullness, tankFullness) == 0 && Double.compare(bus.fuelCapacity, fuelCapacity) == 0 && Double.compare(bus.fuelConsumption, fuelConsumption) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tankFullness, fuelCapacity, fuelConsumption);
    }

    public double reserveRunning () {
        double distance = (tankFullness * 100.0) / fuelConsumption;
        distance = Math.round(distance * 100.0) / 100.0;
        return distance;
    }

    public double runDistance (double distance) {
        double spendFuel = (distance / 100.0) * fuelConsumption;
        tankFullness = Math.round((tankFullness - spendFuel) * 100.0) / 100.0;
        return tankFullness;
    }

    public final void refuelTank (double refuelAmount) {
        double total = refuelAmount + tankFullness;
        tankFullness = Math.min(total, fuelCapacity);
    }


}
