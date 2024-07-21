import java.io.*;
class series9
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
		int i,n,s=0;
		System.out.println("Enter term value: ");
		n = Integer.parseInt(br.readLine());
		for(i=1;i<=n;i++)
		{
			System.out.print( ((i*i)-1) + " " );	// print series values
			if(i!=n)			// if statement required to print + or comma (,)
				System.out.print("+ ");
			s = s + ((i*i)-1);			// calculating sum of series
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
0 + 3 + 8 + 15 + 24 + 35 + 48 + 63 + 80 + 99 
Sum of the series: 375

*/
