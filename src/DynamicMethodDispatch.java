// This is a example of runtime polymorphism as the show method gives different behaviour during runtime.

//PARENT CLASS
class SelvarajKanchana{
    public void show()
    {
        System.out.println("IN KANCHANA SELVARAJ");
    }
}
//CHILD CLASS OF SELVARAJKANCHANA
class Gowtham extends SelvarajKanchana{
//    public void show(){
//        System.out.println("IN GOWTHAM");
//    }
}
//CHILD CLASS OF SELVARAJKANCHANA
class Shreya extends SelvarajKanchana{
    public void show(){
        System.out.println("IN SHREYA");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
         SelvarajKanchana obj = new SelvarajKanchana();
         obj.show();

         obj = new Gowtham();
         obj.show();

         obj = new Shreya();
         obj.show();
    }
}
