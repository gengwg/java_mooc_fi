# PART 2

## 33. RECAPPING PROGRAMMING BASICS

In reality all information within a computer is represented as a series of bits - ones and zeros. Variables are an abstraction offered by the programming language with which we can handle different values more easily. The variables are used to store values and to maintain the state of the program. In Java, we have the primitive variable types int (integer), double (floating-point), boolean (truth value), char (character), and the reference variable types String (character string), ArrayList (array), and all classes.

if - else if - else

while-true-break loop

for loop

The traditional for-loop is very useful in cases where we go through indices one at a time.

Methods are a way of chopping up the functionality of a program into smaller entities. All Java programs start their execution from the main program method, which is defined with the statement `public static void main(String[] args)`. This statement defines a static method - that is a method which belongs to the class - which receives a character string array as its parameter.

The program defines methods to abstract the functionalities of the program. When programming, one should try to achieve a situation in which the program can be looked at from a higher level, in such a case the main method consists of calls to a group of self-defined, well-named methods. The methods then specify the functionality of the program and perhaps are based on calls to other methods.

Methods that are defined using the keyword static belong to the class that holds the method, and work as so-called support methods. The methods that are defined without the keyword static belong to the instances - the objects - created from the class and can modify the state of that individual object.

A method always has a visibility modifier (public, visible to 'everyone', or private, only visible within its class), a return type (in the main method this is void, which returns nothing) and a name.

Methods can abstract a program up to a certain point, but as the program becomes larger it's sensible to chop down the program even further into smaller and more logical entities. With the help of classes, we can define higher level concepts of a program and functionalities related to those concepts. Every Java program requires a class in order to work, so the Hello World! example wouldn't work without the class definition. A class is defined with the keywords public class NameOfTheClass.

In a program, classes are used to define concepts and functionalities related to those concepts. Objects can be created from a class and are the embodiments of that class. Every object that belongs to a certain class has the same structure, but the variables belonging to each objects can be different. The methods of objects handle the state of the object, that is, the variables of the object.

Object variables are variables which for each of the objects created from the class are their own -- the object variables of one object are unrelated to the state of the same variables of another object. It is usually appropriate to hide the object variables from the users of the class, to define the visibility modifier private for them. If the visibility modifier is set to public, the user of the object will be able to directly access the object variables.

Objects are created from a class with a constructor. A constructor is a method that initializes an object (creates the variables belonging to the object) and executes the commands that are within the constructor. The constructor is always named the same as the class that has the constructor in it.

Objects are created with the help of the constructor that is defined within a class. In the program code the costructor is called with the new command, which returns a reference to the new object. Objects are instances created from classes.

each object has its own internal state. The state is formed from object variables that belong to the object. Object variables can be both primitive type variables and reference type variables. If reference type variables belong to the objects, it is possible that other objects also refer to the same referenced objects!

The most important aspects of a clear program are class structure and good naming conventions. Each class should have a single, clearly defined responsibility. Methods are used to reduce repetition and to create a structure for the internal functionality of the class. A method should also have a clear responsibility to ensure it stays short and simple. Methods that do many things should be divided into smaller helper methods, which are called by the original method.

refactoring the code did not add any new functionality, it merely changed the way the program works internally.

Dr. Luukkainen has written a list of instructions for new programmers to follow when learning to program. Follow this advice to become a great programmer!

Take small steps
    - Divide the problem you are trying to solve into smaller parts and solve them one at a time
    - Keep testing that your solution is moving in the right direction, ensuring that you have solved the current part correctly
Keep the code as clean as you can
    - use proper indentation
    - use descriptive names for variables, methods, classes, everything
    - keep all methods short, including main
    - write methods that only do one thing
    - remove all copy-paste code by refactoring (or dont copy and paste code in the first place!)
    - replace "bad" and unclear code with clean, easy to read code

even though you compare character strings with the command equals you compare single characters with the == operator

## 34. PRIMITIVE- AND REFERENCE-TYPE VARIABLES

Java is a strongly typed language, what this means is that all of its variables have a type. The types of the variables can be divided in to two categories: primitive-type and reference-type variables. Both types of variables have their own "slot", which holds the information belonging to them. Primitive-type variables hold the concrete value in their slot, while the reference-type variables hold a reference to a concrete object.

When a primitive type variable is passed to a method as a parameter, the method parameter is set to the value in the given variable's slot. In practice, the method parameters also have their own slots to which the value is copied, like in an assignment expression.

When using floating point data types, it is important to keep in mind that floating point types are always an approximation of the actual value.

Reference-type variables contain a reference to the location where the information is stored. Differently from primitive-type variables, reference-type variable do not have a limited scope because their value or information is stored at the referenced location. Another substantial difference between primitive-type and reference-type variables is that various different reference-type variables can point to the same object.

the variable does not contain the object, but it points to the object information.

In both cases, we copy the contents of a slot: the primitive-type variable slot contains a value, whereas the reference-type variable slot contains a reference.

Differently from what happens with original-type variables, we copy the reference and not their value. In fact, we can modify the object behind the reference even from within the method.

As far as the reference-type variable is concerned, a reference duplicates and it is given to the method, and the variable inside the method will still point to the same object. As far as the original-type variable is concerned, a value is copied, and the variable inside the method will have its completely independent value.

## 35. STATIC AND NON-STATIC

Static methods are called via their class name, for instance ClassName.variable or ClassName.method().

Object methods are called through their object reference. The method calls follow the pattern objectName.methodName()


We call class library a class which contains common-use methods and variables. For instance, Java Math class is a class library. It provides the Math.PI variable, inter alia.

The keyword final in the variable definition tells that once we assign a value to a variable, we can not assign a new one to it. Final-type variables are constant, and they always have to have a value. For instance, the class variable which tells the greatest integer, Integer.MAX_VALUE, is a constant class variable.

Note the naming convention! All constants, i.e. all variable which are provided with the definition final, are written with CAPITAL_LETTERS_AND_UNDERLINE_CHARACTERS.

Even though Java allows for static variable use, we do not usually require it. Often, using static methods causes problems with the program structure, because static variables are as inconvenient as global variables. The only static variables we use in this course are constant, i.e. final!


Non-static methods can also call static methods, that is the class-specific ones. On the other hand, static methods can not call non-static methods without a reference to the object itself, which is essential to retrieve the object information.

The variables which are defined inside a method are `auxiliary variables` used during the method execution, and they are not to be confused with object variables. The variable exists and is accessible only during the method execution.

## 36. HASHMAP

HashMap is one of Java's most useful data structures. The idea behind HashMap is we define an index for an object key - a unique value, for instance a social security number, a student number, or a phone number. We call hashing the process of changing a key into an index, or simply to define an index. The hashing happens thanks to a particular function which makes sure that we get always the same index with a known key.
