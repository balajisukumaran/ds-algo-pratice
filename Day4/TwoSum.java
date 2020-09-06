package Day4;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash=new HashMap();
        int []result=new int[2];
        for(int i=0;i<nums.length;i++){
            if(hash.containsKey(target-nums[i]))
            {
                result[0]=i;
                result[1]=hash.get(target-nums[i]);
                return result;
            }
            hash.put(nums[i],i);
        }
        throw new IllegalArgumentException("Invalid Input");
    }
}