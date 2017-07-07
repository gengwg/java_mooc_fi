
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.print("First: ");
        int min = Integer.parseInt(reader.nextLine());

        System.out.print("Last: ");
        int max = Integer.parseInt(reader.nextLine());

        while (min <= max) {
            System.out.println(min);
            min++;
        }

    }
}
