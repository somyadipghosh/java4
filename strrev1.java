import java.util.*;
public class strrev1
{
    public static void main(String args[])
    {
        String s,rev="";
        int l,i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        s=sc.nextLine();
        l=s.length();
        for(i=l-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);
    }
}