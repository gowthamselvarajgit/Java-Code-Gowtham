import java.io.IOException;

public class AsciiPrinter {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter the character: ");
        int num = System.in.read();
        System.out.print(num);
    }
}
