package Day9;

import java.util.ArrayList;
import java.util.Collections;

public class RatInMaze {
    public static ArrayList<String> printPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> result=new ArrayList<String>();
        if(m.length>0&&m[0].length>0&&m[0][0]!=0)
            dfs(m,n,0,0,new StringBuilder(),result);
        Collections.sort(result);
        return result;
    }
    static String []Directions={"D","R","L","U"};
    static int [][]steps={{1,0},{0,1},{0,-1},{-1,0}};
    static void dfs(int [][]m,int n, int x,int y, StringBuilder sb, ArrayList<String> result){
        if(x==n-1&&y==n-1){
            result.add(String.valueOf(sb));
            //sb.setLength(0);
            return;
        }

        for(int i=0;i<Directions.length;i++){
            if(isSafe(m,x+steps[i][0],y+steps[i][1],n)){
                sb.append(Directions[i]);
                m[x][y]=0;
                dfs(m,n,x+steps[i][0],y+steps[i][1],sb,result);
                m[x][y]=1;
                
                if(sb.length()>0)
                 sb.setLength(sb.length()-1);
            }
        }
    }
    static boolean isSafe(int [][]m,int i, int j,int n){
        if(i>=0&&i<n&&j>=0&&j<n&&m[i][j]!=0)
            return true;
        return false;
    }


    // ArrayList<String> result;
    // public  ArrayList<String> printPath(int[][] m, int n)
    // {
    //      //Your code here
    //      boolean[][] isVisited = new boolean[n][n];
         
         
    //      result = new ArrayList();
    //      String path = "";
    //      dfs("",m,0,0,n-1,isVisited, path);
         
         
         
    //      Collections.sort(result);
    //      return result;
         
         
         
         
         
    // }
    
    // void dfs(String direction, int[][]m, int i, int j, int n, boolean[][] isVisited, String path){
        
    //     if(i==n && j == n) {
    //        path = path + direction;
    //        result.add(path);
    //        path = "";
    //        return;
            
    //     }
        
    //     if(i < 0 || i > n || j < 0 || j > n || isVisited[i][j] == true || m[i][j] == 0){
    //         return;
    //     }
        
    //     isVisited[i][j] = true;
    //     path = path + direction;
    //     dfs("D",m, i+1,  j, n, isVisited, path);
    //     dfs("R",m, i, j+1, n, isVisited, path);
    //     dfs("U",m, i-1, j, n, isVisited, path);
    //     dfs("L",m, i, j-1, n, isVisited, path);
    //     isVisited[i][j] = false;
    //     return;
        
    // }
}