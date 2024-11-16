public class WrapperClassExample {
    public static void main(String[] args) {
        Integer num1 = 40;
        Integer num2 = 26;
        System.out.println("Num1 : " + num1 + " " + "Num2 : " + num2);
        Integer temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Num1 : " + num1 + " " + "Num2 : " + num2);
        swap(num1,num2);
        System.out.println("Num1 : " + num1 + " " + "Num2 : " + num2);
    }
    static void swap(Integer num1, Integer num2){
        Integer temp = num1;
        num1 = num2;
        num2 = temp;
    }
}
