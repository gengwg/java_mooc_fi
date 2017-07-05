
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.print("Type your name: ");

        String firstName = reader.nextLine();
        System.out.print("Type your age: ");
        int firstAge = Integer.parseInt(reader.nextLine());
        
        //System.out.println(""); // an empty line        
        System.out.print("Type your name: ");
        String secondName = reader.nextLine();
        System.out.print("Type your age: ");
        int secondAge = Integer.parseInt(reader.nextLine());
 
        //System.out.println(""); // an empty line
        System.out.println(firstName + " and " + secondName + " are "
        + (firstAge + secondAge) + " years old in total."); // an empty lineType your name: Matti
        
    }
}
