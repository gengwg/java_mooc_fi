
import java.util.Random;

public class PasswordRandomizer {

    // Define the variables
    private Random random;
    private final int length;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        //final String alphabet = "0123456789ABCDE";
        int i = 0;
        String passwd = "";
        while (i < this.length) {
            char c = (char) (this.random.nextInt(26) + 'a');
            passwd += c;
            //System.out.println(passwd);
            i++;
        }
        return passwd;
    }
}
