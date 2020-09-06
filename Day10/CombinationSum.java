package Day10;
import java.util.*;
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList();
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
            if(current+candidates[i]<=target){
                int value=candidates[i];
                r.add(value);
                combinationSum_helper(candidates,i,current+value,target,r,result);
                r.removeLast();
            }   
        }
    }
}
