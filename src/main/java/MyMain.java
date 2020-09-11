//Jennifer O'Byrne String Checker Homework
import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int len = str.length();
        int abc = 0;
        int def = 0;
        for (int i = 0; i < len; i++) {
            char val = str.charAt(i);
            if (val == 'a') {
            abc = abc + 1;
        }
        else {
            def = def + 1;
        }
        if (val == 'b') {
            abc = abc + 1;
        }
        else {
            def = def + 1;
        }
        if (val == 'c') {
            abc = abc + 1;
        }
        else {
            def = def + 1;
        }
        
        }
        return abc;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        String string2 = str.toLowerCase();
        int idx1 = string2.indexOf("the");
        if (idx1 != -1) {
            return true;
        }
        else {
            return false;
        }
        
    }

    // Checks whether str is a palindrome or not
    public static Boolean isPalindrome(String str) {
        int len = str.length();
        String backwards = "";
        for (int i = (len - 1); i >= 0; i = i - 1) {
            char letter = (str.charAt(i));
            backwards = backwards + letter;   
        }
        String str1 = str;
        String str2 = backwards;
        boolean b2 = str1.equals(str2);
        return b2;    
        }
       
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string to test.");
        String word = scan.next();
        System.out.println(countABC(word));
        System.out.println(containsThe(word));
        System.out.println(isPalindrome(word));
        // YOUR CODE HERE
        scan.close();
    }
}
