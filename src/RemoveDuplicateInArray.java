import java.util.Scanner;

class RemoveDuplicateInArray{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int itr = 0; itr < num; itr++){
            arr[itr] = sc.nextInt();
        }

        for(int itr1 = 0; itr1 < num; itr1++){
            for (int itr2 = itr1 + 1; itr2 < num; itr2++){
                if(arr[itr1] == arr[itr2]){
                    for (int k = itr2; k < num - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    num--;
                    itr2--;
                }
            }
        }

        for(int i =0;i<num;i++){
            System.out.print(arr[i] + " ");
        }
    }
}