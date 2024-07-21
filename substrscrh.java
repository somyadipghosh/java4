import java.util.*;
public class substrscrh
{
    public static void main(String args[])
    {
        String s,s1;
        int l,i,f=0,l1;
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        s=sc.nextLine();
        l=s.length();
        System.out.print("Enter string to scearch: ");
        s1=sc.nextLine();
        l1=s1.length();
        for(i=0;i<=l-l1;i++)
        {
            if(s.substring(i,i+l1).equals(s1))
            f=1;
        }
        if(f==1)
        System.out.println("Substring found: ");
        else
        System.out.println("Substring not found: ");
    }
}