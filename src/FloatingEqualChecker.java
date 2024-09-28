import java.util.Scanner;
public class FloatingEqualChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double firstValue = sc.nextDouble();
        double secondValue = sc.nextDouble();
        firstValue = Math.round(firstValue * 1000);
        firstValue = firstValue/1000;
        secondValue = Math.round(secondValue * 1000);
        secondValue = secondValue/1000;
        if(firstValue == secondValue){
            System.out.print("They are Same");
        }
        else{
            System.out.print("They are not same");
        }
    }
}
