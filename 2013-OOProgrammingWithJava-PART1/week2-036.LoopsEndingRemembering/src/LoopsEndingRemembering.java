
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");

        int sum = 0;
        int counter = 0;
        int counterEven = 0;
        double avg = 0.0;
        
        //int age = Integer.parseInt(reader.nextLine());
        while (true) {  // age less than 5 OR greater than 85

            //System.out.println("Type numbers: ");
            int number = Integer.parseInt(reader.nextLine());
            //System.out.println(number);

            if (number == -1) {
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + sum);
                System.out.println("How many numbers: " + counter);
                System.out.println("Average: " + avg);
                System.out.println("Even numbers: " + counterEven);
                System.out.println("Odd numbers: " + (counter - counterEven));

                break;
            }

            sum += number;
            counter++;
            avg = sum * 1.0 / counter;
            if (number % 2 == 0) {
                counterEven ++;
            }

        }
    }
}
