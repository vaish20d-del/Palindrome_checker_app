import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void reverse_and_check(String word){
        boolean status = true;
        String rev="";
        //reverse
        for(int i=word.length()-1; i>=0; i--)
        {
            rev = rev + word.charAt(i);
        }


        if(word.compareTo(rev) == 0)
        {
            System.out.println("Is it a Palindrome?"+status);
        }

        else
        {
            status = false;
            System.out.println("Is it a Palindrome?"+status);

        }

    }

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.print("Input text: ");
        String name = s1.next();
        reverse_and_check(name);
    }
}