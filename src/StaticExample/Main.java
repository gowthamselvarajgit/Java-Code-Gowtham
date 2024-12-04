package StaticExample;

public class Main {
    public static void main(String[] args) {
        Human Gowtham = new Human("Gowtham", 20, "Male", Boolean.FALSE);
        Human Mahima = new Human("Mahima", 20, "Female", Boolean.FALSE);
        Human unknown = new Human("unknown", 10, "Female", Boolean.FALSE);
        System.out.println(Gowtham.name);
        System.out.println(Human.college);
        System.out.println(Mahima.name);
        System.out.println(Human.college);
        System.out.println(Human.population);
    }
}
