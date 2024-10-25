import java.util.Scanner;

public class RatCountHouse {
    static int ratSufficient(int r, int unit, int size, int[] array){
        int foodRequirement = r * unit;
        int sum = 0;
        for (int index = 0; index < size; index++) {
            sum = sum + array[index];
            if(sum > foodRequirement) {
                return index+1;
            }
        }
         return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rat = sc.nextInt();
        int unitOfFood = sc.nextInt();
        int size = sc.nextInt();
        int[] wareHouse = new int[size];
        for (int index = 0; index < size; index++) {
            wareHouse[index] = sc.nextInt();
        }

        int result = ratSufficient(rat,unitOfFood,size,wareHouse);
        System.out.println(result);
    }
}
