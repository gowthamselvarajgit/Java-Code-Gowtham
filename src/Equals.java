class EqualEqual{
    public void show(){

    }
}
public class Equals {
    public static void main(String[] args) {
        EqualEqual obj = new EqualEqual();
        EqualEqual obj1 = new EqualEqual();
        obj.show();
        obj1.show();
        if(obj == obj1){
            System.out.print(obj);
            System.out.print(obj1);
        }
        else{
            System.out.print("Nothing");
        }
    }
}
