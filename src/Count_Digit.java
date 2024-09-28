import java.util.Scanner;

public class Count_Digit {
    public static void main(String []a){
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int count = 0;
        while(num != 0){
            num = num/10;
            count = count+1;
        }
        System.out.println(count);
    }
}
