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

## Methods arguments and return types
Methods can return values. Every method is declared with a return type, but we have only used void return type. Which means they don't give anything back
``` java
void go() {

}
```
But we can declare a method to a specific type of value back to the caller
``` java
int giveSecret() {
     return 42;
}
```
Methods have have multiple parameters. They are seperated with a commas when you declare them. If a method has parameters, you must pass arguments of the right type and order

Calling a 2 parameter method, and sending it two arguments

``` java
void go() {
    TestStuff t = new TestStuff();
    t.takeTwo(12, 34); // The arguments you pass land in the same order you passed them. 12 goes for x, 34 goes for y
}
void takeTwo(int x, int y) {
    int z = x + y;
    System.out.println("Total is " + z);
}
```

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

``` java
class ElectricGuitar {
    String brand;
    int numOfPickups;
    boolean rockStarUsesIt;
    String getBrand() {
        return brand;
    }
    void setBrand(String aBrand) {
        brand = aBrand;
    }
    int getNumOfPickups() {
        return numOfPickups;
    }
    void setNumOfPickups(int num) {
        numOfPickups = num;
    }
    boolean getRockStarUsesIt(boolean yesOrNo) {
        rockStarUsesIt = yesOrNo;
    }

}
```

## Encapsulation?
Encapsulation is the ability to let your data be public or private. 
Rule of thumb: 
Mark instance variables private & provide public `getter` & `setter` methods for access control.


## Using references in arrays
just like any other object. The only difference is how you get to them.

Calling a method on Dog objects in an array step 1 : Declare and create a Dog array, to hold 7 Dog references.
``` java
Dog[] pets;
pets = new Dog[7];
```
step 2 : Create two newDog objects, and assign them to the first two array elements.
```java
pets[0] = new Dog();
pets[1] = new Dog();
```
step 3 : Call methods on the two Dog objects
```java
pets[0].setSize(30);
int x = pets[0].getSize();
pets[1].setSize(8);
```