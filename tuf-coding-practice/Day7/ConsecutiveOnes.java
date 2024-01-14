package Day7;

import java.util.*;
import java.lang.*;
import java.io.*;

public class ConsecutiveOnes {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
		    int length=sc.nextInt();
		    int []arr=new int[length];
		    int M=sc.nextInt();
		    System.out.println(" "+countMax(arr,length,M));
		    t--;
		}
	}
	//swaps with maximum 1s window
	public static int countMax(int []A,int n, int K){
	    int wL=0, wR;
        for(wR=0;wR<A.length;wR++){
            if(A[wR]==0) K--;
            if(K<0){
                if(A[wL]==0) K++;
                wL++;
            }
        }
        return wR-wL;
	}
	//consecutive 1s
	public int findMaxConsecutiveOnes(int[] nums) {
        int wL=0,wR=0;
        int maxWindow=Integer.MIN_VALUE;
        while(wR<nums.length){
            if(nums[wR]==1){
                wR++;
            }
            else{
                wR++;
                wL=wR;
            }
            maxWindow=Math.max(maxWindow,wR-wL);
        }
        return maxWindow;
    }
}