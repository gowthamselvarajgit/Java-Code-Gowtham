import java.util.Scanner;
class GetArrayInput {
    public static void main(String[] a){
        Scanner array = new Scanner(System.in);
        int num = array.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = array.nextInt();
        }
        for(int i=0; i<num; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
