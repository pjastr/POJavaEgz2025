package games;

public class TestGames {
    public static void main(String[] args) {
        Computer c1 = new Computer("TH-570", "Dell", new double[]{7.8, 9.4, 9.2, 4.5, 8.2, 4.3});
        Computer c2 = new Computer("ZenBook", "Asus", new double[]{9.0, 7.3, 5.2, 9.1, 9.2, 8.3});

        System.out.println(c1);
        System.out.println(c2);
        c1.addElement(1.2);
        c2.removeElement(5.2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }
}
