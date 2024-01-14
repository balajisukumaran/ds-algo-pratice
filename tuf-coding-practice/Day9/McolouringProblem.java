/*package whatever //do not write package name here */
package Day9;

import java.util.*;
import java.lang.*;
import java.io.*;

public class McolouringProblem {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt();
		for(int t_i = 0 ; t_i < T ; t_i++){
		    int N = sc.nextInt();
		    int M = sc.nextInt();
		    int[][] graph = new int[N][N];
		    int E = sc.nextInt();
		    for(int e_i = 0 ; e_i < E ; e_i++){
		        int x = sc.nextInt()-1;
		        int y = sc.nextInt()-1;
		        graph[x][y] = 1;
		        graph[y][x] = 1;
		    }
		    if(graphColoring(graph,M,N)){
		        System.out.println(1);
		    }else{
		        System.out.println(0);
		    }
		}
	}
	
	static boolean graphColoring(int [][] graph, int M, int N){
	    int []color=new int[N];
	    Arrays.fill(color, 0);
	    return dfs(graph,M,N,0,color);
	}
	static boolean dfs(int [][]graph, int M, int N, int v, int []color){
	    if(v==N)
	        return true;
	   for(int c_i=1;c_i<=M;c_i++){
	       if(isSafe(graph,v,color,c_i)){
	           color[v]=c_i;
	           if(dfs(graph,M,N,v+1,color))
	            return true;
	           color[v]=0;
	       }
	   }
	   return false;
	}
	
	static boolean isSafe(int[][] graph,int v, int []color,int c){
	    for(int i=0;i<graph.length;i++){
	        if(graph[v][i]==1&&color[i]==c)
	            return false;
	    }
	    return true;
	}
}