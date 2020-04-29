/**
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * *       PSEUDOCODE    * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Start
 * initialize scanner class
 * initialize random class
 * declare and initailize variable to store max range for random number
 * declare variable to store max range of random nuber
 * declare and initialize variable to store min range of random number
 * declare and initialize vairable to store random number to be used as index number
 * declare string variable to store the randomly selcted word
 * declare string varible to store input word or letter or substring from user
 * declare and initialize boolean vairable to while loop control
 * declare and intialize vaible for the bad guess
 * declare and initialize variable to count number of times input is given
 *
 * create arraylist of words
 * populate the arraylist with given words
 * calculate length of arraylist for words
 * assign the length of arraylist so that random number will be generated from zero to this max number not inclusive
 * generate random number to select one word randomly
 * use the random number as an index to the selected word
 * create arraylist to store data entered by user
 * 	    FOR LOOP
 * 		    print understore in place of each letter in the randomly selected word
 * 	    END FOR LOOP
 * print welcome
 * notify user to start playing
 * 	    WHILE LOOP (control true)
 * 		    prompt user to enter data
 * 		    scan and save what user entered
 * 		    covert input word to lowercase for fair comparison
 * 		    covert current word to lowercase
 * 		    create a boolean varibale and assign the value if current_word String contains input letter or string
 * 		    increament input count
 * 			    IF (input and current_word string are equal ignoring case)
 * 				    call the method congratulations with current_word as parameter
 * 				    return
 * 			    ELSE IF (the boolean variable equals true means either a letter or a substring entered exists in the current word)
 * 				    declare and initialize input length
 * 				    declare and initialize indexOf input
 * 				    // check if input already exists in previous guesses
 * 				    declare and initialize temporary string variable temp
 * 					    FOR LOOP
 * 						    concatenate vaiable temp with string values of of guesses arraylist or guesses.get(current index)
 * 					    END FOR LOOP
 * 					    IF ( temp string contains the current input)
 * 						    increament bad guess
 * 						    print that user reapeting inputs incorrectly
 * 					    ELSE
 * 						    FOR LOOP-1
 * 							    FOR LOOP-2
 * 								    IF (each respective charAt of input and current word are identical)
 * 									    from the input select the characted at current index cast it to string and assign it to  a string variable
 * 									    replace guesses arraylist (was initially underscore) at current index with this string
 * 								    END IF
 * 							    END FOR LOOP-2
 * 						    empty the value in temp string
 * 						    FOR LOOP
 * 							    concatenate temp string with values of guesses arraylist or the total input so far.
 * 						    END FOR LOOP
 * 						    IF (the string temp is equal to current word
 * 							    call for congratulations(current word)
 * 							    return
 * 						    END IF
 * 					    END IF
 * 			    ELSE
 * 				    increament bad guess count
 * 				    print the number of times out of allowable six the user entered incorrectly
 * 			    END IF
 * 			    IF (number of bad guess is greater than five)
 * 				    print no more chance left and display the current word
 * 				    thank user
 * 				    assign the while loop control to be false
 * 				    return
 * 			    END IF
 * 			    IF (count of input is greater than one means this is not the first guess trial)
 * 				    print the user's guess so far.
 * 			    // display what the user guessed
 * 				    FOR LOOP
 * 					    print the content of guesses arraylist
 * 				    END FOR LOOP
 * 				    print new line
 * 			    END IF
 * 		    END WHILE
 * // method congratulations(String word)
 * 	print user won! and display the current word randomly selected.
 * 	print thank you
 * end
 *
 * * * * * * * * * * * * * * * * *       TEST DATA - 1    * * * * * * * * * * * * * * * * * * *
 *
 *Welcome, let's play hangman!
 *
 * Here is the word I am thinking of: _ _ _ _
 *
 * Enter letter or word guess: 1l
 * You have guessed incorrectly 1/6 times.
 * Your guess so far: _ _ _ _
 *
 * Enter letter or word guess: 1t
 * You have guessed incorrectly 2/6 times.
 * Your guess so far: _ _ _ _
 *
 * Enter letter or word guess: 1r
 * Your guess so far: r _ _ _
 *
 * Enter letter or word guess: 1r
 * You guessed repeatedly/incorrectly 3/6 times.
 * Your guess so far: r _ _ _
 *
 * Enter letter or word guess: 1r
 * You guessed repeatedly/incorrectly 4/6 times.
 * Your guess so far: r _ _ _
 *
 * Enter letter or word guess: 1a
 * Your guess so far: r a _ _
 *
 * Enter letter or word guess: 1n
 * Your guess so far: r a _ n
 *
 * Enter letter or word guess: 1y
 * You have guessed incorrectly 5/6 times.
 * Your guess so far: r a _ n
 *
 * Enter letter or word guess: 1h
 * You have guessed incorrectly 6/6 times.
 * Sorry, you have no more guesses left. The word was: rain
 *
 * Thank you for playing!
 *
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SimpleHangman {
    public static void main(String[] args) {
//INPUT
        // initialize Scanner class
        Scanner keyboard = new Scanner(System.in);
        // initialize Random class
        Random rnd = new Random();

        int num = 0;                                         // variable to initialize max range for random number
        int high;                                            // varible to store max range for random number
        int low = 0;                                         // variable to store min range for random number
        int index_words = 0;                                 // variable to store random number to be used as index num
        String current_word;                                 // variable to store the randomly selected word
        String input;                                        // variable to store the string from client
        boolean cont = true;                                 // variable to store while loop control

        int bad_guess = 0;                                   // variable to store the count of incorrect guesses
        int count_input = 0;                                 // variable to store the number of input

        ArrayList<String> words = new ArrayList<>();         // ArrayList to store words for the play
        words.add("tree");                               // populate the arraylist
        words.add("rain");                               // populate the arraylist
        words.add("bear");                               // populate the arraylist
        words.add("encourage");                          // populate the arraylist
        words.add("promise");                            // populate the arraylist
        words.add("soup");                               // populate the arraylist
        words.add("chess");                              // populate the arraylist
        words.add("insurance");                          // populate the arraylist
        words.add("pancakes");                           // populate the arraylist
        words.add("stream");                             // populate the arraylist

        // number of words available in the arraylist
        num = words.size();
        // assign arraylist length to high so that we can use the number as a max range for random number
        high = num;

        // generate random numbers
        index_words = low + rnd.nextInt(high - low);
        // with the generated random number select an index as random number and the respective word
        current_word = words.get(index_words);

        // creare arraylist to store what the user guesses
        ArrayList<String> guesses = new ArrayList<>();
        // initialize guesses array with underscore with
        // now this guess array will have equal number of elements
        // with the number of characters in the selected word
        for (int i = 0; i < current_word.length(); i++) {
            guesses.add("_");
        }

        // welcome the user
        System.out.println("Welcome, let's play hangman!\n");
        System.out.print("Here is the word I am thinking of: ");
        // print underscore with equal number of currently selected random word
        // as a clue to the user who is guessing
        for (int i = 0; i < guesses.size(); i++) {
            System.out.print(guesses.get(i) + " ");
        }
        System.out.println();
// PROCESS
        while (cont == true) {

            // prompt user to enter a word or a letter or substring that are found in the current word
            System.out.print("\nEnter letter or word guess: ");

            // scan and store the user input
            input = keyboard.nextLine();

            // make sure comparison is made with all lower case
            input = input.toLowerCase();
            current_word = current_word.toLowerCase();

            // check if the randomly selcted word contains all or part of the string entered
            boolean good_guess = current_word.contains(input);
            count_input++;

// OUTPUT

            // if user kicks it perfect right
            if (input.equalsIgnoreCase(current_word)) {
                congratulations(current_word);
                return;
            }
            // if user types part of the correct answer
            else if (good_guess) {

                int input_length = input.length();

                int index_of_input = current_word.indexOf(input);

                // check if input is already entered
                // copy entered arraylist into temp String by concatenation
                String temp = "";
                for (int i = 0; i < current_word.length(); i++) {
                    temp += guesses.get(i);
                }
                if (temp.contains(input)) {  // true if value is already entered
                    bad_guess++;
                    System.out.println("You guessed repeatedly/incorrectly " + bad_guess + "/6 times.");
                } else {
                    // compare each character to each char of the current word
                    for (int i = 0; i < input_length; i++) {
                        for (int j = index_of_input; j < current_word.length(); j++) {
                            if (input.charAt(i) == current_word.charAt(j)) {
                                String str = Character.toString(input.charAt(i));
                                guesses.set(j, str);
                            }
                        }
                    }   // end of for loop

                    temp = "";
                    for (int i = 0; i < current_word.length(); i++) {
                        temp += guesses.get(i);
                    }

                    if (temp.equalsIgnoreCase(current_word)) {
                        congratulations(current_word);
                        return;
                    }
                }

            } else {
                bad_guess++;
                System.out.println("You have guessed incorrectly " + bad_guess + "/6 times.");
            }
            if (bad_guess > 5) {
                System.out.println("Sorry, you have no more guesses left. The word was: " + current_word);
                System.out.println("\nThank you for playing!");
                cont = false;
                return;
            }
            // give user clue and status update so far
            if (count_input > 0) {
                System.out.print("Your guess so far: ");
                for (int i = 0; i < guesses.size(); i++) {
                    System.out.print(guesses.get(i) + " ");
                }
                System.out.println();
            }

        }   // end of while loop

    }   // end of main() method

    public static void congratulations(String word) {
        System.out.println("You have won! The word was " + word + ".");
        System.out.println("\nThank you for playing!");
        System.out.println("================================================");

    }   // end of congratulation class


}   // end of class
