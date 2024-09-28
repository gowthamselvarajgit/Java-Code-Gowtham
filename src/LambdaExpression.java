interface Lambda{
    public abstract void show(int i, int j);
}

public class LambdaExpression {
    public static void main(String[] args) {
        Lambda obj = (i,j) -> System.out.print("Hai" + i + j);
        obj.show(5,10);

    }
}
