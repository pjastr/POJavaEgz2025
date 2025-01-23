package healthcare;

public class TestHospital {

    public static void main(String[] args) {
        Hospital h1 = new Hospital("Hospital 1", 100);
        Hospital h2 = new Hospital("Hospital 2", 200);
        Hospital h3 = new Hospital("Hospital 1", 100);
        Clinic c1 = new Clinic("Clinic 1", 50, 4.5);
        Clinic c2 = new Clinic("Hospital 1", 100, 3.5);
        System.out.println(h1.equals(h2));
        System.out.println(h1.equals(h3));
        System.out.println(h1.equals(c1));
        System.out.println(h1.equals(c2));
        System.out.println(c1.equals(c2));
    }
}
