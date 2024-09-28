class Players{
    String name;
    int JerseyNumber;
    static String Country;
    static {
        Country = "India";
        System.out.print("Hai");
    }
    public void show(){
        System.out.println(name + ":" + JerseyNumber + " " + Country);
    }
}
public class Static_Block {
    public static void main(String[] args) {
        Players obj1 = new Players();
        obj1.name = "Gowtham";
        obj1.JerseyNumber = 26;

        Players obj2 = new Players();
        obj2.name = "Mahima";
        obj2.JerseyNumber = 40;

        obj1.show();
        obj2.show();
    }
}
