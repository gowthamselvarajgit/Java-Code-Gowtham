package InterfaceLearning;

/*
    1. we cannot create an object for the interface.
    2. the methods in the interface is only abstract class.
    3. Java doesn’t have the diamond problem with classes because it disallows multiple inheritance.
    4. Interfaces provide a way to achieve multiple inheritance-like functionality without the ambiguities of the diamond problem.
    5. In Inheritance we will use the extend keywoard but in the interface wee will use implements.
    6. We cant create an object for the interface but we can create a object for the class which implements that interface.
    7. As we cant create a object for the interface so there is no constructor as well.
    8. Every values in the interface are public static and final.
    9. We can write body to the method in the interface if we use default or static.
 */
interface Animal{
    int age = 20;
    void sound();
    default void speak(){

    }
    static void soound(){

    }
}
class Cat implements Animal{
    public void sound(){
        System.out.println("Meoww");
    }
}
public class WhyInheritance {
    public static void main(String[] args) {
        Cat object = new Cat();
        object.sound();
        System.out.println(object.age);
    }
}
