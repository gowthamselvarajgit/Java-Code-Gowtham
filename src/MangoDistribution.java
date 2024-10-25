import java.util.Scanner;

public class MangoDistribution {

    // Function to calculate factorial
    static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Function to calculate nCr (combinations)
    static long combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of mangoes and persons
        System.out.print("Enter number of mangoes: ");
        int mangoes = sc.nextInt();
        System.out.print("Enter number of persons: ");
        int persons = sc.nextInt();

        // Apply the stars and bars formula
        long ways = combination(mangoes + persons - 1, persons - 1);
        //long ways = combination(mangoes, persons);
        // Output the result
        System.out.println("Number of ways to distribute mangoes: " + ways);

        sc.close();
}
}