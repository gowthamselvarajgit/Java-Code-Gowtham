import java.util.Scanner;

public class Constructor_Learning {
    public static void main(String[] args) {
        Student gowtham = new Student(40,"Gowtham",100f);
        Student mahima = new Student(26, "Mahima", 10f);
        System.out.println(gowtham.rno + " " + gowtham.name + " " + gowtham.mark);
        System.out.println(mahima.rno + " " + mahima.name + " " + mahima.mark);
    }
}
class Student{
    int rno;
    String name;
    float mark;
    Scanner sc = new Scanner(System.in);
    //Default Constructor
    Student(){
        this.rno = sc.nextInt();//gowtham.rno = rno;//mahima.rno = rno
        this.name = sc.next();//gowtham.name = name;//mahima.name = name;
        this.mark = sc.nextFloat();//gowtham.mark = mark;//mahima.mark = mark;
    }
    //Parameterized Constructor
    Student(int rno, String name, float mark){
        this.rno = rno; //gowtham.rno = rno;//mahima.rno = rno
        this.name = name;//gowtham.name = name;//mahima.name = name;
        this.mark = mark;//gowtham.mark = mark;//mahima.mark = mark;
    }
}
