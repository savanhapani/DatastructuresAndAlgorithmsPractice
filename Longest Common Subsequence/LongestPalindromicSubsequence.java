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
public class LongestPalindromicSubsequence {
    

    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int T=sc.nextInt();
      while(T-->0)
      {
        String s = sc.next();
        System.out.println(longestPalindromeSubseq(s));
      }
    }
     public static int longestPalindromeSubseq(String a) {
        StringBuilder s=new StringBuilder();
        s.append(a);
        s = s.reverse();
        String b= s.toString();
        int n = a.length();
        int m = b.length();
        int dp[][]=new int[m+1][n+1];
        char x[]=a.toCharArray();
        char y[]=b.toCharArray();
        for(int i=0;i<m+1;i++)
        {
            for(int j=0;j<n+1;j++)
            {
                if(i==0 || j==0)
                    dp[i][j] = 0;
                else if(x[j-1] == y[i-1])
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Integer.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m][n];
    }
}
