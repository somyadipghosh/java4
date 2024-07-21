import java.util.*;
public class strarr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String arr[]=new String[5];
        int i,c,j;
        System.out.print("Enter 5 strings: ");
        for(i=0;i<5;i++)
        {
            arr[i]=sc.nextLine();
        }
        for(i=0;i<5;i++)
        {
            c=0;
            for(j=0;j<arr[i].length();j++)
            {
                char ch=arr[i].charAt(j);
                if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                c++;
            }
            System.out.println("In "+arr[i]+" no of vowels "+c);
        }
    }
}