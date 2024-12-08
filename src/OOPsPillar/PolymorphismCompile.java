package OOPsPillar;

import org.w3c.dom.css.CSSUnknownRule;

class Overloading{
    void carType(String gear){
        System.out.println("This is a gear only car");
    }
    void carType(String gear, String manual ){
        System.out.println("This is gear + manual");
    }
    void carType(int budget){
        System.out.println("This is a budget car under " + budget);
    }
    void carType(double mileage){
        System.out.println("This is a car with high mileage " + mileage);
    }
}
public class PolymorphismCompile {
    public static void main(String[] args) {
        Overloading car = new Overloading();
        car.carType("Yes","Yes");
    }
}
