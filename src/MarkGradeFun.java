import java.util.Scanner;
/*
Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail
 */
public class MarkGradeFun {
    static void grade(int mark){
        if(mark > 90){
            System.out.println("AA");
        } else if (mark > 80) {
            System.out.println("AB");
        } else if (mark > 70) {
            System.out.println("BB");
        } else if (mark > 60) {
            System.out.println("BC");
        }else if (mark > 50){
            System.out.println("CD");
        } else if (mark > 40) {
            System.out.println("DD");
        }else {
            System.out.println("Fail");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        grade(mark);
    }
}
