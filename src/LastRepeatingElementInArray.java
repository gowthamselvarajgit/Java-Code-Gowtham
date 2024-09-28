import java.util.Scanner;

public class LastRepeatingElementInArray {
    public static void main(String []a) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[10];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int check = -1;
        for (int i = num - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    check = arr[i];
                    break;
                }
            }
        }
        if (check != -1) {
            System.out.println(check);
        }
        else{
            System.out.println("No Duplicate");
        }
    }
}
