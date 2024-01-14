package Day7;

public class TrappingRainWater {
    public int trap(int[] height) {
        int left_max=Integer.MIN_VALUE, right_max=Integer.MIN_VALUE;
        int left=0,right=height.length-1;
        int ans=0;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>left_max)
                    left_max=height[left];
                else ans+=left_max-height[left];
                left++;
            }
            else{
                if(height[right]>right_max)
                    right_max=height[right];
                ans+=right_max-height[right];
                right--;
            }
        }
        return ans;
       }
}