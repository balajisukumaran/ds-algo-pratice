package Day3;

public class MajorityElementN2 {
    public int majorityElement(int[] nums) {
        int count=0;
        int candidate=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(count==0)
            {
                candidate=nums[i];
            }
            count+=(nums[i]==candidate)?1:-1;
        }
        return candidate;
    }
}