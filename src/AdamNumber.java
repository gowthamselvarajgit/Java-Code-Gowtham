import java.util.Scanner;

public class AdamNumber {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        long copy_num = num;

        long Square_num;
        long reverse_square_num = 0;

        long reverse_num = 0;
        long square_reversed_num;

        Square_num = num * num;
        long digit = 0;
        while(Square_num != 0){
            digit = Square_num % 10;
            reverse_square_num = reverse_square_num * 10 + digit;
            Square_num = Square_num / 10;
        }

        while(copy_num != 0){
            digit = copy_num % 10;
            reverse_num = reverse_num * 10 + digit;
            copy_num = copy_num / 10;
        }

        square_reversed_num = reverse_num * reverse_num;

        if(square_reversed_num == reverse_square_num){
            System.out.println("ADAM NUMBER");
        }
        else{
            System.out.println("NOT AN ADAM");
        }
    }
}
