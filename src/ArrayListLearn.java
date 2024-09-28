import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListLearn {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        for(int index = 0; index < size; index += 1){
            nums.add(scan.nextInt());
        }
        int sum = 0;
        for(int Index = 0; Index < size; Index += 1){
            sum = sum + nums.get(Index);
        }

        System.out.println(nums);
        System.out.println(sum);
    }
}
