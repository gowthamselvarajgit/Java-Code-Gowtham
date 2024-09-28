import java.util.Scanner;

public class GCD {
    public static int findGcd(int num1 , int num2){
        int smallest;
        smallest = Math.min(num1, num2);
        int factor = 1;
        for(int i =1;i<=smallest;i++){
            if(num1%i==0 && num2%i==0){
                factor = i;
            }
        }
        return factor;
    }
    public static void main(String []a){
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int result = findGcd(num1,num2);
        System.out.println(result);
    }
}
