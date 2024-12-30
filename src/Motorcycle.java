public class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    public Motorcycle(String registrationNumber, String makeAndModel, double dailyRate, int mileage, boolean hasSideCar) {
        super(registrationNumber, makeAndModel, dailyRate, mileage);
        this.hasSideCar = hasSideCar;
    }

    @Override
    public double calculateRentalFee(int days) {
        return getDailyRate() * days + (hasSideCar ? 15 * days : 0); // Sidecar adds extra charge
    }

    @Override
    public boolean canBeRented(int customerAge) {
        return customerAge >= 18; // Minimum age to rent a motorcycle is 18
    }

    @Override
    public String toString() {
        return super.toString() + ", Side Car: " + (hasSideCar ? "Yes" : "No");
    }
}
