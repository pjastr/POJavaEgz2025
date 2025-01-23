package healthcare;

public class Hospital {

    private String name;
    private double capacity;

    public Hospital(String name, double capacity) {
        this.name = name != null ? name : "";
        this.capacity = capacity > 0 ? capacity : 50.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name != null ? name : "";
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity > 0 ? capacity : 50.0;
    }

    @Override
    public String toString() {
        if (!name.equals("")) {
            return getClass().getSimpleName()+": Name: "+name+". Capacity: "+capacity+".";
        }
        return getClass().getSimpleName()+": Capacity: "+capacity+".";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Hospital hospital = (Hospital) obj;
        return Double.compare(capacity, hospital.capacity) == 0 && name.equals(hospital.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + Double.hashCode(capacity);
        return result;
    }
}
