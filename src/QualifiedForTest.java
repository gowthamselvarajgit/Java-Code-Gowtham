import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class QualifiedForTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] mark1 = new int[size];
        int[] mark2 = new int[size];
        int calcForSub = sc.nextInt();
        for (int index = 0; index < size; index++) {
            mark1[index] = sc.nextInt();
        }
        for (int index = 0; index < size; index++) {
            mark2[index] = sc.nextInt();
        }

        Integer[] diff = new Integer[size];
        for (int index = 0; index < size; index++) {
            diff[index] = mark2[index] - mark1[index];
        }

        Arrays.sort(diff,Collections.reverseOrder());
        int sum = 0;
        for (int index = 0; index < calcForSub; index++) {
            sum = sum + diff[index];
        }
        if(sum >= 35){
            System.out.println("Qualified"+sum);
        }
        else{
            System.out.println("Disqualified"+sum);
        }
    }
}
