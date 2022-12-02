/**
 * написав final мы указали что этот метод нельзя перенаследовать
 * также можно указывать слово final к методам, тогда их тоже нельзя
 * будет перенаследовать, хотя сам класс перенаследовать можно
 *
 */
public final class ElectricBus extends Bus
{
    private static int countCreatedBus;
    private final double minimalChargeLevel;

    public ElectricBus(double fuelCapacity, double tankFullness, double fuelConsumption, double minimalChargeLevel) {
        super(fuelCapacity, tankFullness, fuelConsumption);
        this.minimalChargeLevel = minimalChargeLevel;
        countCreatedBus++;
    }
    public ElectricBus(double minimalChargeLevel) {
        super();
        this.minimalChargeLevel = minimalChargeLevel;
        countCreatedBus++;
    }
    public ElectricBus() {
        super();
        this.minimalChargeLevel = 5.0;
        countCreatedBus++;
    }

    public static int getCountCreatedBus() {
        return countCreatedBus;
    }

    @Override
    public double reserveRunning() {
        // TODO можно проверять свои какие нибудь параметры

        return super.reserveRunning();
    }

    @Override
    public double runDistance(double distance) {
        // TODO можно проверять свои какие нибудь параметры

        return super.runDistance(distance);
    }


}
