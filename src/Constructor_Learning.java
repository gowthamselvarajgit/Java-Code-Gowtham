import java.util.Scanner;

public class Constructor_Learning {
    public static void main(String[] args) {
        Student gowtham = new Student();
        Student mahima = new Student();
        System.out.println(gowtham.rno + " " + gowtham.name + " " + gowtham.mark);
        System.out.println(mahima.rno + " " + mahima.name + " " + mahima.mark);
    }
}
class Student{
    int rno;
    String name;
    float mark;
    Scanner sc = new Scanner(System.in);
    Student(){
        this.rno = sc.nextInt();
        this.name = sc.next();
        this.mark = sc.nextFloat();
    }
}
