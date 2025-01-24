package university;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", 3.5));
        students.add(new Student("Alex", 4.2));
        students.add(new Student("Sarah", 3.9));
        students.add(new Student("Sarah", 3.9));
        students.add(new Student("Sarah", 3.9));
        System.out.println(countElements(students, new Student("Sarah", 3.9)));
    }

    public static <T> int countElements(Collection<T> items, T element){
        int count = 0;
        for (T item : items) {
            if (item.equals(element)) {
                count++;
            }
        }
        return count;
    }
}
