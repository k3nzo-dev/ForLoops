/**
 * The ForLoops Class is methods 7 methods of various complexity
 *
 * @author Lorenzo Boschi
 * @version 1.0
 */

import java.util.Scanner;
import java.util.ArrayList;

public class ForLoops {

    Scanner s = new Scanner(System.in);

    /**
     * Counts the vowels in a String
     *
     * @param text The String in which the vowels are counted
     * @return The number of vowels in the String
     */
    public int countVowels(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) { //steps through every vowel
            if (text.charAt(i) == 'a') {
                count++;
            } else if (text.charAt(i) == 'e') {
                count++;
            } else if (text.charAt(i) == 'i') {
                count++;
            } else if (text.charAt(i) == 'o') {
                count++;
            } else if (text.toLowerCase().charAt(i) == 'u') {
                count++;
            }

        }
        return count;
    }

    /**
     * Reverses a String
     *
     * @param input The String that gets reversed
     * @return The reversed String
     */
    public String reverseIt(String input) {
        String fnlTxt = "";
        for (int i = 0; i <= (input.length() - 1); i++) {
            fnlTxt += input.charAt(input.length() - (i + 1)); // adds the furthest number to a blank text
        }
        fnlTxt += fnlTxt.toLowerCase(); //to fix case problems
        return fnlTxt;
    }

    /**
     * Counts the vowels in a String
     *
     * @param encryptImput The String that is encrypted
     * @param shiftAmt     The amount that the String is changed in UNICODE values
     * @return The encrypted String
     */
    public String encrypt(String encryptImput, int shiftAmt) {
        String fnlText = "";
        for (int i = 0; i < encryptImput.length(); i++) {
            char charHolder = encryptImput.charAt(i);//takes the char to encrypt
            for (int j = 0; j < shiftAmt; j++) {
                if (charHolder == 'z') { //stops Z from being a problem char
                    charHolder = 'a';
                } else {
                    charHolder++;
                }
            }
            fnlText += charHolder;
        }

        return fnlText;
    }

    /**
     * Shows a checkered board of unicode characters
     * SPECIAL FEATURES: uses 2 random unicode characters
     *
     * @param size the length and width of the board
     */
    public void showBoard(int size) {

        char char1 = (char) ((int) (Math.random() * 143859));//generates a random unicode char
        char char2 = (char) ((int) (Math.random() * 143859));

        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                if ((x + y) % 2 == 0)//if x + y is even then it is the first square
                {
                    System.out.print(char1 + "   ");//uses tab for spacing
                } else {
                    System.out.print(char2 + "   ");
                }
            }
            System.out.println("");
        }

    }

    /**
     * Shows the amount of prime numbers in a range and can print all of them if asked
     * SPECIAL FEATURES: use of throw/catch
     *
     * @param min The smallest number that will be tested for primeness
     * @param max The largest number that will be tested for primeness
     * @return the number of primes in the range of min and max
     */
    public ArrayList showPrimes(long min, long max) {
        ArrayList primes = new ArrayList();
        if (max < min) {
            throw new ArithmeticException("Your minimum is larger than your maximum");
        }
        for (long number = min; number <= max; number++) {
            if (number != 2) {
                if (number % 2 == 0) {

                } else {
                    long end = (long) (Math.sqrt(number) + 1);
                    for (long divisor = 3; divisor <= end; divisor += 2) {
                        if (number % divisor == 0) {
                        }
                    }
                    primes.add(number);
                }

            } else {
                primes.add(number);
            }
        }
        System.out.println(primes.size());
        return primes;
    }

    public void guessForDollars() {
        ArrayList pastGuess = new ArrayList();
        String cont;
        int playerAmt = 500;
        int playerBet;
        int range1;
        int range2;
        int goalNumber;
        boolean correct = false;
        boolean exit = false;
        try {

            while (!exit) {
                range1 = (int) (Math.random() * 1000);//takes a random range
                range2 = range1 + (int) (Math.random() * (1000));
                goalNumber = range1 + (int) (Math.random() * (range2 - range1));

                while (!correct) {
                    if (pastGuess.size() > 0)
                        System.out.println("Your past guesses were: " + pastGuess);
                    System.out.println("How much would you like to bet?, if you are within 100 of the number you keep your money.");
                    System.out.println("You have " + playerAmt);
                    playerBet = s.nextInt();
                    if (playerBet > playerAmt) {
                        throw new ArithmeticException("Bet greater than balance");
                    }
                    System.out.println("Guess a number between " + range1 + " and " + range2);
                    int guess = s.nextInt();
                    if (guess > range2 || guess < range1) {
                        throw new IllegalAccessException("Guess outside of range");
                    }
                    if (guess == goalNumber) {
                        System.out.println("You were correct!");
                        playerAmt += playerBet;
                        correct = true;

                    } else if (guess > goalNumber) {
                        System.out.println("You were too high, try again.");
                        pastGuess.add(guess);
                        if ((guess - goalNumber) > 100) {
                            playerAmt -= playerBet;
                        }
                    } else {
                        System.out.println("You were too low, try again");
                        pastGuess.add(guess);
                        if ((goalNumber - guess) > 100) {
                            playerAmt -= playerBet;
                        }
                    }
                }
                System.out.println("Would you like to play again \n (Yes or Y to continue, anything else to exit");
                cont = s.nextLine();
                if (cont.equalsIgnoreCase("y") || cont.equalsIgnoreCase("yes")) {
                } else {
                    exit = true;
                }
            }
        }catch (ArithmeticException e){
            System.out.println();
            System.out.println("ERROR: Bet greater than balance");
        }catch (IllegalAccessException e){
            System.out.println();
            System.out.println("ERROR: Guess outside of range");
        }
    }

    /**
     * Decrypts text from the Encrypt method
     *
     * @param decryptInput    The String that is decrypted
     * @param decryptShiftAmt The amount that the String is changed in UNICODE values
     * @return The decrypted String
     */
    public String decrypt(String decryptInput, int decryptShiftAmt) {
        String fnlText = "";
        for (int i = 0; i < decryptInput.length(); i++) {
            char charHolder = decryptInput.charAt(i);
            for (int j = 0; j < decryptShiftAmt; j++) {
                if (charHolder == 'a') {
                    charHolder = 'z';
                } else {

                    charHolder--;
                }
            }
            fnlText = fnlText + charHolder;
        }

        return fnlText;
    }
}


