
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        Scanner lukija = new Scanner(System.in);
        Grade grader = new Grade(lukija);

        grader.getScores();
        grader.gradeGiver();
        grader.printGrades();

    }

}
