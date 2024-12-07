public class Shape {
    static int length;


    Shape(int length){
        System.out.println("I am at super class cons");
        System.out.println("--------------------------------------");
        Shape.length=length;
    }
}
class Square extends Shape{
   static int width;

    Square(int width, int l){
        super(l);
        System.out.println("I am at sub class cons");
        Square.width = width;
    }
}
class Sides extends Square{
    int width;

    Sides(int n, int w, int l){
        super(w,l);
        System.out.println("--------------------------");
        System.out.println("I am at sides cons");
        this.width = n;

        System.out.println("-------Is static variable inheriting or not--------------------");
        System.out.println("This is static variable "+ super.width);
    }
}
