
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        
        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if (word.equals("")) {
                break;
            }
            words.add(word);
        }
        
        Collections.sort(words);
        System.out.println("You typed the following words:");
        for (String w : words) {
            System.out.println( w );
        }          
    }
}
