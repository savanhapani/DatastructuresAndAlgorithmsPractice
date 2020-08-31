
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
public class CoinChangeMinCoin {
    
    public static void main (String[] args) {
		
                 Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T --> 0)
		{
		    int sum=sc.nextInt();
		    int n= sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    int dp[][] = new int[n+1][sum+1];
		    for(int i=0;i<sum+1;i++)
		        dp[0][i] = Integer.MAX_VALUE - 1;
		    for(int i=1;i<n+1;i++)
		        dp[i][0] = 0;
		   for(int i=1,j=1;j<sum+1;j++)
		   {
		      if(j%arr[0] == 0)  
		        dp[i][j] =  j/arr[0];
		      else
		        dp[i][j] = Integer.MAX_VALUE -1;
		   }
		   for(int i=2;i<n+1;i++)
		   {
		       for(int j=1;j<sum+1;j++)
		       {
		           if(arr[i-1] <= j)
		           dp[i][j] = Integer.min(dp[i][j-arr[i-1]]+1,dp[i-1][j]);
		           else
		           dp[i][j] = dp[i-1][j];
		       }
		   }
		   if(dp[n][sum] == Integer.MAX_VALUE -1)
		   {
		       System.out.println(-1);
		   }
		   else
		   System.out.println(dp[n][sum]);
		}
	}
    
}
