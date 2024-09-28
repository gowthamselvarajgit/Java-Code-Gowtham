abstract class Car{
    public abstract void drive();
    public void music(){
        System.out.println("Music is playing");
    }
    public void sleep(){
        System.out.println("I am sleeping");
    }
}

class WagonR extends Car{
    public void drive(){
        System.out.println("Driving in fuel");
    }
}
class Tesla extends Car{
    public void drive(){
        System.out.println("Driving in Electric");
    }
}
public class Abstract {
    public static void main(String[] args) {
    Car obj = new WagonR();
    obj.drive();

    obj = new Tesla();
    obj.drive();
    }
}
