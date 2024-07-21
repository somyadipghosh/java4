import java.util.*;
public class str_bubble_shot
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String arr[]=new String[5];
        int i,c,j,p;
        System.out.print("Enter 5 strings: ");
        for(i=0;i<5;i++)
        {
            arr[i]=sc.nextLine();
        }
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                if(arr[j].compareTo(arr[j+1])>0)//arr[j]>arr[j+1]
                {
                    String t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println("The sorted string are: ");
        for(i=0;i<5;i++)
        System.out.println(arr[i]);
    }
}