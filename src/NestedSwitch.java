import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        sc.nextLine();
        String department = sc.nextLine();
        String name ="";
        String departmentEntry = "";
        switch (empId) {
            case 109 -> name = "Gowtham";
            case 124 -> name = "Mahima Pranavi";
            case 0 -> {
                switch (department) {
                    case "EIE" -> departmentEntry = "EIE Department";
                    case "IT" -> departmentEntry = "IT Department";
                    default -> departmentEntry = "Enter correct Department";
                }
            }
            default -> name = "Enter valid ID";
        }
        System.out.println(name + " "+ " " + departmentEntry);
    }
}
