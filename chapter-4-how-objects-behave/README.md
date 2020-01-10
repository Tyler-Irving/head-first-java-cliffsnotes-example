## How Objects Behave

## Table of Contents
- Methods use object state (bark different) 
- Method arguments and return types 
- Pass-by-value (the variable is always copied) 
- Getters & Setters
- Encapsulation (do it or risk humiliation) 

## What is "Object State"?
An "Object State" is referring to how the instance variables & methods will react with each other.

## How do methods & their arguments interact with each other?
Methods can have multiple parameters, seperated by commas when they are declared, & when you pass them in the arguments.
```java 
// method that could be inside of a class
void taketwo(int x, int y) {
 int z = x + y;
 System.out.println("Value " + z);
}
```
In this method "taketwo", it requires 2 parameters (x & y), & they must be intergers.

## What is a pass-by-value?
pass-by-value can be thought of pass-by-copy

### Breakdown
If you declare an int variable & assign the value of 7, the bit pattern goes into the variable, x.
Now declare a method with an int param named z.
Calling the `go` method with the variable x will copy the bits of x & change/copy them into the z parameter of go.
```java 
int x = 7; // Declare an int variable and assign it the value 7

void go(int z) { } // Decalare a method with an int parameter named z

foo.go(x)
void go(int z) { } // Call the go() method, passing the variable x as the argument. The bits in x are copied, and the copy lands in z.
```
## Getters & Setters?
A `Getters` sole purpose?
Sending back the return value of whatever you're interacting with.

A `Setters` sole purpose?
Lives to take an argument value & use it to set the value of an instance variable.

## Encapsulation?
Encapsulation is the ability to let your data be public or private. 
Rule of thumb: 
Mark instance variables private & provide public `getter` & `setter` methods for access control.
