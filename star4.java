public class star4
{
    public static void main(String args[])
    {
        int i,j,s=4;
        for(i=1;i<=5;i++)//row
        {
            for(j=1;j<=s;j++)
            {
                System.out.print(" ");
            }
            s--;
            for(j=1;j<=i;j++)//col
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}