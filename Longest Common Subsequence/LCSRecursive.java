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
public class LCSRecursive {
   public static void main(String args[])
   { 
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
                while(T-->0)
		{
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    String str1 = sc.next();
		    String str2 = sc.next();
		   System.out.println(lcs(str1,str2,n,m));
		}
    }
	public static int lcs(String str1,String str2,int n,int m){
	    char[] x=str1.toCharArray();
	    char[] y=str2.toCharArray();
	      if(n==0 || m==0)
	      return 0;
	      else if(x[n-1] == y[m-1])
	      return 1 + lcs(str1,str2,n-1,m-1);
	      else
	      return Integer.max(lcs(str1,str2,n,m-1),lcs(str1,str2,n-1,m));
	}
}
