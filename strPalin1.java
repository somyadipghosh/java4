import java.util.*;
public class strPalin1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s,rev="";
        int l,i;
        System.out.print("Enter a String: ");
        s=sc.nextLine();
        l=s.length();
        for(i=l-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        if(rev.equals(s))
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");
    }
}