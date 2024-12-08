import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Map<Character,Integer> charCountMap = new HashMap<Character,Integer>();
        for (char ch : str.toCharArray()){
            if(charCountMap.containsKey(ch)){
                charCountMap.put(ch,charCountMap.get(ch)+1);
            }
            else {
                charCountMap.put(ch,1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
