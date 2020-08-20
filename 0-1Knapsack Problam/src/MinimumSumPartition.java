
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
public class MinimumSumPartition {
    	public static void main (String[] args) {
		//code
            Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    int sum = 0;
		    for(int i=0;i<n;i++)
		    {
		        arr[i] = sc.nextInt();
		        sum += arr[i];
		    }
		   boolean dp[][]=new boolean[n+1][sum+1];
		   for(int i=0;i<n+1;i++)
		   dp[i][0] = true;
		   for(int i=1;i<sum+1;i++)
		   dp[0][i] = false;
		   
		   for(int i=1;i<n+1;i++)
		   {
		       for(int j=1;j<sum+1;j++)
		       {
		           if(arr[i-1] <= j)
		           {
		               dp[i][j] = dp[i-1][j - arr[i-1]] || dp[i-1][j];
		           }
		           else
		           {
		               dp[i][j] = dp[i-1][j];
		           }
		       }
		   }
		   int ans = Integer.MAX_VALUE;
		   int halfsum = sum/2;
		  for(int i=halfsum;i>=0;i--)
		  {
		      if(dp[n][i] == true)
		      {
		          ans = sum - 2 * i ;
		          break;
		      }
		  }
		 System.out.println(ans);
		}
	}
    
}
