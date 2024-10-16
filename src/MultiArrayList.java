import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //Initialization Process
        for (int index = 0; index < size; index++) {
            list.add(new ArrayList<>());
        }
        //Inserting Elements
        for (int index = 0; index < size; index++) {
            for (int indexin = 0; indexin < size; indexin++) {
                list.get(index).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
