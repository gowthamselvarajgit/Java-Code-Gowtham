import java.util.Scanner;
class EncapsulationDataKeeper{
    private String CouplesName;
    private int YearOfLove;

    public void NameSetter(String Name){
        CouplesName = Name;
    }
    public void YearSetter(int Year){
        YearOfLove = Year;
    }
    public String NameGetter(){
        return CouplesName;
    }
    public int YearGetter(){
        return YearOfLove;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        EncapsulationDataKeeper Obj1 = new EncapsulationDataKeeper();
        Scanner sc = new Scanner(System.in);
        Obj1.NameSetter(sc.next());
        Obj1.YearSetter(sc.nextInt());
        String Names = Obj1.NameGetter();
        int Year = Obj1.YearGetter();
        System.out.print(Names + " : " + Year);
    }
}
