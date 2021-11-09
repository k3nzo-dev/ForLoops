/**
 * Write a description of class ForLoops here.
 *
 * @author Lorenzo Boschi
 * @version 1.0
 */

import java.awt.*;
import java.util.ArrayList;

public class ForLoops {

    /**
     * Counts the vowels in a String
     * @param text The String in which the vowels are counted
     * @return The number of vowels in the String
     */
    public int countVowels(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
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
     * @param input The String that gets reversed
     * @return The reversed String
     */
    public String reverseIt(String input) {
        String fnlTxt = "";
        for(int i = 0; i <= (input.length() - 1); i++)
        {
            fnlTxt += input.charAt(input.length() - (i+1));
        }
        fnlTxt += fnlTxt.toLowerCase();
        return fnlTxt;
    }

    /**
     * Counts the vowels in a String
     * @param encryptImput The String that is encrypted
     * @param shiftAmt The amount that the String is changed in UNICODE values
     * @return The encrypted String
     */
    public String encrypt(String encryptImput, int shiftAmt) {
        String fnlText = "";
        for (int i = 0; i < encryptImput.length(); i++) {
            char charHolder = encryptImput.charAt(i);
            for (int j = 0; j < shiftAmt; j++) {
                if (charHolder == 'z') {
                    charHolder = 'a';
                } else {

                    charHolder++;
                }
            }
            fnlText = fnlText + charHolder;
        }

        return fnlText;
    }

    //FINISH TONIGHT work on getting the grid check notes
    public void showBoard(int size) {
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                    System.out.print("☤   ");

                }
                    System.out.print("☢   ");
            }
            System.out.println("");
        }

    /**
     *
     * @param min The smallest number that will be tested for primeness
     * @param max The largest number that will be tested for primeness
     * @return the number of primes in the range of min and max
     */
    public ArrayList showPrimes(long min, long max) {
        ArrayList primes = new ArrayList();
        boolean isPrime = true;

        for (long number = min; number <= max; number++) {
            if(number != 2) {
                if (number % 2 == 0) {

                } else {
                    long end = (long)(Math.sqrt(number) + 1);
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
        System.out.println("NO CODE YET!");
    }

    /**
     * Decrypts text from the Encrypt method
     * @param decryptInput The String that is decrypted
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


