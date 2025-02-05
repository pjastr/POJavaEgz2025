package vehicle;

public class Test {

    public static void main(String[] args) {
        Integer[] tab = {1, 2, 3, 4, 5};
        System.out.println(isDescending(tab));
        Integer[] tab2 = {5, 4, 3, 3, 1};
        System.out.println(isDescending(tab2));
    }

    public static <T extends Comparable<T>> boolean isDescending(T[] tab){
        if(tab == null || tab.length == 0){
            throw new IllegalArgumentException("Tablica jest pusta lub jest nullem");
        }
        for(int i = 0; i < tab.length-1; i++){
            if(tab[i].compareTo(tab[i+1]) < 0){
                return false;
            }
        }
        return true;
    }
}
