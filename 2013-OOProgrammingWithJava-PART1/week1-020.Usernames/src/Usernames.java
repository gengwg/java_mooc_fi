
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your username: ");
        String name = reader.nextLine();
        System.out.print("Type your password: ");
        String password = reader.nextLine();
        
        System.out.println("");
        if ( (name.equals("alex") && password.equals("mightyducks")) || 
                (name.equals("emily") && password.equals("cat")) ) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }

    }
}
