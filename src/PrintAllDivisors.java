import java.util.Scanner;

public class PrintAllDivisors {
    public static void main(String []a){
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for(int i =1;i<=num;i++){
            if(num%i==0){
                System.out.println(i + " ");
            }
        }
    }
}
