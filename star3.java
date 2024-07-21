public class star3
{
    public static void main(String args[])
    {
        int i,j;
        for(i=5;i>=1;i--)//row
        {
            for(j=1;j<=i;j++)//col
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}