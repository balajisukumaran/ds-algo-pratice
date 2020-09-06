package Day4;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int max=0;
        HashSet<Character> hash=new HashSet<Character>();
        while(i<s.length()){
            if(!hash.contains(s.charAt(i))){
                hash.add(s.charAt(i));
                i++;
                max=Math.max(max,hash.size());
            }
            else{
                hash.remove(s.charAt(j));
                j++;
            }
        }
        return max;
    }
}