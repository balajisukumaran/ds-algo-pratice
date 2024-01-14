package Day3;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementN3 {
    public List<Integer> majorityElement(int[] nums) {
        int first=Integer.MAX_VALUE;
        int second=Integer.MIN_VALUE;
        int count1=0;
        int count2=0;
        List<Integer> result=new ArrayList(2);
        for(int i=0;i<nums.length;i++){
            if(first==nums[i])
                count1++;
            else if(second==nums[i])
                count2++;
            else if(count1==0){
                first=nums[i];
                count1=1;
            }
            else if(count2==0){
                second=nums[i];
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==first) count1++;
            if(nums[i]==second) count2++;
        }
        if(count1>nums.length/3)
            result.add(first);
        if(count2>nums.length/3&&first!=second)
            result.add(second);
        return result;
    }
}