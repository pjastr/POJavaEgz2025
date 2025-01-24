package moto;

public class Vehicle implements Comparable<Vehicle> {
    private String model;
    private double speed;

    public Vehicle(String model, double speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }


    @Override
    public int compareTo(Vehicle obj) {
        int base = model.compareTo(obj.model);
        if (base != 0) {
            return base;
        }
        return Double.compare(speed, obj.speed);
    }
}
