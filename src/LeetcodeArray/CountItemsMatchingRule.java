package LeetcodeArray;
import java.util.ArrayList;
import java.util.Scanner;

public class CountItemsMatchingRule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<String>> outerList = new ArrayList<>();
        int outerListSize = sc.nextInt();
        int innerListSize = sc.nextInt();
        for(int outer = 0; outer < outerListSize; outer += 1){
            ArrayList<String> innerList = new ArrayList<>();
            for(int inner = 0; inner < innerListSize; inner += 1){
                innerList.add(sc.next());
            }
            outerList.add(innerList);
        }

        String ruleKey = sc.next();
        String ruleValue = sc.next();
        int ruleIndex = switch (ruleKey) {
            case "type" -> 0;
            case "color" -> 1;
            case "name" -> 2;
            default -> 0;
        };
        int count = 0;
        for(int index = 0; index < outerListSize; index += 1){
            if (outerList.get(index).get(ruleIndex).equals(ruleValue)) {
                count++;
            }

        }
        System.out.println(count);
    }
}
