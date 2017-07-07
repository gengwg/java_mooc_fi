
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int until = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int i = 0;
        while ( i <= until) {
            sum += i;
            i++;
        }
        
        System.out.println("Sum is " + sum);

    }
}
