package gmail.salokin1991;

public class Vehicle {

    String brand;
    String carDriver;
    char emblem;
    int maxSpeed;
    int productYear;
    String color;
    double averageFuelConsumption;
    boolean insurance;


    public Vehicle(String brand, String carDriver, char emblem, int maxSpeed, int productYear, String color,
                   double averageFuelConsumption, boolean insurance) {
        this.brand = brand;
        this.carDriver = carDriver;
        this.emblem = emblem;
        this.maxSpeed = maxSpeed;
        this.productYear = productYear;
        this.color = color;
        this.averageFuelConsumption = averageFuelConsumption;
        this.insurance = insurance;
    }

    public void sayVehicleBrand() {
        System.out.println(brand);
    }

    public void sayVehicleOwner() {
        System.out.println(carDriver);
    }

    public void sayVehicleEmblem() {
        System.out.println(emblem);
    }

    public void sayVexicleMaxSpeed() {
        System.out.println(maxSpeed);
    }

    public void sayVehicleProductionYear() {
        System.out.println(productYear);
    }

    public void sayVehicleColor() {
        System.out.println(color);
    }

    public void sayVehicleFuelConsumption() {
        if (averageFuelConsumption == 0) {
            System.out.println("The fuel tank is constantly full of holes, it was't possible to calculate...");
        } else {
            System.out.println(averageFuelConsumption);
        }
    }

    public void sayVehicleInsurance() {
        if (insurance = true) {
            System.out.println("Yes, everything is fine, drive on");
        } else {
            System.out.println("Okay, stop. Wait a minute..");
        }
    }
}
