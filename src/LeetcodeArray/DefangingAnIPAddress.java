package LeetcodeArray;

import java.util.Scanner;

public class DefangingAnIPAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ipAddress = sc.next();
        System.out.println(ipAddress);
        StringBuilder ipMaker = new StringBuilder();
        int length = ipAddress.length();
        for (int index = 0; index < length; index++) {
            if(ipAddress.charAt(index) != '.'){
                ipMaker.append(ipAddress.charAt(index));
            }
            else{
                ipMaker.append("[.]");
            }
        }
        System.out.println(ipMaker);
    }
}
