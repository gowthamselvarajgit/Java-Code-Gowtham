import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListLearn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int index = 0; index < size; index++) {
            list.add(sc.nextInt());
        }
        for (int index = 0; index < size; index++) {
            System.out.print(list.get(index) + " ");
        }
    }
}
