package Day10;


/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class SubsetSum1 {
    
    public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t_i=0;t_i<t;t_i++){
		    int n=sc.nextInt();
		    int []arr=new int[n];
		    int sum=0;
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		        sum+=arr[i];
		    }
		    equalPartition(arr,n,sum);
		}
	}
	public static void equalPartition(int []arr, int n, int sum){
        if(sum%2==0)
        {
            boolean result=subsetSum(arr,sum/2);
            if(result==true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        else 
            System.out.println("NO");
	}
	public static boolean subsetSum(int []arr, int sum){
	    boolean [][]dp=new boolean[arr.length+1][sum+1];
	    for(int i=0;i<arr.length+1;i++){
	        dp[i][0]=true;
	    }
	    for(int i=1;i<dp.length;i++){
	        for(int j=1;j<dp[0].length;j++){
	            if(arr[i-1]<=j)
	                dp[i][j]=dp[i-1][j-arr[i-1]]||dp[i-1][j];
	            else 
	                dp[i][j]=dp[i-1][j];
	        }
	    }
	    return dp[arr.length][sum];
	}
}