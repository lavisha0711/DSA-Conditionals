//Write a Java program to check if a number is a palindrome in Java? ( 121 is a palindrome, 321 is not) 
//A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is 
//a palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a 
//palindrome because the reverse of 321 is 123, which is not equal to 321. 
import java.util.*;
public class ques3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check palindrome: ");
        int num = sc.nextInt();

        if(isPalindrome(num))
        {
            System.out.println("The number is palindrome");
        }
        else
        {
            System.out.println("The number is not palindrome");
        }

    }
    public static boolean isPalindrome(int num)
    {
        int myNum = num;
        int rev = 0;
        while(num > 0)
        {
        int lastDigit = num % 10;
        rev = rev * 10 + lastDigit;
        num = num / 10;
        }

        

        if(rev == myNum )
        {
            return true;
        }
        else{
            return false;
        }

    }
}