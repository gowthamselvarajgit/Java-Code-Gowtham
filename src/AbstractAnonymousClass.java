abstract class Vechicle{
    public abstract void show();
}
public class AbstractAnonymousClass {
    public static void main(String[] args) {
        Vechicle obj = new Vechicle() {
            public void show() {
                System.out.print("In Anonymous Inner class of the abstract one");
            }
        };
        obj.show();
    }
}
