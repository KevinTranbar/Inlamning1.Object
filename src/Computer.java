public abstract class Computer {

    int processorSpeed;
    int memory;
    int storageSize;
    boolean hasDVD;
    boolean wirelessEnabled;
    double basePrice;

    public Computer(int processorSpeed, int memory, int storageSize, boolean hasDVD, boolean wirelessEnabled, double basePrice) {
        this.processorSpeed = processorSpeed;
        this.memory = memory;
        this.storageSize = storageSize;
        this.hasDVD = hasDVD;
        this.wirelessEnabled = wirelessEnabled;
        this.basePrice = basePrice;

    }

    public abstract double calculateProcessorPrice();
    public abstract double calculateMemoryPrice();
    public abstract double calculateStoragePrice();
    public abstract double calculatePrice();
    public abstract double calculateShippingCost(double price);

}
