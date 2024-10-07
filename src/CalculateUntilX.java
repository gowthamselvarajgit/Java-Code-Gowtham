import java.util.Scanner;

public class CalculateUntilX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        while(true){
            System.out.print("Enter the operator: ");
            int operator = sc.next().trim().charAt(0);
            if(operator == '+' || operator == '-' || operator == '*' || operator =='/' || operator == '%'){
                System.out.print("Enter Number1 = ");
                int num1 = sc.nextInt();
                System.out.print("Enter Number2 = ");
                int num2 = sc.nextInt();
                if(operator == '+'){
                    result = num1 + num2;
                }
                if (operator == '-'){
                    result = num1 - num2;
                }
                if(operator == '*'){
                    result = num1 * num2;
                }
                if(operator == '/'){
                    if(num2!=0){
                        result = num1/num2;
                    }
                    else {
                        System.out.println("Infinite");
                    }
                }
                if(operator =='%'){
                    result = num1 % num2;
                }
            } else if (operator =='x' || operator == 'X') {
                break;
            }
            else {
                System.out.println("Enter Valid Operator");
            }
            System.out.println("Answer = " + result);
        }
    }
}
