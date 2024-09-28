interface Flower{
    public abstract void givenFlower();
}
class Sunflower implements Flower{
    public void givenFlower(){
        System.out.print("Sunflower");
    }
}
class Hibiscus implements Flower{
    public void givenFlower(){
        System.out.print("Hibiscus");
    }
}
class Lotus implements Flower{
    public void givenFlower(){
        System.out.print("Lotus");
    }
}
class Rose implements Flower{
    public void givenFlower(){
        System.out.print("Rose");
    }
}
class GowthamProp{
    public void propsal(Flower buy){
        buy.givenFlower();
    }
}
public class Proposal {
    public static void main(String[] args) {
        GowthamProp Person = new GowthamProp();
        Flower rose = new Rose();
        Flower lotus = new Lotus();
        Flower hibi =  new Hibiscus();
        Flower sun = new Sunflower();
        Person.propsal(rose);
    }
}
