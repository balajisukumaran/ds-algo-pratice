package Day10;
import java.util.*;
public class PalindromePartition {
    public List<List<String>> partition(String s) {
           List<List<String>> result=new ArrayList();
            partition_util(s,s.length(),0, new LinkedList(),result);
            return result;
    }
    public void partition_util(String s,int n, int buildptr, LinkedList<String> palindrome, List<List<String>> result){
        if(buildptr==n){
            result.add(new ArrayList<String>(palindrome));
            return;
        }
        for(int i=buildptr;i<n;i++){
            if(isPalindrome(s,buildptr,i)){
                palindrome.add(s.substring(buildptr,i+1));
                partition_util(s,n,i+1,palindrome,result);
                palindrome.removeLast();
            }
        }
    }
    public boolean isPalindrome(String s,int left, int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}