public abstract class Vehicle {
    private String registrationNumber;
    private String makeAndModel;
    private double dailyRate;
    private int mileage;

    public Vehicle(String registrationNumber, String makeAndModel, double dailyRate, int mileage) {
        this.registrationNumber = registrationNumber;
        this.makeAndModel = makeAndModel;
        this.dailyRate = dailyRate;
        this.mileage = mileage;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public int getMileage() {
        return mileage;
    }

    public abstract double calculateRentalFee(int days);

    public abstract boolean canBeRented(int customerAge);

    @Override
    public String toString() {
        return "Registration: " + registrationNumber + ", Model: " + makeAndModel + 
               ", Daily Rate: $" + dailyRate + ", Mileage: " + mileage + "km";
    }
}
