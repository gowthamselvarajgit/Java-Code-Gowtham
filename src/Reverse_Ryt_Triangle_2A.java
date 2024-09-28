/*

 *****
 ****
 ***
 **
 *

 */

import java.util.Scanner;
public class Reverse_Ryt_Triangle_2A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int row = num; row>=1 ; row--){
            for(int column = 1;column <= row; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
