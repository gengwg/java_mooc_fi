// This is not an exercise but a "sandbox" where you can freely test
// whatever you want
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // Write the code here. You can run the code by 
        // selecting Run->Run File from the menu or by pressing Shift+F6
        
        String text = "includes text";
        int wholeNumber = 123;
        double decimalNumber = 3.141592653;
        boolean isTrue = true;

        System.out.println("The variable's type is text. Its value is " + text);
        System.out.println("The variable's type is integer. Its value is  " + wholeNumber);
        System.out.println("The variable's type is decimal number. Its value is " + decimalNumber);
        System.out.println("The variable's type is truth value. Its value is " + isTrue);
    
        wholeNumber = 42;
        System.out.println("The variable's type is integer. Its value is  " + wholeNumber);

        // text = 42; // Does not work! :(
    
        //decimalNumber = 1; // Works! :)

        // wholeNumber = 2.83; // not work! :(
        int first = 2;   // variable of whole number type is assigned the value 2
        int second = 4;  // variable of whole number type is assigned the value 4
        int sum = first + second;  // variable of whole number type is assigned the value of first + second
                                   //     (which means 2 + 4)
        System.out.println(sum); // the value of the sum of variables is printed


        System.out.println(first + second);
        System.out.println(2 + second - first - second);

        int dividend = 3;
        int divisor = 2;

        double quotient = dividend / divisor * 1.0;
        System.out.println(quotient);

        Scanner reader = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = reader.nextLine(); // Reads a line of input from the user and assigns it
                                 //     to the variable called name

        System.out.println("Hi, " + name);
    
        System.out.print("Type an integer: ");
        int number = Integer.parseInt(reader.nextLine());

        System.out.println("You typed " + number);

        System.out.print("How old are you: ");
        int age = Integer.parseInt(reader.nextLine()); // Reads a string variable from the keyboard and transfers it to an integer

        System.out.println("Your name is: " + name + ", and you are " + age + " years old, nice to meet you!");
        
    }
}
