import java.util.*;
public class str1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        String str;
        System.out.println("Enter your string: ");
        str=sc.nextLine();
        str=str.toUpperCase( );
        b=str.length();
        System.out.println("Output pattern: ");
        for(a=0;a<b;a++)
        {
            System.out.println(str.charAt(a));
        }
    }
}