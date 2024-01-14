package Day8;

import java.util.*;
import java.lang.*;
import java.io.*;

class Job{
    int name;
    int deadline;
    int profit;
    Job(int name,int d, int v){
        this.name=name;
        this.deadline=d;
        this.profit=v;
    }
}
public class JobSequencingProblem {
	public static void main(String args[]) 
    { 
        
        // Scanner sc=new Scanner (System.in);
        // int t=sc.nextInt();
        // while(t>0){
        //     int n=sc.nextInt();
        //     Job []arr=new Job[n];
        //     for(int i=0;i<n;i++){
        //         int name=sc.nextInt();
        //         int deadline=sc.nextInt();
        //         int profit=sc.nextInt();
        //         arr[i]=new Job(name,deadline,profit);
        //     }
        //     int deadline=sc.nextInt();
        //     printJobScheduling(arr, deadline);
        //     t--;
        // }  
        
        Job []arr=new Job[4];
        arr[0]=new Job(1,4,20);
        arr[1]=new Job(2,1,10);
        arr[2]=new Job(3,1,40);
        arr[3]=new Job(4,1,30);
        printJobScheduling(arr, 4);
    }
    public static void printJobScheduling(Job []arr, int t){
        
        Arrays.sort(arr,(a,b)->{return b.profit-a.profit;});
        boolean []result=new boolean[arr.length];
        int possibleJobs=0;
        int profit=0;
        for(int i=0;i<arr.length;i++){
                for(int j=Math.min(t-1,arr[i].deadline-1);j>=0;j--){
                    if(!result[j]){
                        result[j]=true;
                        possibleJobs++;
                        profit+=arr[i].profit;
                        break;
                    }
                }
        }
        System.out.println(possibleJobs+" "+profit);
    }
}