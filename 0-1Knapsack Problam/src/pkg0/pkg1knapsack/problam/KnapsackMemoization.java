/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0.pkg1knapsack.problam;

import java.util.*;


/**
 *
 * @author savan hapani
 */
public class KnapsackMemoization {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while(T --> 0)
    {
      int N = sc.nextInt();
      int W = sc.nextInt();
      int val[] = new int[N];
      int wt[] = new int[N];
      for(int i=0;i<N;i++)
      {
          val[i] = sc.nextInt();
      }
      for(int i=0;i<N;i++)
      {
          wt[i] = sc.nextInt();
      }
      int dp[][] =new int[N+1][W+1];
      for(int i=0,len = dp.length;i<len;i++)
       Arrays.fill(dp[i], -1);
      knapsack(dp,val,wt,W,N);
    }
}
    public static int knapsack(int dp[][],int val[],int wt[],int W,int N)
    {
        if(W == 0 || N == 0)
            return 0;
        if(dp[N][W] != -1)
            return knapsack(dp, val, wt, W, N-1);
        if(wt[N-1] > W)
            return dp[N][W]=knapsack(dp, val, wt, W, N-1);
        else
            return dp[N][W]=Math.max(val[N-1] + knapsack(dp, val, wt, W, N-1),knapsack(dp, val, wt, W, N-1));
        
    }
}
