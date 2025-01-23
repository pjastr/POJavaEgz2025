package healthcare;

public class Clinic extends Hospital{

    private double rating;

    public Clinic(String name, double capacity, double rating) {
        super(name, capacity);
        this.rating = rating >= 0 && rating <= 5 ? rating : 3.0;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating >= 0 && rating <= 5 ? rating : 3.0;
    }

    @Override
    public String toString() {
        return super.toString()+"\nRating: "+rating+".";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;

        Clinic clinic = (Clinic) obj;
        return Double.compare(rating, clinic.rating) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Double.hashCode(rating);
        return result;
    }

}
