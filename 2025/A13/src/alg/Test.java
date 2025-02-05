package alg;

import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {
        TreeSet<String> elements = new TreeSet<>();
        elements.add("a");
        elements.add("b");
        elements.add(new String("c"));
        elements.add("c");
        System.out.println(isUnique(elements));
    }

    public static <E> boolean isUnique(TreeSet<E> elements) {
        if (elements == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        return true; // na mocy definicji
    }
}
