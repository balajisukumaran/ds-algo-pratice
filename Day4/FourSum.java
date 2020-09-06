package Day4;

import java.util.*;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result=new LinkedList();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++)
        {
            for(int j=i+1;j<nums.length-2;j++){
                int left=j+1;
                int right=nums.length-1;
                while(left<right){
                    int current=nums[i]+nums[j]+nums[left]+nums[right];
                    if(current==target){
                        result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        right--;
                        left++;
                        while(left<nums.length-1&&nums[left]==nums[left-1]) left++;
                        while(right>left&&nums[right]==nums[right+1]) right--;
                    }
                    else if(current>target)
                        right--;
                    else left++;
                }
                while(j<nums.length-1&&nums[j]==nums[j+1]) j++;
            }
            while(i<nums.length-1&&nums[i]==nums[i+1]) i++;
        }
        return result;
    }
}