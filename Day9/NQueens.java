package Day9;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public List<List<String>> solveNQueens(int n) {
        List<Integer> board=new ArrayList(n);
        List<List<String>> res=new ArrayList(n);
        dfs(res,0,board,n);
        return res;
    }
    
    public void dfs(List<List<String>> res,int rowIndex, List<Integer> board,int n)
    {
        if(rowIndex==n){
            res.add(constructBoard(board));
            return;
        }
        
        for(int i=0;i<n;i++){
            board.add(i);
            if(validate(board))
                dfs(res,rowIndex+1,board,n);
            board.remove(board.size()-1);
        }
    }
    
    public boolean validate(List<Integer> board)
    {
        int rowIndex=board.size()-1;
        for(int i=0;i<rowIndex;i++){
            int difference=Math.abs(board.get(i)-board.get(rowIndex));
            if(difference==0||difference==rowIndex-i)
                return false;
        }
        return true;
    }
    
    public List<String> constructBoard(List<Integer> board)
    {
        List<String> result=new ArrayList(board.size());
        for(int i=0;i<board.size();i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<board.size();j++)
                if(j==board.get(i))
                    sb.append("Q");
                else sb.append(".");
            result.add(String.valueOf(sb));
        }
        return result;
    }    
    
    
}