import java.util.*;
public class fibonacci
{
    public static int fib(int n)
    {
        //base case
        if(n==1 || n==0)
        {
            return n;
        }
        //recursive functon 
        int prev = fib(n-1);
        int prevPrev = fib(n-2);

        //self work
        return prev+prevPrev;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter the value of n:");
        int n = sc.nextInt();

        System.out.println(fib(n));

    }
}