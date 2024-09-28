import java.util.Scanner;
public class NumberPassswordRearrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long Password = sc.nextLong();
        int start = sc.nextInt();
        int end = sc.nextInt();

        long FirstPower = 1;
        long LastPower = 1;
        long FirstTerm;
        long SecondTerm;
        long ThirdTerm;

        long digit = 0;
        long copy = Password;
        int nod = 0;

        long result;

        while( copy!=0 ){
            nod = nod+1;
            copy = copy/10;
        }
        FirstPower = (long)Math.pow(10,(nod-start+1));
        LastPower = (long) Math.pow(10,(nod-end));

        FirstTerm = Password / FirstPower;
        SecondTerm = (Password % FirstPower) / LastPower;
        ThirdTerm = Password % LastPower;

        copy = SecondTerm;
        long reverse = 0;
        while(copy != 0){
            digit = copy % 10;
            reverse = reverse * 10 + digit;
            copy = copy/10;
        }

        SecondTerm = reverse;
        result = (FirstTerm * FirstPower) + (SecondTerm * LastPower) + ThirdTerm;
        System.out.println("The Given Password is :" + Password);
        System.out.println("The Orginal password is: "+result);

    }
}
