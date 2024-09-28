import java.util.Scanner;
class Parameterized_Constructor_Maker{
    private String Name;
    private int Age;

    public Parameterized_Constructor_Maker(){
        System.out.print("Hai I AM In Constructor");//The value will be assigned in the time of object making.
        Name = "Gowtham";
        Age = 20;
    }
    public Parameterized_Constructor_Maker(String Name, int Age){
        System.out.println("Chellam");//The value will be assigned in the time of object making.
        this.Name = Name;
        this.Age = Age;
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
public class Parameterized_Constructor {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Parameterized_Constructor_Maker obj1 = new Parameterized_Constructor_Maker();
        obj1.NameSetter(sc.next());
        obj1.AgeSetter(sc.nextInt());

        String ObjectName = sc.next();
        int ObjectAge = sc.nextInt();

        Parameterized_Constructor_Maker obj2 = new Parameterized_Constructor_Maker(ObjectName,ObjectAge);

        String Name = obj1.NameGetter();
        int Age = obj1.AgeGetter();
        String Name2 = obj2.NameGetter();
        int Age2 = obj2.AgeGetter();
        System.out.print(Name + " : " + Age);
        System.out.print(Name2 + " : " + Age2);
    }
}

