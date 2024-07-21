import java.util.*;
public class strrev2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s,rev="";
        int i,l;
        System.out.print("Enter a string: ");
        s=sc.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            rev=s.charAt(i)+rev;
        }
        System.out.println(rev);
    }
}