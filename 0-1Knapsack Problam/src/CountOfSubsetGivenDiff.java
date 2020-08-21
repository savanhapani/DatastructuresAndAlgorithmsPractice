
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author savan hapani
 */
public class CountOfSubsetGivenDiff {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int T=sc.nextInt();
    while(T-->0)
    {
      int n = sc.nextInt();
      
      int arr[]=new int[n];
      int sum=0;
      for(int i=0;i<n;i++)
      {
          arr[i] = sc.nextInt();
          sum += arr[i];
      }
        int diff= sc.nextInt();
        int s1 = (sum + diff)/2;
        int dp[][] = new int[n+1][s1+1];
        for(int i=0;i<n+1;i++)
            dp[i][0] = 1;
        for(int i=1;i<s1+1;i++)
            dp[0][i] = 0;
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<s1+1;j++)
            {
                if(arr[i-1] <= j)
                {
                    dp[i][j] = dp[i-1][j-arr[i-1]] + dp[i-1][j];
                }
                else
                {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
       System.out.println(dp[n][s1]);
    }
  }
    
}
    

