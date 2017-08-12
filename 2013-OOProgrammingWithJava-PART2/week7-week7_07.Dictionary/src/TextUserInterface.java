/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wg
 */
import java.util.Scanner;

public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {

        printInstructions();

        while (true) {
            System.out.print("Statement: ");
            String cmd = this.reader.nextLine();
            if (cmd.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (cmd.equals("add")) {
                System.out.print("In Finnish: ");
                String finnish = this.reader.nextLine();
                System.out.print("Translation: ");
                String translation = this.reader.nextLine();
                this.dictionary.add(finnish, translation);
                System.out.println("");
            } else if (cmd.equals("translate")) {
                System.out.print("Give a word: ");
                String finnish = this.reader.nextLine();
                System.out.print("Translation: " + this.dictionary.translate(finnish));
                System.out.println("");
                System.out.println("");

            } else {
                System.out.println("Unknown statement");
            }
        }

    }

    private static void printInstructions() {
        System.out.println("Statements:\n"
                + "  add - adds a word pair to the dictionary\n"
                + "  translate - asks a word and prints its translation\n"
                + "  quit - quits the text user interface\n");
    }

}
