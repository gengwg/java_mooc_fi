
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


When performing the assignment operation on an existing variable, it is written as `variable operation= change`, for example `variable += 5`.

When you are programming something, no matter if it is an exercise or a project of your own, it is advised to do it in very tiny pieces. Do not ever try to solve the whole problem in one go. Start with something easy, something you know that you can do.

### 12. METHODS

Technically speaking, a method is a piece of code that can be called from different places of the program code. The line of code System.out.println("I am a parameter given to the method!") means that we call a method that actually handles the printing. After the method has been executed we go back to where we called the method, and continue executing. The input given to the method inside the brackets is called a method parameter.

The methods are written in the program body outside the main's braces ( { and } ) but still inside the outermost braces, for example like this: :

```java
import java.util.Scanner;

public class ProgramBody {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // program code
        greet();

    }

    // self-written methods
    public static void greet() {
        System.out.println("Greetings from the world of methods!");
    }
}
```

What is noteworthy here is the execution order of the program code. The execution starts with the main program's (or main's) lines of code, from top to bottom, one by one. When the line of code to be executed happens to be a method call, the lines of code in the method block are executed again one by one. When the method block ends, the execution continues from the place where the method was called. To be exact, the execution continues from the next line after the original method call.

To be even more exact, the main program is also a method. When the program starts, the operation system calls for the main method. That means that the main method is the starting point of the program and the execution starts from the first code line of main. The program execution ends when it reaches the end of main.

### 14. MORE ABOUT METHODS

variables defined in methods are not visible for other methods or the main program. The only way to give information to a method from the outside is to use parameters.

The number we gave as a parameter to the method was copied for the method to use. If we would like the main program to be able to use the new value generated by the method, the method needs to return that value.

A method can return a value. In the examples above, methods have not been returning anything. This is expressed by writing void in the first line of the method, just before its name.

```java
public static void addThree() {
  ...
```
When defining a method that returns a value, we also have to define the type of the return value. We can define the type of the return value by writing it just before the name of the method. Next, we have a method that always returns the number 10 (type int). Returning a value is accomplished with the command return:
```java
public static int alwaysReturnTen() {
    return 10;
}
```
If we want to use the returned value later, we have to catch the return value and store it into a variable:
```java
public static void main(String[] args) {
    int number = alwaysReturnTen();

    System.out.println( "method returned the number " + number );
}
```

If the method is defined to have a return value, it also has to return a value. The following method is incorrect:
```java
public static String wrongMethod() {
    System.out.println("I tell you that I will return a String but I do not!");
}
```

the return value of the method does not always need to be assigned to a variable. It can also act as a part of the printing command just like any other integer value.

Note: if an exercise involves a method returning something, it means that the return type needs to be defined for the method, and that the method needs to return a value of that type using the return command. In this case, the method does not print (or use the command System.out.println(..)), the method caller handles printing, here, the main program..

### 15. STRINGS OF CHARACTERS

The characters in a string are numbered (indexed) starting from 0. This means that we can reach the last character in a string with number (or index) "the length of the word minus one", or word.charAt(word.length()-1). The following example will make the program crash, because we are trying to get a character from an index that does not exist.
```java
char character = word.charAt(word.length());
```

### 16. OBJECT

In the Java programming language, objects must be "born", in other words created with the new command. Strings are objects that make an exception to this rule! -- There are two ways to create a String object:
```java
String banana = new String("Banana");
String carrot = "carrot";
```

The objects "type" is called a class. The class of a string of characters is called String and the class of readers is called Scanner.

### 17. ARRAYLIST OR AN "OBJECT CONTAINER"

The following lines of code make use of an ArrayList that holds specifically objects of type String. A couple of strings are stored into the list.
```java
import java.util.ArrayList;

public class ListProgram {

    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<String>();

        wordList.add("First");
        wordList.add("Second");
    }
}
```

We can remove strings from lists through the method remove. The method can be used in two ways. First, remove("characters") removes the string given as a parameter. Second, remove(3) removes the 4th String from the list.

Going through items in an ArrayList with for-each :
```
public static void main(String[] args) {
   ArrayList<String> teachers = new ArrayList<String>();

   teachers.add("Anthony");
   teachers.add("Paul");
   teachers.add("John");
   teachers.add("Martin");
   teachers.add("Matt");

   for (String teacher : teachers) {
       System.out.println( teacher );
   }
}
```

The method remove does not work like expected when the list consists of int numbers::
```java
public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    numbers.add(4);
    numbers.add(8);

    // tries to remove the number from the index 4, does not work as expected!
    numbers.remove(4);

    // this removes the number 4 from the list
    numbers.remove(Integer.valueOf(4));
}
```

`numbers.remove(4)` tries to remove the item in the index 4 from the list. There are only 2 items in the list, so the command generates an error. We must use a slightly more complicated command if the number 4 needs to be removed: `numbers.remove( Integer.valueOf(4) )`;
