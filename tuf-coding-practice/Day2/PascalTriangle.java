package Day2;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList();
        List<Integer> pre=null;
        if(numRows==0) return result;
        for(int i=0;i<numRows;i++){
            List<Integer> row=new ArrayList();
            for(int j=0;j<=i;j++){
                if(j==0||j==i)
                    row.add(1);
                else 
                    row.add(pre.get(j-1)+pre.get(j));
            }
            pre=row;
            result.add(row);
        }
        return result;
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result=new ArrayList();
        int n=rowIndex;
        int r=0;
        long ncr=1;
        for(;r<=n;r++){
            ncr=(r==0||r==n)?1:(ncr*(n-r+1))/r;
            result.add((int)ncr);
        }
        return result;
    }
}