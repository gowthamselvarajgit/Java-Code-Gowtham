class Food{
    String name;
    int cost;
}
public class PassByReference {
    public static void main(String[] args) {
        Food breakfast = new Food();
        breakfast.name = "Parotta";
        breakfast.cost = 10;
        System.out.println(breakfast.name);
        System.out.println(breakfast.cost);
        Food lunch = breakfast;
        lunch.name = "Briyani";
        lunch.cost = 100;
        System.out.println(lunch.name);
        System.out.println(lunch.cost);

        System.out.println(breakfast.name);
        System.out.println(breakfast.cost);
    }
}
