package Day3;

public class ReversePairs {
    public int reversePairs(int[] nums) {
        return MergeSort(nums,0,nums.length-1);
    }
   public  int MergeSort(int[] arr, int l, int r) 
    { 
        int count = 0; 
        if (l < r) { 
            int m = (l + r) / 2; 
            count += MergeSort(arr, l, m); 
            count += MergeSort(arr, m + 1, r); 
            count += Merge(arr, l, m, r); 
        } 
        return count; 
    } 
	public  int Merge(int []arr,int l,int m,int r){
	    int []nums=new int[r-l+1];
        int p=l,q=m+1;
        int count=0;
        while(p<=m&&q<=r){
            if((long)arr[p]>2*(long)arr[q]){
                count+=m-p+1;
                q++;
            }
            else p++;
        }
        p=l;
        q=m+1;
        int index=0;
        while(p<=m&&q<=r){
            if(arr[p]>arr[q])
                nums[index++]=arr[q++];
            else nums[index++]=arr[p++];
        }
        while(p<=m)
            nums[index++]=arr[p++];
        while(q<=r)
            nums[index++]=arr[q++];
        
        System.arraycopy(nums,0,arr,l,r-l+1);
        
        return count;
	}
}