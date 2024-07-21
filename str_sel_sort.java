import java.util.*;
public class str_sel_sort
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
            String s=arr[i];
            p=i;
            for(j=i+1;j<5;j++)
            {
                if(s.compareTo(arr[j])>0)
                {
                    s=arr[j];
                    p=j;
                }
            }
            String t=arr[i];
            arr[i]=arr[p];
            arr[p]=t;
        }
        System.out.println("THE SORTED ARRAY ARE :");
        for(i=0;i<5;i++)
        System.out.println(arr[i]);
    }
}