
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the first word: ");
        String firstWord = reader.nextLine();
        System.out.println("");

        System.out.print("Type the second word: ");
        String secondWord = reader.nextLine();
        System.out.println("");

        // System.out.println(firstWord.indexOf(secondWord));
        if (firstWord.indexOf(secondWord) == -1) {
            System.out.println("The word '" + secondWord
                    + "' is not found in the word '" + firstWord + "'.");
        } else {
            System.out.println("The word '" + secondWord
                    + "' is found in the word '" + firstWord + "'.");            
        }
    }
}
