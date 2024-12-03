import java.util.*;
public class PalindromeString  {

    public static String myReversedString(String str){
        char ch[] = str.toCharArray();
        String rev_string = "";
        
        for(int i = str.length()-1; i>=0; i--){
            rev_string = rev_string + ch[i];
        }

        return rev_string;
    }

    public static void main(String[] kk){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a string: ");
        String entered_string = sc.nextLine();

        String reversed_string = myReversedString(entered_string);

        System.out.println("Reversed string is: '"+reversed_string+"'\n");
        String entered_string1 = entered_string.toLowerCase();
        String reversed_string1 = reversed_string.toLowerCase();

        if(entered_string1.equals(reversed_string1))
            System.out.println("Given string '"+entered_string+"' is a palindrome string....\n");
        
        else
            System.out.println("Given string '"+entered_string+"' is not a palindrome string....\n");
    }
}