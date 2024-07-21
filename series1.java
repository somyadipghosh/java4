import java.io.*;
class series1
{
public static void main(String args[]) throws IOException
{
BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
int i,n,s=0;
System.out.println("Enter term value: ");
n = Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
System.out.print( i + " " );	// print series values
if(i!=n)	// if statement required to print + or comma (,)
System.out.print("+ ");
s = s + i;			// calculating sum of series
}
System.out.println();
System.out.println( "Sum of the series: " + s);	
    }
    }
    
    /*
OUTPUT
-----------------------------------------
Enter term value: 
10
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 
Sum of the series: 55

*/
