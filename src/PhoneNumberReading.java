import java.util.Scanner;
public class PhoneNumberReading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long PhoneNum = sc.nextLong();
        sc.close();
        long copy;
        long power;
        int previousDigit;
        int currentDigit;
        int counterDigit;
        copy = PhoneNum;
        power = 1;
        while(PhoneNum / power > 9){
            power = power * 10;
        }
        previousDigit = (int) (copy / power);
        copy = copy % power;
        power = power/10;
        counterDigit = 1;

        while( power != 0){
            currentDigit =(int) (copy / power);
            if(currentDigit == previousDigit){
                counterDigit = counterDigit+1;
            }
            else{
                while(counterDigit != 0){
                    if(counterDigit == 2 || counterDigit == 4){
                        System.out.print("Double ");
                        counterDigit = counterDigit - 2;
                    }
                    else if(counterDigit > 1){
                        System.out.print("Triple ");
                    }
                    else {
                        counterDigit = counterDigit - 1;
                    }

                    switch(previousDigit){
                        case 0 : System.out.print("Zero ");break;
                        case 1 : System.out.print("One ");break;
                        case 2 : System.out.print("Two ");break;
                        case 3 : System.out.print("Three ");break;
                        case 4 : System.out.print("Four ");break;
                        case 5 : System.out.print("Five ");break;
                        case 6 : System.out.print("Six ");break;
                        case 7 : System.out.print("Seven ");break;
                        case 8 : System.out.print("Eight ");break;
                        case 9 : System.out.print("Nine ");break;
                    }
                }
                previousDigit = currentDigit;
                counterDigit = 1;
            }
            copy = copy % power;
            power = power/10;
        }
        while(counterDigit != 0){
            if(counterDigit == 2 || counterDigit == 4){
                System.out.print("Double ");
                counterDigit = counterDigit - 2;
            }
            else if(counterDigit > 1){
                System.out.print("Triple ");
                counterDigit = counterDigit - 3;
            }
            else {
                counterDigit = counterDigit - 1;
            }

            switch(previousDigit){
                case 0 : System.out.print("Zero ");break;
                case 1 : System.out.print("One ");break;
                case 2 : System.out.print("Two ");break;
                case 3 : System.out.print("Three ");break;
                case 4 : System.out.print("Four ");break;
                case 5 : System.out.print("Five ");break;
                case 6 : System.out.print("Six ");break;
                case 7 : System.out.print("Seven ");break;
                case 8 : System.out.print("Eight ");break;
                case 9 : System.out.print("Nine ");break;
            }
        }
    }
}
