package Day8;

import java.util.*;
import java.lang.*;
import java.io.*;

public class MinimumPlatforms {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
		    int n=sc.nextInt();
		    int []arr=new int[n];
		    int []dep=new int[n];
		    for(int i=0;i<n;i++)
		        arr[i]=sc.nextInt();
		    for(int i=0;i<n;i++)
		        dep[i]=sc.nextInt();
		    Arrays.sort(arr);
		    Arrays.sort(dep);
		    int i=1,j=0;
		    int result=1; int platforms=1;
		    while(i<n&&j<n){
		        if(arr[i]<=dep[j])
		        {
		            platforms++;
		            i++;
		        }
		        else if(arr[i]>dep[j]){
		            platforms--;
		            j++;
		        }
		        if(platforms>result)
		            result=platforms;
		    }
		    System.out.println(result);
		    t--;
		}
	}
}