package Day8;

import java.util.Arrays;

public class NmeetingInOneRoom {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{return a[1]-b[1];});
        if(intervals.length==0||intervals.length==1) return true;
        int []current=intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(current[1]>intervals[i][0])
                return false;
            current=intervals[i];
        }
        return true;
    }
}