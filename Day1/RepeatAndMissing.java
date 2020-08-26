
package Day1;

import java.util.*;
import java.lang.*;
import java.io.*;

public class RepeatAndMissing {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int testcases=0;testcases<t;testcases++){
		    RepeatAndMissing obj=new RepeatAndMissing();
		    int n=sc.nextInt();
		    int []arr=new int[n];
            int []result=new int[2];
		    for(int i=0;i<arr.length;i++){
		        arr[i]=sc.nextInt();
		    }
		    obj.findMissing(result,arr);
		    System.out.println(result[0]+" "+result[1]);
		}
	}
	public void findMissing(int []result,int []arr){
	    int n=arr.length;
	    long x_y=(n*(n+1))/2;
	    long x2_y2=(n*(n+1)*((2*n)+1 ))/6;
	    for(int num:arr){
	        x_y -= num;
	        x2_y2 -= num*num;
	    }
	    long xplusy = (x2_y2/x_y);
	    long x = (xplusy+x_y)/2;
	    long y = xplusy-x;
	    result[0]=(int)y;
	    result[1]=(int)x;
	}
}