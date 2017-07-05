
### 1. THE PROGRAM AND THE SOURCE CODE

System.out.print command is similar to the System.out.println command except that it will not print a line break after printing the text.

```java
System.out.print("Hello "); System.out.print("world");
System.out.print("!");
```
```
Hello world!
```

Even though neither the compiler nor the interpreter need line breaks in the source code, they are very important when considering human readers of the source code. Line breaks are required to divide source code in a clear manner.

The information processed by a command are the parameters of a command. They are passed to the command by placing them between () brackets that follow the command name. For example, the System.out.print command is given the text hello as a parameter as follows: System.out.print("hello").

In NetBean, You can run the code by selecting `Run`->`Run File` from the menu or by pressing `Shift+F6`. To build the package, `Cmd + F6`.

### 4. VARIABLES AND ASSIGNMENT

A variable holds its value until it is assigned a new one. Note that the variable type is written only when the variable is first declared in the program. After that we can use the variable by its name.

When a variable is declared with a data type, it cannot be changed later. For example, a text variable cannot be changed into an integer variable and it cannot be assigned integer values.
```java
String text = "yabbadabbadoo!";
text = 42; // Does not work! :(
```
(This is different from Python!!)
```python
>>> a = 'abcd'
>>> a
'abcd'
>>> a = 7
>>> a
7
```

Integer values can be assigned to decimal number variables, because whole numbers are also decimal numbers.
```java
double decimalNumber = 0.42;
decimalNumber = 1; // Works! :)
```

It is a good idea to replace the space character using a camelCase notation. Note: The first character is always written in lower case when using the camel case notation.
```java
int camelCaseVariable = 7;
```

Variable names can contain numbers as long it does not start with one. Variable names cannot be composed solely of numbers, either.
```java
int 7variable = 4; // Not allowed!
int variable7 = 4; // A valid, but not descriptive variable name
```

Variable names that have been defined before cannot be used. Command names such as System.out.print cannot be used, either.
```java
int camelCase = 2;
int camelCase = 5; // Not allowed, the variable camelCase is already defined!
```
### 5. CALCULATION

A floating point number (decimal number) and integer (whole number) often get mixed up. If all the variables in a calculation operation are integers, the end result will also be an integer.
```java
int result = 3 / 2;  // result is 1 (integer) because 3 and 2 are integers as well

int first = 3:
int second = 2;
double result = first / second;  // the result is again 1 because first and second are integers
```

If either the dividend or the divisor (or both!) is a floating point number (decimal number) the end result will also be a floating point number.
```java
double whenDividendIsFloat = 3.0 / 2;  // result is: 1.5
double whenDivisorIsFloat = 3 / 2.0;   // result is: 1.5
    ```

If a string is on either side of the + operator, the other side is converted to a string and a new string is created. For example, the integer 2 will be converted into the string "2" and then combined with the other string.

```java
    System.out.println("there is an integer --> " + 2);
    System.out.println(2 + " <-- there is an integer");
```
```java
    System.out.println("Four: " + (2 + 2));
    System.out.println("But! Twenty-two: " + 2 + 2);

    Four: 4
    But! Twenty-two: 22
```

The program body for interaction with the user is as follows:

```java
import java.util.Scanner;
public class ProgramName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // code here
    }
}
```    

Read a string:
```java
String text = reader.nextLine();
```

Read an integer:
```java
int number = Integer.parseInt(reader.nextLine());
```

### 8. CONDITIONAL STATEMENTS AND TRUTH VALUES

Strings cannot be compared using the equality operator (==). For string comparison, we use the equals. command, which is always associated with the string to compare.

```java
String text = "course";
String anotherText = "horse";

if (text.equals(anotherText)) {
    System.out.println("The texts are the same!");
} else {
    System.out.println("The texts are not the same!");
}
```

When comparing strings, it is crucial to make sure that both string variables have been assigned some value. If a value has not been assigned, the program execution terminates with a NullPointerException error, which means that variable has no value assigned to it (null).

### 9. INTRODUCTION TO LOOPS

To read a double, use: `double number = Double.parseDouble(reader.nextLine());`
