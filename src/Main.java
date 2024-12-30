import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        // Adding vehicles to the fleet
        agency.addVehicle(new Car("C001", "Honda Civic", 50, 20000, true));
        agency.addVehicle(new Motorcycle("M001", "Kawasaki Ninja", 30, 15000, false));
        agency.addVehicle(new Truck("T001", "Ford F-150", 80, 50000, 6000));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        Customer customer = new Customer(name, age);

        System.out.println("Available Vehicles:");
        for (Vehicle vehicle : agency.getAvailableVehicles(customer.getAge())) {
            System.out.println(vehicle);
        }

        System.out.print("Enter the registration number of the vehicle you want to rent: ");
        String registrationNumber = scanner.next();
        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();

        agency.rentVehicle(registrationNumber, days, customer);
        scanner.close();
    }

}
