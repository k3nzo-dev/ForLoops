
/**
 * Write a description of class ForLoops here.
 *
 * @author Lorenzo Boscho
 * @version 1.0
 */
public class ForLoops
{
    // NOTE: for all of these methods, when using Scanner to get words from the
    //   user, use .nextLine(), NOT .next(), even if the user is entering just 
    //   one word!!!
    
    //you'll want your Scanner object (and if you are usuing a Utility object)
    //  as instance variables here, so they can be used in all the methods
    
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
        return  count;
    }
    public void reverseIt()
    {
        System.out.println("NO CODE YET!"); 
    }

    public void encrypt()
    {
        System.out.println("NO CODE YET!");  
    }
    
    public void showBoard()
    {
        System.out.println("NO CODE YET!");   
    }

    public void showPrimes()
    {
        System.out.println("NO CODE YET!");
    }

    public void guessForDollars()
    {
        System.out.println("NO CODE YET!");
    }

    public void yourOwn()
    {
        System.out.println("NO CODE YET!"); 
    }

    /**
     * THESE 3 ARE HONORS ONLY:
     */
    public void countConsonants()
    {
        System.out.println("NO CODE YET!"); 
    }

    public void showFancyBoard()
    {
        System.out.println("NO CODE YET!");
    }

    public void reverseByWord()
    {
        System.out.println("NO CODE YET!");  
    }
}
