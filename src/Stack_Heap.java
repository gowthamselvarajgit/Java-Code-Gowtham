import java.util.Scanner;
class Addi{
    int Number = 100; // Stored in Heap
    public int Adder(int num1, int num2)//Stored in the Stack of Adder Method
    {
        return num1 + num2;
    }
}
public class Stack_Heap {
    int Num = 90; // Stored in Heap
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(); //Stored in the Stack of Main Method
        int num2 = sc.nextInt(); //Stored in the Stack of Main Method
        Addi ReferenceVariable = new Addi();
        Addi Reference2 = new Addi(); //New object will be created for the Addi and reference2 will be pointing there
        int result = ReferenceVariable.Adder(num1, num2);// Result will be in stack memory and reference variable will also be in the stack but the Adder function and instant variable will be in heap memory and reference variable store the address of the Adder Method so it directly point there.
        int result2 = Reference2.Adder(num1,100);
        System.out.println(result);
        System.out.print(result2);
    }
}
