import java.io.*;
 
class sum_rec
{
    // Function to check sum
    // of digit using recursion
    static int sum_rec(int n)
    {
        if (n == 0)
            return 0;
        return (n % 10 + sum_rec(n / 10));
    }
 
    // Driven Program to check above
    public static void main(String args[])
    {
        int num = 12345;
        int result = sum_rec(num);
        System.out.println("Sum of digits in " +
                           num + " is " + result);
    }
}
 