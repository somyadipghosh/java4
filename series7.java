import java.io.*;
class series7
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
		int i,n,s=0,flag=1, v;
		System.out.println("Enter term value: ");
		n = Integer.parseInt(br.readLine());
		for(i=1;i<=n;i+=2)
		{
			if(flag==1)				// flag controls sign, flag = 1 is positive
			{
				System.out.print( i + " " );	// print positive series values 
				s = s + (i * flag);		// calculating sum of series 
				flag=-1;			// make flag negative for next term
			}			
			else					// else sign flag is negative
			{
				System.out.print( (i * -1) + " " );	// print negative series values
				s = s + (i * flag);			// calculating sum of series	 		
				flag=1;
			}
			if(i+2<n && flag==1)				// if (i+2) is less than n & term for positive
				System.out.print("+ ");
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
1 -3 + 5 -7 + 9 -11 + 13 -15 + 17 -19 
Sum of the series: -10
------------------------------------------
Enter term value: 
10
1 -3 + 5 -7 + 9 
Sum of the series: 5
*/
