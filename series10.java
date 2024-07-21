import java.io.*;
class series10
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
		int i,j,n;
		System.out.println("Enter term value: ");
		n = Integer.parseInt(br.readLine());
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
				System.out.print( j );	// print series values	
			if(i!=n)
			System.out.print(", ");			
		}
	}
}

/*
OUTPUT
-----------------------------------------
Enter term value: 
5
1, 12, 123, 1234, 12345
*/
