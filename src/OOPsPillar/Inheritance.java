package OOPsPillar;

import java.util.Scanner;

class Father{
    int property = 10000;
}
class Son extends Father{
    int budget = 10;
}
public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Son obj = new Son();
        System.out.println(obj.property);
    }
}
