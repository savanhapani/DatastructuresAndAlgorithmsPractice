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
public class LongestCommonSubstring {
    
    /*package whatever //do not write package name here */
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int T=sc.nextInt();
	    while(T-->0)
	    {
	        int n=sc.nextInt();
	        int m=sc.nextInt();
	        String str1 = sc.next();
	        String str2=sc.next();
	        System.out.println(lcs(str1,str2,n,m));
	    }
	}
	public static int lcs(String str1,String str2,int n,int m)
	{
	    char[]  x= str1.toCharArray();
	    char[]  y= str2.toCharArray();
	    int dp[][] = new int[m+1][n+1];
	    int result = 0;
	    for(int i=0;i<m+1;i++)
	    {
	        for(int j=0;j<n+1;j++)
	        {
	            if(i==0 ||j==0)
	            {
	                dp[i][j] = 0;
	            }
	            else if(x[j-1] == y[i-1])
	            {
	                dp[i][j] = 1 + dp[i-1][j-1];
	                result = Integer.max(result, dp[i][j]);
	            }
	            else
	            {
	               dp[i][j] = 0;
	            }
	        }
	    }
	    return result;
	}
}
    

