public class Desktop extends Computer {

    public Desktop(int processorSpeed, int memory, int storageSize, boolean hasDVD, boolean wirelessEnabled, double basePrice) {
        super(processorSpeed, memory, storageSize, hasDVD, wirelessEnabled, basePrice);
    }

    public double calculateProcessorPrice() {
        return processorSpeed * 25;
    }
    public double calculateMemoryPrice() {
        return memory * 100;
    }
    public double calculateStoragePrice() {
        return  storageSize * 5;
    }
    public double calculatePrice() {

        double total = basePrice;

        total += calculateProcessorPrice();
        total += calculateMemoryPrice();
        total += calculateStoragePrice();

        if (hasDVD) {
            total += 70;
        }
        if (wirelessEnabled) {
            total += 45;
        }

        return total + calculateShippingCost(total);
    }
    public double calculateShippingCost(double total) {
        return total * 0.10;
    }
}
