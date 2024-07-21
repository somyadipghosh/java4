import java.io.*;
class series5
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
		int i,n,s=0;
		System.out.println("Enter term value: ");
		n = Integer.parseInt(br.readLine());
		for(i=1;i<=n;i++)
		{
			System.out.print( ((i*i)+1) + " " );	// print series values
			if(i!=n)				// if i is not n i.e. not last item
				System.out.print("+ ");
			s = s + ((i*i)+1);			// calculating sum of series using (i * i + 1)
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
2 + 5 + 10 + 17 + 26 + 37 + 50 + 65 + 82 + 101 
Sum of the series: 395
*/
