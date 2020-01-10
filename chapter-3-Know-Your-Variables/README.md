## Know Your Variables

## Table of Contents
- Declaring a variable (Java cares about *type*)
- Primitive types ("I'd like a double with extra foam, please")
- Java keywords
- Reference variables (remote control to an object)
- Object declaration & assignment
- Objects on the garbage-collectible heap

## What does Java think is a variable?
Java cares about types. You are not allowed to put two different types together into one variable.

- Types of variables
*Primitive*
These hold fundamental values. Simple bit patterns. (integers, booleans, & floats)
*Object Reference*
Holds references to objects

Variables must have a name & a type
```java

public class App {
 public static void main(String[] args) throws Exception {
 int count = 0
 }
}
```
### Rule of thumb for naming variables
- Must start with a letter, underscore (_), or a dollar sign ($).
- Don't start with a number, but they can be used in the name.
- Name can be whatever you want, but they can be java keywords.


## What is a primitive variable?
A primitive variable is just like a cup. A container. It holds stuff, & in this case its a value. 
2 Characteristics: Size & Type 

|Type|Bit Depth|Value Range|
|---|---|---|
|Boolean|JVM-Specific|`true` or `false`|
|Char|16 bits|0 - 65,535|
|byte|8 bits|-128 - 127|
|short|16 bits|-33k - 33k|
|int|32 bits|-2.15m - 2.15m|
|long|64 bits|-huge - huge|
|float|32 bits|vaires|
|double|64 bits|vaires| 

## Java keywords?
Java has, as of right now, 51 keywords. I'm not naming them all, & you don't have to remember them. Just acknowledge their existence.

## What are reference variables?
A reference variable isn't an object, but it holds the bits that allow you to access an object.
The tricky thing about reference variables is that we don't know what's inside the variable.
We do know that whatever it is, it represents one & only one object. JVM knows how to use the reference to get to the object.

## What is declaration & assignment?
- Step 1: Declare the reference variable
Tells the JVM to allocate space for the reference variable & names that variable myDog. The reference variable is, forever, of type dog.
- Step 2: Create an object
JVM allocates space in the heap for the new object.
- Step 3: Link the object & reference
Assigns the new Dog to the reference variable myDog.

## What is the garbage-collectible heap?
The garbage heap is where reference variables go to live & die. When they are created they need someplace to sit to be interacted with. Once they are finished being used, they disappear & die.
