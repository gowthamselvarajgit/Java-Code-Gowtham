package StaticExample;

public class NonStaticMemberInsideStaticMember {
    /*
    Why the main Method is Static
    ->Independent of Object Creation:
        *The main method must be accessible without creating an object of the class because it's the entry point of a Java program.
        *Making it static ensures the JVM can invoke it directly using the class name.
    ->Class-Level Context:
        *Static methods belong to the class itself rather than any specific instance.
        *Since the main method is a global entry point, it logically fits at the class level.
    ->Consistency:
        *If the main method were not static, the JVM would need to create an instance of the class to execute it, which introduces unnecessary complexity.
     */
    public static void main(String[] args) {
        //greeting();//It is dependent on object
    }
    // It is nonstatic and it belongs to the object.
    void greeting(){
        System.out.println("Hello");
    }
}
