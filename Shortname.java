import java.util.*;
public class Shortname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int l,i,s1=0;
        System.out.println("ENTR A FULL NAME: ");
        s=sc.nextLine();
        l=s.length();
        System.out.print(s.charAt(0));//print the first char
        for(i=0;i<l;i++)
        {
            if(s.charAt(i)==' ')
            {
                s1=i;
                System.out.print("."+s.charAt(i+1));
            }
        }
        System.out.println(s.substring(s1+2));
    }
}