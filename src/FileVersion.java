import java.util.Scanner;

public class FileVersion {
    static int maxFileVersion(String[] fileArray, int size){
        int max = Integer.MIN_VALUE;
        for (int index = 0; index < size; index++) {
            String str = fileArray[index];
            int version = Integer.parseInt(str.replaceAll("\\D+", ""));
            System.out.println(version);
            if(version > max){
                max = version;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] fileArray = new String[size];
        for (int index = 0; index < size; index++) {
            fileArray[index] = sc.next();
        }
       int maximumVersion =  maxFileVersion(fileArray,size);
        System.out.println(maximumVersion);
    }
}
