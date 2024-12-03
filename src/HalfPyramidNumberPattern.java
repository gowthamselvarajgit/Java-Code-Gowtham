import java.util.Scanner;

public class HalfPyramidNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int row = 1; row <= number; row += 1){
            for (int column = 1; column <= row; column++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
