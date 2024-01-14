package Day2;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int index1=-1, index2=0;
        for(int i=nums.length-2;i>=0;i--)
            if(nums[i]<nums[i+1])
            {
                index1=i;
                break;
            }
        if(index1==-1) reverse(nums,0,nums.length-1);
        else{
            for(int i=nums.length-1;i>=index1;i--)
                if(nums[index1]<nums[i])
                {
                    index2=i;
                    break;
                }
            swap(nums,index1,index2);
            reverse(nums,index1+1,nums.length-1);
            }
        }
        public void swap(int []nums, int ptr1, int ptr2){
            int temp=nums[ptr1];
            nums[ptr1]=nums[ptr2];
            nums[ptr2]=temp;
        }
        public void reverse(int []nums,int start,int end){
            while(start<end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        }
}