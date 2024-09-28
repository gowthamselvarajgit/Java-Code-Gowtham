import java.util.Scanner;
public class Square_Pattern {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();

       for(int row = 1; row <= num; row++){
           for(int column = 1;column <= num; column++){
               System.out.print("*  ");
           }
           System.out.println();
       }
    }
}
