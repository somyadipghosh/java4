import java.io.*;
class series3
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
		int i,n,s=0;
		System.out.println("Enter term value: ");
		n = Integer.parseInt(br.readLine());
		for(i=1;i<=n;i+=2)
		{
			System.out.print( i + " " );	// print series values
			if((i+2)<n)			// if statement required to print + or comma (,)
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
20
1 + 3 + 5 + 7 + 9 + 11 + 13 + 15 + 17 + 19 
Sum of the series: 100

*/
