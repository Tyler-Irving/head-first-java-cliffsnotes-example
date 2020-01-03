## Breaking the surface

## Table of Contents

- The way Java works 
- Code structure in Java 
- The main() method 
- Looping 
- Conditional branching (if tests)

## How does Java work?
Java follows four steps
1. Source Code
- The first step is the programmers (you) work. The code is written here.
2. Complier
- The second step is where the source code that was written in step 1 is checked to make sure that it is written correctly and 
can be successfully ran.
3. Output Code
- The third step is started when the compiler ok's the code, and makes the output code. Output code is Java bytecode, and can be read by any device that has the ability to understand java. This code is completely platform-independent.
4. Virtual Machines
- Your friends don’t have a physical Java Machine, but they all have a virtual Java machine (implemented in software) running inside their electronic gadgets. The virtual machine reads and runs the bytecode.

## How is code structured in Java?
Java's code structure of 3 things: the source file, class/es, and a main method.

## What is does a Java class look like?
```java 
public class SampleApp {
    public static void main (String[] args) {
        System.out.print("Hello World");
    }
}
```
- `public` - makes the class & method available to everyone
- `class` - in Java you have to declare the type of each new thing you make
- `SampleApp` - This is just the name of the app
- `{` / `}` - these tell the compiler where the code for a class or a method start, and end
- `void` - This is the return type of a method, in this case the return type is void because the method doesn't return a value
- `main` - the name of the method
- `String[] args` - arguments to the method. This method must be given an array of Strings, and the array will be called 'args'
- `System.out.print()` - this says "print to standard output" (defaults to the command-line)
- `"Hello World"` - this is the string that will be printed
- `;` - every statement MUST end in a semicolon


## A main( ) method???
In Java, everything goes in a class.
Running a program means telling the Java Virtual Machine (JVM) to
“Load the MyApp class, then start executing its main() method.
Keep running ‘til all the code in main is finished.”
The main() method is where your program starts running.
No matter how big your program is (in other words, no matter how many
classes your program uses), there’s got to be a main() method to get the
ball rolling

## How does Java handle a while loop?
In chapter 1 there are 3 types of loops mentioned: `while`, `do-while`, and `for` loops. This chapter only goes into the logic behind a `while` loop and it works just the same as in python. A conditional test is needed for the loop to even begin, and the result of the test is a `boolean` value (`true` || `false`). If the value is `true`, the code block will run and repeat, always starting at the test to check the value. Else if the value is `false`, the loop will not run and the program will continue past it, unless that is the end of your program.

## What does conditional branching look like in Java?
Conditional branching follows the same logic that a `while` loop follows, but with a couple differences. 
Take a look at this block of code
```java 
if (randomNumber > 5) {
    System.out.println("The number is greater than 5");
} else if (randomNumber < 5) {
    System.out.println("The number is less than 5");
} else if (randomNumber == 5) {
    System.out.println("The number is 5");
}
```
The if statements are checking if the conditional is `true` or `false`, but in a different way. Instead of saying "while the randomNumber is greater than 5, do this", its asking "If the randomNumber is greater than 5, do this. If not, do something else." This gives you greater reach for more conditions in your code, and they work together in tandum. 