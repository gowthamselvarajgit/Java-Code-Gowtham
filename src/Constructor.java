import java.util.Scanner;

class ConstructorMaker{
    private String Name;
    private int Age;

    public ConstructorMaker(){
        System.out.print("Hai I AM In Constructor");//The value will be assigned in the time of object making.
        Name = "Gowtham";
        Age = 20;
    }

    public void NameSetter(String Name){
        this.Name = Name;
    }
    public void AgeSetter(int Age){
        this.Age = Age;
    }
    public String NameGetter(){
        return Name;
    }
    public int AgeGetter(){
        return Age;
    }
}
public class Constructor {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ConstructorMaker obj1 = new ConstructorMaker();
//        obj1.NameSetter(sc.next());
//        obj1.AgeSetter(sc.nextInt());
        ConstructorMaker obj2 = new ConstructorMaker();
        String Name = obj1.NameGetter();
        int Age = obj1.AgeGetter();

        System.out.print(Name + " : " + Age);
    }
}
