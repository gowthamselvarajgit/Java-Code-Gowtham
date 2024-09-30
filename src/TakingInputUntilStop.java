import java.util.Scanner;

public class TakingInputUntilStop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        int sum = 0;
        while(true){
            input = sc.next();
            if(input.equals("stop")){
                break;
            }
            int number = Integer.parseInt(input);
            sum = sum + number;
        }
        System.out.println("Sum : "+ sum);
    }
}
