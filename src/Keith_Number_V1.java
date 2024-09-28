import java.util.Scanner;
public class Keith_Number_V1 {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int Number;
        Number = sc.nextInt();
        int Copy_Number = Number;
        int Number_of_Digit = 0;
        while(Copy_Number!=0){
            Number_of_Digit = Number_of_Digit + 1;
            Copy_Number = Copy_Number / 10;
        }
        int[] Element_Store = new int[Number_of_Digit + 1];

        int Store_Index;
        int Shift;
        int Sum;

        Copy_Number = Number;

        Store_Index = Number_of_Digit - 1;
        Element_Store[ Number_of_Digit] = 0;
        while (Copy_Number != 0){
            Element_Store[Store_Index] = Copy_Number % 10;
            Element_Store[Number_of_Digit] = Element_Store[Number_of_Digit] + (Copy_Number % 10);
            Copy_Number = Copy_Number/10;
            Number_of_Digit = Number_of_Digit - 1;
        }
        while (Element_Store[Number_of_Digit] < Number){
            for(Store_Index = 0; Store_Index <= Number_of_Digit;Store_Index++){

            }
        }
    }
}
