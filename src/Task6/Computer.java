package Task6;

abstract class Computer {

    protected int processorSpeed;
    protected int memory;
    protected int storageSize;
    protected boolean hasDVD;
    protected boolean wirelessEnabled;
    protected double basePrice;

    public Computer(int processorSpeed, int memory, int storageSize, boolean hasDVD, boolean wirelessEnabled, double basePrice) {
        this.processorSpeed = processorSpeed;
        this.memory = memory;
        this.storageSize = storageSize;
        this.hasDVD = hasDVD;
        this.wirelessEnabled = wirelessEnabled;
        this.basePrice = basePrice;

    }

    protected abstract double calculateProcessorPrice();
    protected abstract double calculateMemoryPrice();
    protected abstract double calculateStoragePrice();
    protected abstract double calculatePrice();
    protected abstract double calculateShippingCost(double price);

}
