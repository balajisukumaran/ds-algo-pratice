package Day9;

import java.util.*;
public class WordBreak2 {

    public List<String> wordBreak(String s, List<String> wordDict) {
        return wordBreak_helper(s,wordDict,new HashMap());
    }
    public List<String> wordBreak_helper(String s, List<String> wordDict, HashMap<String,List<String>> memo){
        if(memo.containsKey(s))
            return memo.get(s);
        
        ArrayList<String> result=new ArrayList();
        if(s.equals(""))
        {
            result.add("");
            return result;
        }
        for(int i=0;i<wordDict.size();i++){
            if(s.startsWith(wordDict.get(i))){
                List<String> substrings=wordBreak_helper(s.substring(wordDict.get(i).length()),wordDict,memo);
                for(String substring:substrings){
                        StringBuilder sb=new StringBuilder(wordDict.get(i));
                        if(!substring.equals(""))
                            sb.append(" ").append(substring);
                        result.add(String.valueOf(sb));
                }
            }
        }
        memo.put(s,result);
        return result;
    }
}