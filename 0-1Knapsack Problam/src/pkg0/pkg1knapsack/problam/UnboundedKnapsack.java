/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0.pkg1knapsack.problam;

import java.util.Scanner;

/**
 *
 * @author savan hapani
 */
public class UnboundedKnapsack {
    
    public static void main (String[] args) {
		//code
		      Scanner sc=new Scanner(System.in);
		int T =sc.nextInt();
		while(T --> 0)
		{
		    int n = sc.nextInt();
		    int w = sc.nextInt();
		    int vt[] = new int[n];
		    int wt[] = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        vt[i] = sc.nextInt();
		    }
		    for(int i=0;i<n;i++)
		    {
		        wt[i] = sc.nextInt();
		    }
		    int dp[][]= new int[n+1][w+1];
		    
		   for(int i=0;i<n+1;i++)
		   {
		       for(int j=0;j<w+1;j++)
		       {
		           if(i==0 || j==0)
		             dp[i][j] = 0;
		           else if(wt[i-1] <= j)
		           {
		               dp[i][j] = Math.max(vt[i-1]+dp[i][j - wt[i-1]],dp[i-1][j]);
		           }
		           else
		           {
		               dp[i][j] = dp[i-1][j];
		           }
		       }
		   }
		   		System.out.println(dp[n][w]);
		}

	}
    
}
