
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the points [0-60]: ");
        int points = Integer.parseInt(reader.nextLine());
       
        
        System.out.println("");
        if ( points < 30 ) {
            System.out.println("Grade: failed");
        } else if (points < 35) {
            System.out.println("Grade: 1");
        } else if (points < 40) {
            System.out.println("Grade: 2");
        } else if (points < 45) {
            System.out.println("Grade: 3");
        } else if (points < 50) {
            System.out.println("Grade: 4");
        } else {
            System.out.println("Grade: 5");
        }
    }
}
