package Day4;

import java.util.HashMap;

public class LongestSubArrayWithZeroSum {
    int maxLen(int nums[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> map=new HashMap();
        int longestWindow=0;
        int sum=0;;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==0)
                longestWindow=i+1;
            else if(map.containsKey(sum))
                longestWindow=Math.max(longestWindow,i-map.get(sum));
            if(!map.containsKey(sum))
                map.put(sum,i);
        }
        return longestWindow;
    }
}