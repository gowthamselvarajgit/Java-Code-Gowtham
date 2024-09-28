class A{
    public void show(){
        System.out.print("In Show");
    }
}
public class AnonymousClass {
    public static void main(String[] args) {
        A reference = new A()
        {
            public void show(){
                System.out.print("In Anonymous show");
            }
        };
        reference.show();
    }
}
