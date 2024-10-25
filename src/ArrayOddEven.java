import java.util.Scanner;

public class ArrayOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array =  new int[size];
        for (int index = 0; index <size ; index++) {
            array[index] = sc.nextInt();
        }

        StringBuilder oddEven = new StringBuilder();
        for(int index  = 0; index < array.length; index += 1){
            if(array[index]%2 == 0) {
                oddEven.append("Even");
            }
            else{
                oddEven.append("Odd");
            }
        }
        System.out.println(oddEven.toString());
    }
}
