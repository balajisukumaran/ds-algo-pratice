package Day2;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfInversion {
    public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
            NumberOfInversion obj=new NumberOfInversion();
		   int n=sc.nextInt();
		   int []arr=new int[n];
		    for(int i=0;i<n;i++)
		        arr[i]=sc.nextInt();
		    System.out.println(obj.MergeSort(arr,0,n-1));
		   t--;
		}
	}
	public  long MergeSort(int[] arr, int l, int r) 
    { 
  
        // Keeps track of the inversion count at a 
        // particular node of the recursion tree 
        long count = 0; 
  
        if (l < r) { 
            int m = (l + r) / 2; 
  
            // Total inversion count = left subarray count 
            // + right subarray count + merge count 
  
            // Left subarray count 
            count += MergeSort(arr, l, m); 
  
            // Right subarray count 
            count += MergeSort(arr, m + 1, r); 
  
            // Merge count 
            count += Merge(arr, l, m, r); 
        } 
  
        return count; 
    } 
	public  long Merge(int []arr,int l,int m,int r){
	    int[] left = Arrays.copyOfRange(arr, l, m + 1); 
        // Right subarray 
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1); 
  
        int i = 0, j = 0, k = l;
        long swap = 0;
	    
        while (i < left.length && j < right.length) { 
            if (left[i] <= right[j]) 
                arr[k++] = left[i++]; 
            else { 
                arr[k++] = right[j++]; 
                swap += (m + 1) - (l + i); 
            } 
        } 
	    while(i<left.length)
	        arr[k++]=left[i++];
	    while(j<right.length)
	        arr[k++]=right[j++];
	   return swap;
	    
  
	}
}