public class StaticBlock {
    static int number;
    static{
        System.out.println("I am in the Static Block");
        number = 4026;
    }
    public static void main(String[] args) {
        System.out.println("I am in Main Function");
        System.out.println(number);
    }
}
