interface Computer{
    void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.print("Coding an Application");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.print("Coding an Application Faster");
    }
}
class Mobile implements Computer{
    public void code(){
        System.out.print("Cannot make an application");
    }
}
class Developer{
    public void devApp(Computer thingToWork){
        thingToWork.code();
    }
}

public class NeedofInterface {
    public static void main(String[] args) {

        Developer Gowtham = new Developer();// Newly employed person

        //options that can be given to the employee to work
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Computer mobile = new Mobile();

        Gowtham.devApp(mobile);
    }
}
