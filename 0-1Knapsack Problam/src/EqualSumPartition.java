
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
public class EqualSumPartition {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0)
        {
            int n = sc.nextInt();
            int arr[]=new int[n];
            int sum =0;
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            int sumpartition = sum/2;
            
            if(sum%2 != 0)
            {
                System.out.println("NO");
            }
            else
            {
               boolean dp[][] = new boolean[sumpartition+1][n+1];
               for(int i=0;i<n+1;i++)
                   dp[0][i] = true;
               for(int i=1;i<sumpartition+1;i++)
                   dp[i][0] = false;
               for(int i=1;i<sumpartition+1;i++)
               {
                   for(int j=1;j<n+1;j++)
                   {
                       dp[i][j] = dp[i][j-1];
                       if(i >= arr[j-1])
                           dp[i][j] = dp[i - arr[j-1]][j-1] || dp[i][j-1];
                   }
                   
               }
               if(dp[sumpartition][n] == true)
               {
                   System.out.println("YES");
               }
               else
               {
                   System.out.println("NO");
               }
            }
            
        }
    }
    
}
