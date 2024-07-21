import java.io.*;
class series8
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
		int i,n,s=0, a,b,c,d;
		// initial terms
		a=0;
		b=1;
		c=2;
		System.out.println("Enter term value: ");
		n = Integer.parseInt(br.readLine());
		System.out.print(a + " + " + b + " + " + c + " + ");	// print 0, 1, 2
		s = s + a + b + c; 			// sum 0, 1, 2
		for(i=4;i<=n;i++)
		{
			d = a + b + c;			// term value by a + b + c	
			System.out.print( d + " " );	// print series values
			// swap to get next value		
			a=b;				
			b=c;
			c=d;
			if(i!=n)			// if statement required to print + or comma (,)
				System.out.print("+ ");
			s = s + d;			// calculating sum of series
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
0 + 1 + 2 + 3 + 6 + 11 + 20 + 37 + 68 + 125 
Sum of the series: 273
*/
