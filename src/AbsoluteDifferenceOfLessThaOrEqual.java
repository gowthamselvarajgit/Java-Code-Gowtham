import java.util.Scanner;

public class AbsoluteDifferenceOfLessThaOrEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int index = 0; index < size; index++) {
            array[index] = sc.nextInt();
        }
        int num = sc.nextInt();
        int diff = sc.nextInt();
        int count = 0;
        for (int index = 0; index < size; index++) {
            if(Math.abs(array[index]-num) <= diff){
                count += 1;
            }
        }
        System.out.println(count);
    }
}
