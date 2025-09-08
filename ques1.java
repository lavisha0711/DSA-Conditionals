// WAP  to print average of three numbers
import java.util.*;
public class ques1
{
    public static double average(double num1, double num2, double num3)
    {
        double avg = (num1 + num2 + num3) / 3;
        return avg;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number:");
        double num1 = sc.nextDouble();
        System.out.print("enter the second number:");
        double num2 = sc.nextDouble();
        System.out.print("enter the third number:");
        double num3 = sc.nextDouble();

        System.out.println("The average of three number is: " +average(num1,num2,num3));

    }
}