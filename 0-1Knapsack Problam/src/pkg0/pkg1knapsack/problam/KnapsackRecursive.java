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
public class KnapsackRecursive {
   public static void main(String args[]){ 
    Scanner sc = new Scanner(System.in);
    int T =sc.nextInt();
    while(T --> 0)
    {
      int N = sc.nextInt();
      int W= sc.nextInt();
      int[] val= new int[N];
      int[] wt=new int[N];
      for(int i=0;i<N;i++)
      {
          val[i] = sc.nextInt();
      }
      for(int i=0;i<N;i++)
      {
          wt[i] = sc.nextInt();
      }
      KnapsackRecursive kr = new KnapsackRecursive();
      System.out.println((kr.knapsack(val, wt, W, N)));
    }
   }
  public  int knapsack(int val[],int wt[],int W,int N)
   {
       if(N == 0 || W == 0)
       {
           return 0;
       }
       if(wt[N-1] > W)
       {
         return knapsack(val, wt, W, N-1);
       }
       else{
          return max(val[N-1]+knapsack(val, wt, W-wt[N-1], N-1),knapsack(val, wt, W, N-1));
       }
   }
  public static int max(int x,int y){
  return (x > y)?x:y;
  }
}
