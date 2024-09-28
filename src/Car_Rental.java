import java.util.Scanner;
public class Car_Rental {
    int CarId;
    String CarType;
    int Rent;

    public void GetCar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CarId: ");
        CarId = sc.nextInt();
        System.out.println("Enter Car Type: ");
        CarType = sc.next();
    }
    public int GetRent(){
        if(CarType.equals("Small Car")){
            Rent = 1000;
        }
        else if(CarType.equals("Van")){
            Rent = 800;
        }
        else{
            Rent =  8500;
        }
        return Rent;
    }
    public void ShowCar(){
        System.out.println("Car Id : "+CarId);
        System.out.println("Car Type : "+CarType);
        System.out.println("Car Rent : "+Rent);
    }
}
class Rental_Information{
    public static void main(String[] args) {
        Car_Rental Object = new Car_Rental();
        Object.GetCar();
        Object.GetRent();
        Object.ShowCar();
    }
}
