package Day9;

import java.util.HashSet;

public class SodokuValid
{
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen=new HashSet();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char current=board[i][j];
                if(current!='.'){
                    if(!seen.add(current+"Found in row "+i)||
                      !seen.add(current+"Found in col "+j)||
                      !seen.add(current+"Found in box "+i/3+"-"+j/3))
                        return false;
                }
            }
        }
        return true;
    }
}