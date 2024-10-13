public class Shadowing {
    static int num = 10;// This will be shadowed at line 6
    public static void main(String[] args) {
        System.out.println(num);

        int num = 1000;// Here the higher level data will be shadowed by lower level data this is called as shadowing.
        System.out.println(num);

        fun();
    }
    static void fun(){
        System.out.println(num);
    }
}
