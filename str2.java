import java.util.*;
public class str2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,v=0;
        String str;
        char chr;
        System.out.println("Enter your string:");
        str=sc.nextLine();
        b=str.length();
        str=str.toLowerCase();
        for(a=0;a<b;a++)
        {
            chr=str.charAt(a);
            if(chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u')
            v=v+1;
        }
        System.out.println("The number of vowels present: "+v);
    }
}