import java.util.ArrayList;
import java.util.Scanner;
// NEED TO COMPLETE THIS CODE
public class NoSizeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> com = new ArrayList<>();
        while (sc.hasNextInt()){
            com.add(sc.nextInt());
        }
        System.out.println(com);
    }
}
