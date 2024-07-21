class spiralmatrixfinal
    {
        public static void main(int n)
        {
            int ar[][]=new int[n][n];
            int k=1, cstart=0, cend=n-1, rstart=0, rend=n-1; 
            while(k<=n*n)
                {
                    for(int j=cstart;j<=cend;j++)
                    ar[rstart][j]=k++;                   
                    for(int i=rstart+1;i<=rend;i++)
                     ar[i][cend]=k++;
                    for(int j=cend-1;j>=cstart;j--)
                     ar[rend][j]=k++;                    
                    for(int i=rend-1;i>=rstart+1;i--)
                    ar[i][cstart]=k++;
                       cstart++;
                 cend--;
                 rstart++;
                 rend--;
                 }
            System.out.println("spiralmatrix-----");
            for(int i=0;i<n;i++)
                {
                    for(int j=0;j<n;j++)                    
                    System.out.print(ar[i][j]+" ");
                    System.out.println();
                }
        }
}