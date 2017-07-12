
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        
        Account myAccount = new Account ("Wei account", 100.0);
        System.out.println("Initial state");
        System.out.println(myAccount);
        
        myAccount.deposit(20.0);
        System.out.println("New state");
        System.out.println(myAccount);

    }

}
