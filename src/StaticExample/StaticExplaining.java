package StaticExample;


class Humans{
    String name;
    int age;
    String place;
    static int population;
    Humans(String name, int age, String place){
        System.out.println("I am Constructor");
        this.name = name;
        this.age = age;
        this.place = place;
        Humans.population+=1;
    }
}
public class StaticExplaining {
    public static void main(String[] args) {
        Humans gowtham = new Humans("gowtham",20,"DassapagoundanPudur");
        Humans mahima = new Humans("Mahima",20,"udumal");
        Humans paps = new Humans("Paps",10,"udupudur");
        System.out.println(Humans.population);
//        System.out.println(gowtham.name);
    }
}
