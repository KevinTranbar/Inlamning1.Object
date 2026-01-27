package Task6;

public class Laptop extends Computer {

    int screenSize;

    public Laptop(int processorSpeed, int memory, int storageSize, boolean hasDVD, boolean wirelessEnabled, double basePrice, int screenSize) {
        super(processorSpeed, memory, storageSize, hasDVD, wirelessEnabled, basePrice);
        this.screenSize = screenSize;
    }

    public double calculateProcessorPrice() {
        return processorSpeed * 20;
    }
    public double calculateMemoryPrice() {
        return memory * 80;
    }
    public double calculateStoragePrice() {
        return  storageSize * 7;
    }
    public double calculatePrice() {

        double total = basePrice;

        total += calculateProcessorPrice();
        total += calculateMemoryPrice();
        total += calculateStoragePrice();

        if (hasDVD) {
            total += 100;
        }
        if (wirelessEnabled) {
            total += 30;
        }
        total += (screenSize - 13) * 50;

        return total + calculateShippingCost(total);
    }
    public double calculateShippingCost(double total) {
        return total * 0.07;
    }

}
