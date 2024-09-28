/*
0 1  2  3  4  5  6   7   8   9   10  11  12  13  14   15   16   17   18   19
3 4 33 34 43 44 333 334 343 344 433 434 443 444 3333 3334 3343 3344 3433 3434
 20   21   22   23   24   25   26   27   28   29
3443 3444 4333 4334 4343 4344 4433 4434 4443 4444...........

TERM         (TERM/2) - 1
|             |
29 - 4444    13 - 444    5 - 44   1 - 4
28 - 4443    13 - 444    5 - 44   1 - 4
27 - 4434    12 - 443    5 - 44   1 - 4
26 - 4433    12 - 443    5 - 44   1-  4
25 - 4344    11 - 434    4 - 43   1-  4
24 - 4343    11 - 434    4 - 43   1-  4
23 - 4334    10 - 433    4 - 43   1-  4
22 - 4333    10 - 433    4 - 43   1-  4
21 - 3444     9 - 344    3 - 34   0-  3
TERM              29 ---->  13------>  5------> 1
MOTHER VALUE OF 4444 ----> 444 -----> 44 -----> 4
TERM % 2 == 0
IF - 29 % 2 == 0 ----> NO
     444 * 10 + 4;
29 ---->  13------>  5------> 1
29%2
MOTHER_VALUE*10+4

 */

import java.util.Scanner;
public class Three_Four_Series {
    public static int ThreeFour(int TERM){
        return ThreeFour_Helper(TERM);
    }

    public static int ThreeFour_Helper(int TERM){
        if(TERM == 0) return 3;
        if(TERM == 1) return 4;
        int Mother_Value = ThreeFour_Helper((TERM/2)-1);
        if(TERM % 2 == 0){
            Mother_Value = Mother_Value*10+4;
            return Mother_Value;
        }
        else{
            Mother_Value = Mother_Value*10+3;
            return Mother_Value;
        }
    }
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int NUM = sc.nextInt();
        for(int TERM = 0;TERM<=NUM;TERM++) {
            System.out.println("THE VALUE ARE:" + ThreeFour(TERM));
        }
    }
}
