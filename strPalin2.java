import java.util.*;
public class strPalin2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int l,i,f=0,j;
        System.out.print("Enter a string: ");
        s=sc.nextLine();
        l=s.length();
        for(i=l-1,j=0;i>j;i--,j++)
        {
            if(s.charAt(i)!=s.charAt(j))
            f=1;
        }
        if(f==0)
        System.out.println("Palindrome");
        else
        System.out.println("Not palindrome");
    }
}