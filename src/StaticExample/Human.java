package StaticExample;

public class Human {
    String name;
    int age;
    String gender;
    Boolean married;

    // Think we both study in the same college so here this both is going to be same for this both object.
        static String college = "Bannari Amman Institute of Technology";
        static long population;
    public Human(String name, int age, String gender, Boolean married){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.married = married;
        population += 1;
    }
}
