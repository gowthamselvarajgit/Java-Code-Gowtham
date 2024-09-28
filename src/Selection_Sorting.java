/*
SELECTION SORTING
0	1	2	3	4	5	6	7	8	9	10	11	12	13	14	15	16	17	18	19 -----> Index
2	25	77	37	33	57	20	7	1	14	12	15	21	4	18	6	16	5	95	27 ----->Elements
^                               ^
|                               |
|                               |
|                               Found The smallest Number than the first One
Smallest Number at First
Step 1:
Find The Smallest Number As keeping the first element as the smallest Number And then just swap

0	1	2	3	4	5	6	7	8	9	10	11	12	13	14	15	16	17	18	19
1	25	77	37	33	57	20	7	2	14	12	15	21	4	18	6	16	5	95	27

The Elements are now swapped;

0	1	2	3	4	5	6	7	8	9	10	11	12	13	14	15	16	17	18	19
1	25	77	37	33	57	20	7	2	14	12	15	21	4	18	6	16	5	95	27
    ^                           ^
    |                           |
    |                           |
    |                           Next Smallest Element is found so swap
    Now Keep this as Smallest And check For Next Smallest

The Elements Are Now Swapped:
0	1	2	3	4	5	6	7	8	9	10	11	12	13	14	15	16	17	18	19
1	2	77	37	33	57	20	7	25	14	12	15	21	4	18	6	16	5	95	27

Continue this.....
 */

import java.util.Scanner;
public class Selection_Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Size_Array = sc.nextInt();
        int[] Array = new int[Size_Array];
        for(int Index = 0;Index < Size_Array;Index++){
            Array[Index] = sc.nextInt();
        }
        int Smallest;
        int Smallest_Index;
        int LoopingBegin;
        for(LoopingBegin = 0; LoopingBegin < Size_Array; LoopingBegin++){
            Smallest_Index = LoopingBegin;
            Smallest = Array[LoopingBegin];
            for(int Index = LoopingBegin+1; Index < Size_Array;Index++){
                if(Array[Index] < Smallest){
                    Smallest = Array[Index];
                    Smallest_Index = Index;
                }
            }
            int Temp;
            Temp = Array[LoopingBegin];
            Array[LoopingBegin] = Array[Smallest_Index];
            Array[Smallest_Index] = Temp;
        }
        for(int Index = 0;Index < Size_Array;Index++){
            System.out.print(Array[Index] + " ");
        }
    }
}
