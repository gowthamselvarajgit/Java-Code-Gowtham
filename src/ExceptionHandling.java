import java.util.Scanner;

//Handle the runtime errors
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = null;
        System.out.print("Enter the value that need to be divivded : ");
        int divident = sc.nextInt();
        System.out.print("Enter the value with which number need to be divided : ");
        int divisor = sc.nextInt();
        int quotient = 0;
        System.out.print("Enter the Array Size : ");
        int arraySize = sc.nextInt();
        System.out.print("Enter elements in Array : ");
        int array[] = new int[arraySize];
        for(int index = 0; index < arraySize; index += 1){
            System.out.print("Enter " + index + " Element : ");
            array[index] = sc.nextInt();
        }

        try{
            quotient = divident / divisor;
            if(quotient == 0){
                throw new ArithmeticException();
            }
            System.out.print("Enter the Index need to be printed: ");
            System.out.print(array[sc.nextInt()]);
        }

        catch(ArithmeticException e){
            System.out.println("The default value is " + divident);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The elements you asked is out of bound " + e);
        }
        catch (Exception e){
            System.out.println("Something Went Wrong");
        }

        System.out.println("The quotient is " + quotient);
        System.out.println("Bye");
    }
}
