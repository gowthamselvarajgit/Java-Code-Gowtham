import java.util.Scanner;

public class UniqueNumberArray {
    public static void main(String []a){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[10];
        for(int i =0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<num;i++){
            int counter = 0;
            for(int j=0;j<num;j++){
                if(arr[i] == arr[j]){
                    counter = counter+1;
                }
            }
            if(counter == 1){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
