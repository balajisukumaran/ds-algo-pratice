package Day4;

import java.util.HashSet;
import java.util.Set;

public class longestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> num_set=new HashSet();
        for(int num : nums){
            num_set.add(num);
        }
        int longestStreak=0;
        for(int num:num_set){
            if(!num_set.contains(num-1)){
                int currentNum=num;
                int currentStreak=1;
                while(num_set.contains(currentNum+1)){
                    currentNum++;
                    currentStreak+=1;
                }
                longestStreak=Math.max(longestStreak,currentStreak);
            }
        }
        return longestStreak;
    }
}