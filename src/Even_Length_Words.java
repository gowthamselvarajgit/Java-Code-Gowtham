import java.util.Scanner;

public class Even_Length_Words {
    public static void printWord(String Sentance){

        String[] Word = Sentance.split(" ");

        int[] WordLength = new int[Word.length];

        for(int Index = 0;Index < Word.length;Index+=1){
            WordLength[Index] = Word[Index].length();
        }
        for(int Index = 0;Index < Word.length;Index+=1){
            if(WordLength[Index]%2 != 0){
                System.out.print(Word[Index] + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Sentance;
        Sentance = sc.nextLine();

        printWord(Sentance);
    }
}
