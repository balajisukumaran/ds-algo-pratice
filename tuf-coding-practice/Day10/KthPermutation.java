package Day10;

import java.util.ArrayList;
import java.util.List;

public class KthPermutation {
 
public String getPermutation(int n, int k) {
    List<Character> arr=new ArrayList();
    for(int i=1;i<=n;i++)
        arr.add((char)(i+'0'));
    StringBuilder result=new StringBuilder();
    getPermutation_util(n,k,result, arr);
    return result.toString();
}
public void getPermutation_util(int n,int k,StringBuilder result, List<Character> arr){
    if(n==0) return;
    int fact_n_1=fact(n-1);
    int index=k/fact_n_1;
    if(k%fact_n_1==0)
        index--;
    k=k-fact_n_1*index;
    result.append(arr.get(index));
    arr.remove(index);
    getPermutation_util(n-1,k,result,arr);
}
public int fact(int n){
    if(n==0||n==1) return 1;
    int []dp=new int[n+1];
    dp[0]=1;
    dp[1]=1;
    for(int i=2;i<=n;i++)
        dp[i]=dp[i-1]*i;
    return dp[n];
}
}