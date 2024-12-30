import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> fleet;

    public RentalAgency() {
        fleet = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public List<Vehicle> getAvailableVehicles(int customerAge) {
        List<Vehicle> availableVehicles = new ArrayList<>();
        for (Vehicle vehicle : fleet) {
            if (vehicle.canBeRented(customerAge)) {
                availableVehicles.add(vehicle);
            }
        }
        return availableVehicles;
    }

    public void rentVehicle(String registrationNumber, int days, Customer customer) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getRegistrationNumber().equals(registrationNumber)) {
                if (vehicle.canBeRented(customer.getAge())) {
                    double cost = vehicle.calculateRentalFee(days);
                    System.out.println("Vehicle rented by " + customer.getName() +
                            ". Total cost: $" + cost);
                    return;
                } else {
                    System.out.println("Customer does not meet the age requirement.");
                    return;
                }
            }
        }
        System.out.println("Vehicle not found.");
    }
}
