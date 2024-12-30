public class Car extends Vehicle {
    private boolean hasAirConditioning;

    public Car(String registrationNumber, String makeAndModel, double dailyRate, int mileage, boolean hasAirConditioning) {
        super(registrationNumber, makeAndModel, dailyRate, mileage);
        this.hasAirConditioning = hasAirConditioning;
    }

    @Override
    public double calculateRentalFee(int days) {
        return getDailyRate() * days + (hasAirConditioning ? 20 * days : 0); // AC adds extra charge
    }

    @Override
    public boolean canBeRented(int customerAge) {
        return customerAge >= 21; // Minimum age to rent a car is 21
    }

    @Override
    public String toString() {
        return super.toString() + ", Air Conditioning: " + (hasAirConditioning ? "Yes" : "No");
    }
}
