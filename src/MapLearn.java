import java.util.HashMap;
import java.util.Map;

public class MapLearn {
    public static void main(String[] args) {
        Map<String,Integer> student = new HashMap<>();
        student.put("Gowtham",100);
        student.put("Mahima",10);
        student.put("Pranav", 90);

        System.out.println(student);
        System.out.println(student.keySet());

    }
}
