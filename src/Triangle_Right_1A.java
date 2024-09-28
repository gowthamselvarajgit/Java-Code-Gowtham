/*

*
**
***
****
*****
******
*******

*/

import java.util.Scanner;
public class Triangle_Right_1A {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int row = 1; row <= num; row++){
            for(int column = 1; column <= row; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
