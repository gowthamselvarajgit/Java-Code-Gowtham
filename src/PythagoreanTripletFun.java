import java.util.Scanner;

public class PythagoreanTripletFun {
    static void checker(int num1, int num2, int num3){
        int max = num1;
        if(num2 > max) max = num2;
        if(num3 > max) max = num3;
        int a;
        int b;
        int c;
        if(num1 == max){
            a = num2;
            b = num3;
            c = max;
        } else if(num2 == max){
            a = num1;
            b = num3;
            c = max;
        } else{
            a = num1;
            b = num2;
            c = max;
        }
        if((a * a) + (b * b) == (c * c)){
            System.out.println("Pythagorean Triplet");
        }
        else {
            System.out.println("Not a Pythagorean Triplet");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        checker(num1,num2,num3);
    }
}
