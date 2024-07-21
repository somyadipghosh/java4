public class star5
{
    public static void main()
    {
        int i,j,s=0;
        for(i=5;i>=1;i--)//row
        {
            for(j=1;j<=s;j++)
            {
                System.out.print(" ");
            }
            s++;
            for(j=1;j<=i;j++)//col
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}