import java.util.*;
public class str_bubble_sort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String arr[]=new String[5];
        int i,c,j,p;
        System.out.print("ENTER FIVE STRINGS : ");
        for(i=0;i<5;i++)
        {
            arr[i]=sc.nextLine();
        }
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                if(arr[j].compareTo(arr[j+1])>0)
                {
                    String t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println("THE SORTED STRING ARE : ");
        for(i=0;i<5;i++)
        System.out.println(arr[i]);
    }
}