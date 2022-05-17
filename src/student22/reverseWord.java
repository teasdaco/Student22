
package student22;

/**
 *
 * SYST17796 Fundamentals of Software Design and Development
 * @author Colin Teasdale   
 */
import java.util.Scanner;

public class reverseWord 
{
    public static void main(String[] args)
    {
        System.out.println("Please enter your name: ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        
        //test
        
        char [] myWord = new char [word.length()];
        for(int i = 0; i < word.length(); i++ )
        {
            myWord [i] = word.charAt(i);
            System.out.print(myWord[i]);
        }
        System.out.println();
        for (int i = word.length()-1; i>= 0; i--)
        {
            myWord[i] = word.charAt(i);
            System.out.print(myWord[i]);
        }
        System.out.println();
    }
}
