import java.util.Scanner;

enum Sapadu{
    Parotta(0), Biriyani(0), ChickenRice(0), ChillyChicken(0);//These are named constants
    private int price;

    private Sapadu(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class Enum {
    public static void main(String[] args) {
//       Sapadu saptuko = Sapadu.Biriyani;
//        System.out.print("saptuko " + saptuko + " price " + saptuko.getPrice());
        Sapadu[] saptuko = Sapadu.values();
        Scanner sc = new Scanner(System.in);
        for(int Index = 0; Index < Sapadu.values().length; Index += 1){
            saptuko[Index].setPrice(sc.nextInt());
        }
        for(int Index = 0; Index < Sapadu.values().length; Index += 1){
            System.out.println(saptuko[Index] + " " + saptuko[Index].getPrice());
        }
    }
}
