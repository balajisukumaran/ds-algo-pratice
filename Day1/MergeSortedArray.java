package Day1;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        MergeSortedArray obj=new MergeSortedArray();
        int []arr1={1, 5, 9, 10, 15, 20};
        int []arr2={2, 3, 8, 13};
        obj.sort(arr1, 6, arr2, 4);
    }
    public int nextGap(int value){
	    if(value<=1) return 0;
	    return (value/2)+(value%2);
	}
	public void sort(int []arr1, int n, int []arr2, int m){
	        int i, j, gap = n + m; 
        for (gap = nextGap(gap); gap > 0; 
             gap = nextGap(gap)) 
        { 
            // comparing elements in the first  
            // array. 
            for (i = 0; i + gap < n; i++) 
                if (arr1[i] > arr1[i + gap]) { 
                    int temp = arr1[i]; 
                    arr1[i] = arr1[i + gap]; 
                    arr1[i+gap] = temp; 
                } 
  
            // comparing elements in both arrays. 
            for (j = gap > n ? gap - n : 0 ;  
                 i < n && j < m; i++, j++) 
                if (arr1[i] > arr2[j]) { 
                    int temp = arr1[i]; 
                    arr1[i] = arr2[j]; 
                    arr2[j] = temp; 
                } 
  
            if (j < m) 
            { 
                // comparing elements in the  
                // second array. 
                for (j = 0; j + gap < m; j++) 
                    if (arr2[j] > arr2[j + gap]) { 
                        int temp = arr2[j]; 
                        arr2[j] = arr2[j + gap]; 
                        arr2[j+gap] = temp; 
                    } 
            } 
        } 

    }
    static void mergeTwoArrays(int a1[],int x,int a2[],int y)
	 {
	     int pt1 = a1.length-1; //Last index of a
	     int pt2 = 0; //First Index of b
	     
	     while(pt1 >=0 && pt2 < a2.length)
	     {
	         if(a1[pt1]>a2[pt2]) //smaller elements should be in array1. (Greatest element of a1 should be lesser than smallest element of a2)
	         {
	            int temp = a1[pt1];
	            a1[pt1] = a2[pt2];
	            a2[pt2] = temp;
	         }
	         
	         pt1--;
	         pt2++;
	     }
	     
	     //Now sort both arrays.
	     Arrays.sort(a1);
	     Arrays.sort(a2);
	     
	     //This is just for printing.Main thing is done above.
	     StringBuilder sb = new StringBuilder();
	     for(int i=0;i<a1.length;i++)
	     {
	         sb.append(a1[i]+" ");
	     }
	     
	     for(int i=0;i<a2.length;i++)
	     {
	         sb.append(a2[i]+" ");
	     }
	     
	     System.out.println(sb);
	 }
}