import java.io.*;
class series6
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
		int i,n,s=0;
		System.out.println("Enter term value: ");
		n = Integer.parseInt(br.readLine());
		for(i=1;i<=n;i++)
		{
			System.out.print( ((i*i)+2) + " " );	// print series values using (i * i + 2)
			if(i!=n)				// if i is not n i.e. not last item
				System.out.print("+ ");
			s = s + ((i*i)+2);			// calculating sum of series using (i * i + 2)
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
3 + 6 + 11 + 18 + 27 + 38 + 51 + 66 + 83 + 102 
Sum of the series: 405
*/
