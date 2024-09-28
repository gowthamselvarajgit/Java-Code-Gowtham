import java.util.Scanner;

/*
 * Jagged Array is an multiDimensional Array Where the Inner array size of all elements are not fixed.
 *
 *                     +------------------------------+
 *                     |   +----------------------+   |
 *                     |   |  1     2    3     4  |   |------> In this Array there are 4 elements
 *                     |   +----------------------+   |
 *                     +------------------------------+
 *                     |   +----------------------+   |
 *                     |   |  1       2       3   |   |------> In this Array there are 3 elements
 *                     |   +----------------------+   |
 *                     +------------------------------+
 *                     |   +----------------------+   |
 *                     |   |  1   2   3   4  5  6 |   |------> In this Array there are 6 elements
 *                     |   +----------------------+   |
 *                     +------------------------------+
 *
 *                               JAGGED ARRAY
 */
public class Jagged_MultiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] JaggedArray = new int[3][];

        for(int IndexRow = 0; IndexRow < 3; IndexRow += 1){
            JaggedArray[IndexRow] = new int[sc.nextInt()];
        }

//        JaggedArray[0] = new int[3];
//        JaggedArray[1] = new int[5];
//        JaggedArray[2] = new int[6];

        for(int Outer = 0; Outer < JaggedArray.length; Outer += 1){
            for(int Inner = 0; Inner < JaggedArray[Outer].length;Inner += 1){
                JaggedArray[Outer][Inner] = sc.nextInt();
            }
        }
        for(int[] nums : JaggedArray){
            for(int Element : nums){
                System.out.print(Element + " ");
            }
            System.out.println();
        }
    }
}
