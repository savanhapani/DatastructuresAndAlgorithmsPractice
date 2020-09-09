/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LongestCommenSubsequnce;

import java.util.Scanner;

/**
 *
 * @author savan hapani
 */
public class MinimumNumberOfInsertionAndDeletion {
    public static void main (String[] args) {
		      Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0)
		{
		    int n= sc.nextInt();
		    int m=sc.nextInt();
		    String str1 = sc.next();
		    String str2 = sc.next();
		    int x = lcs(str1,str2,n,m);
		    int ans = (n - x)+(m-x);
		    System.out.println(ans);
		}
	}
	public static int lcs(String str1,String str2,int n,int m)
	{
	    int dp[][] = new int[m+1][n+1];
	    char a[]=str1.toCharArray();
	    char b[]=str2.toCharArray();
	    for(int i=0;i<m+1;i++)
	    {
	        for(int j=0;j<n+1;j++)
	        {
	            if(i==0 || j==0)
	             dp[i][j] = 0;
	            else if(a[j-1] == b[i-1])
	             dp[i][j] = 1 + dp[i-1][j-1];
	            else
	            dp[i][j] = Integer.max(dp[i-1][j],dp[i][j-1]);
	        }
	    }
	    return dp[m][n];
	}
    
}
