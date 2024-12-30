public class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(String registrationNumber, String makeAndModel, double dailyRate, int mileage, int loadCapacity) {
        super(registrationNumber, makeAndModel, dailyRate, mileage);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateRentalFee(int days) {
        return getDailyRate() * days + (loadCapacity > 5000 ? 50 * days : 0); // Extra charge for heavy trucks
    }

    @Override
    public boolean canBeRented(int customerAge) {
        return customerAge >= 25; // Minimum age to rent a truck is 25
    }

    @Override
    public String toString() {
        return super.toString() + ", Load Capacity: " + loadCapacity + "kg";
    }
}
