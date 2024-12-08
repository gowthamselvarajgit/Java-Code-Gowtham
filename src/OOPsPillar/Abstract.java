package OOPsPillar;

import java.util.Scanner;

abstract class Bike{
    abstract void EngineManufacturer();
    abstract void TankCapacity();
}

class Rx100 extends Bike{
    @Override
    void EngineManufacturer(){
        System.out.println("YAMAHA");
    }
    @Override
    void TankCapacity(){
        System.out.println(10);
    }
}
class GT650 extends Bike{
    @Override
    void EngineManufacturer(){
        System.out.println("ROYAL ENFIELD");
    }
    @Override
    void TankCapacity(){
        System.out.println(15);
    }
}
public class Abstract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your bike: 1 for Rx100, 2 for GT650");
        int choice = sc.nextInt();

        Bike bike; // Use polymorphism
        if (choice == 1) {
            bike = new Rx100();
        } else if (choice == 2) {
            bike = new GT650();
        } else {
            System.out.println("Invalid choice!");
            return;
        }

        bike.EngineManufacturer();
        bike.TankCapacity();
    }
}
