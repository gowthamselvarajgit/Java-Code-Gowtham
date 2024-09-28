interface Design{
    int editingVersion = 10; // Final and Static
    String editorName = "Gowtham"; // Final and Static
    abstract public void photoedit();
    abstract public void videoedit();
}
interface Marketer{
    int  count = 20; // Final and Static
    String marketerName = "XYZ"; // Final and Static
    abstract public void marketing();
}

interface BPO extends Marketer{
    abstract public void marketing();
}
class Person implements Design,Marketer,BPO{

    public void photoedit() {
        System.out.println("Editing the photo");
    }
    public void videoedit(){
        System.out.println("Editing the video");
    }
    public void marketing(){
        System.out.println("Marketing the product");
    }
}
public class InterfaceDemo{
    public static void main(String[] args) {
        Person obj = new Person();

        System.out.println(Design.editingVersion);
        System.out.println(Design.editorName);
        obj.photoedit();
        obj.videoedit();


        System.out.println(Marketer.count);
        System.out.println(Marketer.marketerName);
        Person obj1 = new Person();
        obj.marketing();
    }
}
