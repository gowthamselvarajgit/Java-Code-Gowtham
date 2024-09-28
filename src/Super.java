class Parent{
    public Parent(){
        System.out.println("In The Parent Class Default Constructor");
    }
    public Parent(int N){
        System.out.println("In The Parent Class Parameterized Constructor");
    }
}
class Child extends Parent{

    public Child(){//Default Constructor
        super();//In every constructor there will be a method called super which is unseen and this wont have any parameter in it.
                //It call the constructor of the super class here it is Parent class constructor.
        System.out.println("In The Child Class Default Constructor");
    }
    public Child(int Num){//Parametrized Constructor
        super(Num);//In every constructor there will be a method called super which is unseen and we give parameter to this.
                    //It call the constructor of the super class here it is Parent class constructor.
        System.out.println("In The Child Class Parameterized Constructor");
    }
}
public class Super {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}
