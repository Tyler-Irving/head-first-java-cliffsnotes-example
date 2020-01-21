## Using the Java Library

## Table of Contents
- Analying the bug in the Simple Dot Com Game 
- ArrayList (taking advantage of the Java API) 
- Fixing the DotCom class code 
- Building the real game (Sink a Dot Com) 
- Prepcode for the real game 
- Code for the real game 
- boolean expressions 
- Using the library (Java API) 
- Using packages (import statements, fully-qualifi ed names) 
- Using the HTML API docs and reference books 
- Exercises and puzzles 

## Where is the bug?
In the last chapter we made the `SimpleDotCom` game. In that game we haphazardly created a bug. 
```java 
if (guess == cell) {
    result = “hit”; // Here’s where it goes wrong. We counted a hit every time the user guessed a cell location, even if
    // that location had already been hit! We need a way to know that when a user makes a hit, he hasn’t previously hit that
    // cell. If he has, then we don’t want to count it as a hit.
    numOfHits++;
    break;
}
```