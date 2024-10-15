import java.util.Scanner;
class VeryAdvancedCal extends AdvancedCalc{
    public double power(int num1,int num2){
        return Math.pow(num1,num2);
    }
}
class AdvancedCalc extends Calc{
    public int multiplication(int num1, int num2){
        return num1 * num2;
    }
    public int division(int num1, int num2){
        return num1/num2;
    }
}
class Calc{
    public int add(int num1, int num2){
        return num1 + num2;
    }
    public int sub(int num1, int num2){
        return num1 - num2;
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        VeryAdvancedCal object = new VeryAdvancedCal();
        int add = object.add(number1,number2);
        int sub = object.sub(number1,number2);
        int multi = object.multiplication(number1,number2);
        int div = object.division(number1,number2);
        double power = object.power(number1,number2);
        System.out.print("Add : " + add + " Sub : " + sub + " Multi : " + multi + " Division : " + div + " Power : " + power );
    }
}