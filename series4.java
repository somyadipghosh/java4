import java.io.*;
class series4
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
		int i,n,s=0,j,f;
		System.out.println("Enter term value: ");
		n = Integer.parseInt(br.readLine());
		for(i=1;i<=n;i++)
		{
			f=1;
			for(j=2;j<=i;j++)		// calculating factorial of i
				f=f*j;			// f stores factorial of i
			System.out.print( f + " " );	// print series factorial values
			if(i!=n)			// if statement required to print + or comma (,)
				System.out.print("+ ");
			s = s + f;			// calculating sum of series
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
1 + 2 + 6 + 24 + 120 + 720 + 5040 + 40320 + 362880 + 3628800 
Sum of the series: 4037913
*/
