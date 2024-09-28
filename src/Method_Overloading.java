class AddNumber{
    public static int addNum(int num1 , int num2){
        System.out.print("Hai");
        return 0;
    }
    public static int addNum(int num1, int num2, int num3){
        System.out.print("Hello");
        return 0;
    }
    public static int addNum(int num1, int num2, int num3, int num4){
        return 0;
    }
}
public class Method_Overloading {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        AddNumber Obj = new AddNumber();
        int result = AddNumber.addNum(num1,num2,num3);
    }
}
