public class PassByValue {
    public static void main(String[] args) {
//        int a = 10;
//        System.out.println("Value of a " + a);
//        int b = 0;
//        System.out.println("Value of b " + b);
//        b = a;
//        System.out.println("Value of b after assigning the value of a to b " + b);
//        b = 100;
//        System.out.println("Value of b after changing the value of it " + b);
//        System.out.println("Value of a after changing the value of b " + a);
//        System.out.println("There is no change in a because the value is copied and stored in b and changes done in b not in a.");
        String name = "Gowtham";
        System.out.println(name);
        namechanger(name);
        System.out.println(name);
    }
    static void namechanger(String name){
        name = "Mahima";
    }
}
