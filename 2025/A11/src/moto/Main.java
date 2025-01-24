package moto;

public class Main {

    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Vehicle("Toyota", 120),
                new Vehicle("BMW", 180),
                new Vehicle("Audi", 200),
                new Vehicle("Mercedes", 220),
                new Vehicle("Ford", 150)
        };
        System.out.println(maxValue(vehicles));
    }

    public static <T extends Comparable<T>>  T maxValue(T[] array){
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
        T max = array[0];
        for(var elem: array){
            if (elem.compareTo(max) > 0) {
                max = elem;
            }
        }
        return max;
    }
}
