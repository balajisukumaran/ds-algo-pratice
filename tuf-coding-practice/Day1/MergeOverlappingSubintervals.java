package Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingSubintervals {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)
            return intervals;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> result=new ArrayList<int[]>();
        result.add(intervals[0]);
        int[] current_level=intervals[0];
        for(int []interval : intervals){
            int next_start=interval[0];
            int next_end=interval[1];
            int current_start=current_level[0];
            int current_end=current_level[1];
            if(current_end>=next_start)
            {
                current_level[1]=Math.max(current_end,next_end);
            }
            else
            {
                current_level=interval;
                result.add(current_level);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}