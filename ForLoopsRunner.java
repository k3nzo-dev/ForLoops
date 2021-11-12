import java.util.Scanner;
/**
 * Gives user the choice of which forloop methods to run
 * SPECIAL FEATURES: Use of catch statements
 * @author Lorenzo Boschi
 * @version 1.0
 */
public class ForLoopsRunner
{
   public static void main(String[] args)
   {
      ForLoops f   = new ForLoops();
      Scanner  s   = new Scanner(System.in);
        
      boolean done = false;   //allows multiple runs of the code
        
      int choice   = 0;
        
        //keep allowing user to choose until they quit:
      while(!done)
      {
         System.out.print("\nMake a choice (1-7) 0 to quit: ");
            
            //List of options:
         String list = 
                "1. Count Vowels\n"  +
                "2. Reverse stuff\n" +  
                "3. Encrypt\n"       +
                "4. Show Board\n"    +
                "5. Show Primes\n"   +
                "6. Guess For Dollars\n" +
                "7. Decrypt\n";
      
         System.out.print("\n" + list + "Your choice: ");

            //get choice number:
         choice = s.nextInt();



            //clear the newline character still left in the stream:
         s.nextLine();
            //blank line for better readability:
         System.out.println();
            
         if(choice == 0)   //user has quit
         {
            done = true;
         }
         else  //user has chosen a method:
         {
                //calls method associated with given choice:
            switch(choice)
            {

               case 1:
                  System.out.println("What string would you like to check for vowels?");
                  String VowelText = s.nextLine();
                  System.out.println("There are " + f.countVowels(VowelText) + " vowels in "
                          + VowelText);
                  break;
               case 2:
                  System.out.println("What string would you like to reverse?");
                  String reverseText = s.nextLine();
                  System.out.println(reverseText + " reversed is " + f.reverseIt(reverseText));
                  break;
               case 3:
                  try {
                     System.out.println("What string you you like to encrypt?");
                     String encryptImput = s.nextLine();
                     System.out.println("How much you you like to encrypt by?");
                     int encryptAmt = s.nextInt();
                     System.out.println(f.encrypt(encryptImput, encryptAmt));
                  } catch(Exception e){
                     System.out.println("Invalid input");
                     System.out.println();
                  }
                  break;
               case 4:
                 try {
                    System.out.println("What size would you like the board to be?");
                    int boardSize = s.nextInt();
                    f.showBoard(boardSize);
                 } catch(Exception e){
                    System.out.println("Invalid input");
                    System.out.println();
                 }
                  break;
               case 5:
                  try{
                  System.out.println("What in the smallest number you want to test?");
                  long imput1 = s.nextLong();
                  System.out.println("What in the largest number you want to test?");
                  long imput2 = s.nextLong();
                     System.out.println("There are " + f.showPrimes(imput1, imput2).size() +
                             " primes between " + imput1 + " and " + imput2);// only prints the amount of primes
                     System.out.println("Would you like a list of all of those primes?" +
                             "(Enter Y,Yes, or 1)");
                     String primesChoice = s.nextLine();
                     if (primesChoice.equalsIgnoreCase("y")
                             || primesChoice.equalsIgnoreCase("yes")
                             || primesChoice.equalsIgnoreCase("1"))
                                 System.out.println(f.showPrimes(imput1, imput2));// prints all the primes if asked
                  } catch(ArithmeticException e){
                     System.out.println("Invalid range");
                     System.out.println();
                  }catch(Exception e){
                     System.out.println("Invalid input");
                     System.out.println();
                  }
                  break;
               case 6:
                  f.guessForDollars();
                  break;
               case 7:
                  try {
                     System.out.println("What string you you like to decrypt?");
                     String decryptImput = s.nextLine();
                     System.out.println("What amount would you like to decrypt by?");
                     int decryptAmt = s.nextInt();
                     System.out.println(f.decrypt(decryptImput,decryptAmt));
                  }catch (Exception e){
                     System.out.println("Invalid input");
                     System.out.println();
                  }


               default:
                  break;
            }
         }
         System.out.println("Hit ENTER to go back to the main menu...");
         s.nextLine();
      }
      s.close();
      System.exit(0);  //closes console
   }
}
