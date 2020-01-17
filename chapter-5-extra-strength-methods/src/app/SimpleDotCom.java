package app;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public static void main(String[] args) {
        int numOfGuesses = 0; // make a variable to track how many guesses the user makes

        GameHelper helper = new GameHelper(); // this is a special class we wrote that has the method for getting user
                                              // input

        SimpleDotCom theDotCom = new SimpleDotCom(); // make the dot com object

        int randomNum = (int) (Math.random() * 5); // make a random number for the first cell

        int[] locations = { randomNum, randomNum + 1, randomNum + 2 }; // using the number for the first cell, make the
                                                                       // rest of the cells in an array
        theDotCom.setLocationCells(locations); // give the dot com its locations (the array)
        boolean isAlive = true; // make a boolean variable to track wether the game is still alive

        while (isAlive == true) { // while loop repeats the game if `isAlive` is true
            String guess = helper.getUserInput("enter a number"); // get user input string

            String result = theDotCom.checkYourself(guess); // ask the dot com to check the guess; save the returned
                                                            // result in a String

            numOfGuesses++; // increment guess count

            if (result.equals("kill")) { // was it a kill?
                isAlive = false; // if it is a kill then set `isAlive` to false

                System.out.println("You took " + numOfGuesses + " guesses"); // print user guess count at the end of the
                                                                             // game
            }
        }
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess); // convert the String to an int

        String result = "miss"; // make a variable to hold the result we'll return. put "miss" in as the default
                                // (i.e. we assume a "miss")

        for (int cell : locationCells) { // repeat with each cell in the locationCells array (each cell location of the
                                         // objects)

            if (guess == cell) { // compare the user guess to this element (cell) in the array

                result = "hit"; // we got a hit

                numOfHits++; // we got a hit

                break; // gets the program out of the loop
            } // end if
        } // end for

        if (numOfHits == locationCells.length) {
            result = "kill"; // out of the loop, but checking to see if we are now 'dead' (hit 3 times) and
                             // change the result String to "kill"
        } // end if

        System.out.println(result); // display the result for the user ("Miss", unless it was changed to "hit" or
                                    // "kill")

        return result; // return the result back to the calling method
    }
}