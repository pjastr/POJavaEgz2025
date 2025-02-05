package games;

import java.util.Arrays;
import java.util.Objects;

public class Computer {
    private String title;
    private String producer;
    private double[] ratings;

    public Computer(String title, String producer, double[] ratings) {
        this.title = title;
        this.producer = producer;
        this.ratings = ratings.clone();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double[] getRatings() {
        return ratings.clone();
    }

    public void setRatings(double[] ratings) {
        this.ratings = ratings.clone();
    }

    public void addElement(double el){
        double[] list = new double[this.ratings.length+1];
        for(int i=0; i<this.ratings.length; i++){
            list[i] = this.ratings[i];
        }
        list[list.length-1] = el;
        this.ratings = list;
    }

    public void removeElement(double el){
        int index = -1;

        for(int i=0; i<this.ratings.length; i++){
            if(this.ratings[i] == el){
                index = i;
                break;
            }
        }
        if(index == -1){
            throw new IllegalArgumentException("Element not found");
        }
        double[] list = new double[this.ratings.length-1];
        for(int i=0; i<index; i++){
            list[i] = this.ratings[i];
        }
        for(int i=index+1; i<this.ratings.length; i++){
            list[i-1] = this.ratings[i];
        }
        this.ratings = list;

    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + getTitle() + ", " + getProducer() + ", " + Arrays.toString(getRatings()) + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(title, computer.title) && Objects.equals(producer, computer.producer) && Arrays.equals(ratings, computer.ratings);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(title, producer);
        result = 31 * result + Arrays.hashCode(ratings);
        return result;
    }
}
