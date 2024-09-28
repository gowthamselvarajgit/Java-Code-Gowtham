import java.util.Scanner;
public class Unique_From_Triplet_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Array_Size = sc.nextInt();
        int[] Array = new int[Array_Size];
        for(int Index = 0; Index < Array_Size;Index++){
            Array[Index] = sc.nextInt();
        }
        int Base = sc.nextInt();
        int Base_Value;
        int XOR_Result = 0;
        for(int Index = 0;Index < Array_Size;Index++){
            Base_Value = AnyBaseConverter(Array[Index],Base);
            XOR_Result = AnyBaseXOR(XOR_Result, Base_Value , Base);
        }
        System.out.println("Converted: "+XOR_Result);
        int Unique_Element = AnyBaseToDecimal(XOR_Result,Base);
        System.out.print("Unique Element is:" + Unique_Element);
    }
    public static int AnyBaseConverter(int Value , int Base){
        int Copy_Value = Value;
        int Remainder;
        int Power = 1;
        int Converted_Value = 0;
        while(Copy_Value != 0){
            Remainder = Copy_Value % Base;
            Converted_Value = (Power * Remainder) + Converted_Value;
            Copy_Value = Copy_Value / Base;
            Power = Power * 10;
        }
        return  Converted_Value;
    }
    public static int AnyBaseXOR(int Value1, int Value2 , int Base){

        int Copy_Value1 = Value1;
        int Copy_Value2 = Value2;
        int Digit1;
        int Digit2;
        int Digit1_XOR_Digit2;
        int Constructed_Value = 0;
        int Power = 1;

        while(Copy_Value1 != 0 || Copy_Value2 != 0){
            Digit1 = Copy_Value1 % 10;
            Digit2 = Copy_Value2 % 10;
            Digit1_XOR_Digit2 = (Digit1 + Digit2) % Base;
            Constructed_Value = (Digit1_XOR_Digit2 * Power) + Constructed_Value;
            Power = Power * 10;
            Copy_Value1 = Copy_Value1 / 10;
            Copy_Value2 = Copy_Value2 / 10;
        }
        return Constructed_Value;
    }
    public static int AnyBaseToDecimal(int OtherBaseValue, int Base){

        int Copy_OtherBaseValue;
        int OtherBasePower;
        int Digit;
        int Decimal;

        Digit = 1;
        Decimal = 0;
        OtherBasePower = 1;
        Copy_OtherBaseValue = OtherBaseValue;
        while (Copy_OtherBaseValue != 0){
            Digit = Copy_OtherBaseValue % 10;
            Decimal = Decimal + (Digit * OtherBasePower);
            Copy_OtherBaseValue = Copy_OtherBaseValue / 10;
            OtherBasePower = OtherBasePower * Base;
        }
        return Decimal;
    }
}
