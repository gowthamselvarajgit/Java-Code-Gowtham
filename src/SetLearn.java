import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetLearn {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<Integer>();

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        for(int index = 0; index < size; index += 1){
            nums.add(scan.nextInt());
        }
        System.out.println(nums);
    }
}
