class SelvarajKanchanaa{
    public void show(){
        System.out.println("In KanchanaSelvaraj");
    }
}

class GowthamS extends SelvarajKanchanaa{
    public void show(){
        System.out.println("In Gowtham");
    }
}

public class UpcastingDowncasting {
    public static void main(String[] args) {
        GowthamS obj = new GowthamS();
        obj.show();

        SelvarajKanchanaa obj1 = new GowthamS(); //upcasting
        obj1.show();

        GowthamS obj2 = (GowthamS) obj1; //downcasting
        obj2.show();

    }
}
