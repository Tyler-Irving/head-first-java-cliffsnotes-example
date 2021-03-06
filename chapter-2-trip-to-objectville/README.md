## A Trip to Objectville

## Table of Contents
- Chair Wars
- Intro to Inheritance
- Intro to Overriding Methods
- What's in a Class
- Making Your First Object

## Why are they fighting over chairs? 
link to the story: http://ikucukkoc.baun.edu.tr/lectures/EMM3115/Head_First_Java.pdf
(the story is referenced on pages 28 - 30)
STORY OVERVIEW 
Two programmers are tasked with the same project, but the first one done with the project will win a chair.
One programmer favors the procedural programming method & the other favors the object-oriented programming (OOP) method.
They both get the project done, but the chair was given to a different person for a different reason that doesn't matter. What matters in this story is the tongue in cheek way they explain how OOP would be a great choice, in this specific project of course. The OOP programmer goes on to explain why the project was relatively simple, even when the project manager added an extra feature. (you have eyes, just follow the link & read the story if you care about the specific details)

## Inheritance? I don't remember any recent deaths in the family.
When `inheritance` is brought up in programming, nine times out of ten you can assume you are working with classes. Considering Java is a class-based programming language this makes perfect sense, but I have to assume you have no idea what I'm talking about. There are three general steps to being able to recognize that you can use inheritance before you even start working on your project.
### The 3 Steps to Achieving Inheritance Nirvana
- Step 1: 
Recognize what the objects of your project will have in common. In the story aforementioned, all the objects were rotating shapes that made a certain noise when they were hovered/clicked on.
- Step 2: 
Once you've established what all the objects will have in common, you can create a single `superclass` which holds the code that makes the objects do what you want them to. In this case, you would have all your objects rotate & make noise. Crazy stuff man.
- Step 3: 
Now that your `superclass` is made, you can start on the classes that will make up your objects (yes i am talking about the shapes). To make these classes do what you created in the superclass, just inherit the class into the shape classes.

```java
class Shape {
 // rotate()
 // playSound()
}

class Square extends Shape {
 // sample code
}

class Circle extends Shape {
 // sample code
}

class Triangle extends Shape {
 // sample code
}

class Amoeba extends Shape {
 // sample code
}

```
## Overriding methods?
Overriding methods is built in to allow programmers the ability to change something about an object, without having to write a whole new class. In the case of the story both of the programmers finish the project, but the project manager hits them with the "We need this new part added last minute. Think you can handle it? *doesn't wait for answer* Sweet. Get it to me by the end of the day" So the procedural programmer has to write a new function to appease the demands of the said project manager. The OOP programmer doesn't have to write a whole new class, he gets to override his 'rotation' method with the appropriate details for this specific shape. 
```java
class SuperClass {
 // rotate()
 // playSound()
}

class Square extends SuperClass {
 // sample code
}

class Circle extends SuperClass {
 // sample code
}

class Triangle extends SuperClass {
 // sample code
}

class Amoeba extends SuperClass {
 // rotate {
 // shape's specific rotation code
 //}
 //playSound {
 // shape's specific sound code
 //}
}
```

## What's in a class?
This has been boiled down to two basic things: 
- Instance Variables
- Methods

Instance variables are things that the object that will be created from this class knows about itself.
Methods are what an object can do. To establish an understanding of your instance variables & methods early, you have to take a moment before writing the class to understand what they should be doing. In the case of instance variables, you have to think about what the object needs to know about itself. Once that is done you can design methods to complete the work that you need to. 

### Clarification
A class is NOT an object! 
A class IS a blueprint to create objects! 

This is why you can hold all the basic information in a superclass, & create different objects with them.
Another way of looking at is like making a pie, they all start the same way, but the taste & look completely different.

## How does one make an object?
To make an object you first have to create two classes. One class is going to be a tester class. This class is strictly to test that you can successfully make objects with the other class. The second class is the blueprint that creates objects through your JVM.

### Example
```Java

//Step 1 Make the blueprint class
class Dog {
 int size;
 String breed;
 String name;

 void bark() {
 sytem.out.Println("Ruff")
 }
}

//Step 2 Make the test class
class DogTestDrive {
 public static void main(String[] args){
 Dog d = new Dog();
 d.size = 40;
 d.bark();
 }
}


 ```