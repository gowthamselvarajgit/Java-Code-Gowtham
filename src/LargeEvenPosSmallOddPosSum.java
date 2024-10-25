import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LargeEvenPosSmallOddPosSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int index = 0; index < size; index++) {
            array[index] = sc.nextInt();
        }

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        even.add(array[0]);

        for (int index = 0; index < size; index++) {
            if(index % 2 == 0){
                even.add(array[index]);
        }
            else {
                odd.add(array[index]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        int sum = even.get(even.size()-2) + odd.get(odd.size()-2);
        System.out.println(sum);
    }
}
