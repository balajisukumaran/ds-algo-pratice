package Day10;

import java.util.*;
public class CombinationSum2 {
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList();
        Arrays.sort(candidates);
        combinationSum_helper(candidates,0,0,target,new LinkedList(),result);
        return result;
    }
    public void combinationSum_helper(int[] candidates, int start,int current, int target, LinkedList<Integer> r, List<List<Integer>> result){
        
        if(current==target){
            result.add(new ArrayList<Integer>(r));
            return;
        }
        
        for(int i=start;i<candidates.length;i++)
        {
            if((i==start||candidates[i]!=candidates[i-1])&&current+candidates[i]<=target){
                int value=candidates[i];
                r.add(value);
                combinationSum_helper(candidates,i+1,current+value,target,r,result);
                r.removeLast();
            }   
        }
    }
}