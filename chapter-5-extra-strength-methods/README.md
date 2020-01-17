## Extra-Strength Methods

## Building the Sink Dot Com game & Prepcode
Your java should start with a high-level design   
Typically you’ll write three things you when you create a new class:
- Prepcode 
- Testcode
- Real code  

~~~ 
Prepcode should describe what to do, not how to do it. Implementation comes later.
- Use the prepcode to help design the test code.
- write test code before you implement the methods
- choose for loops over while loops when you know how many times you want to repeat the loop code
- Use the pre/post increment operator to add 1 to a variable (x++) and for decrement use (x++)
- Use Integer.ParseInt() to get the int value of a string
- Integer.ParaeInt() works only if the string represents a digit (“0”, “1”, “2”, etc)
- use break to leave a loop early (I.e, if the Boolean test condition is true
~~~

## For Loops

### Regular (non-enhance for loops)
``` java
    for(int i =0; i < 100; i++)
```
1) Initialize 
```java
    int i = o;
```
2) Boolean Test
``` java
    i < 100;
```
3) Iteration expression 
``` java 
    i++;
```
### Enhanced for loops
``` java
    for (String name: nameArray) {}
```
1) Iteration variable declaration 
``` java 
    String name
```
2) the actual collection 
``` java 
    nameArray
```