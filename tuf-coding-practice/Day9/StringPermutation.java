package Day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringPermutation {
    public static void main (String[] args) {
		//code
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int t_i=0;t_i<t;t_i++){
	        String str=sc.next();
	        List<Character> chars = new ArrayList<>(); 
            for (char ch : str.toCharArray()) 
                chars.add(ch); 
            List<String> re =new ArrayList<String>();
	        permutation(chars,chars.size(),0,new StringBuilder(),re);
	        Collections.sort(re);
	        for(String result:re)
	            System.out.print(result+" ");
	        System.out.println();
	    }
	}
	public static void permutation(List<Character> str,int n, int current, StringBuilder result, List<String> re){
	    if(current==n){
	        re.add(String.valueOf(result));
	    }
	    for(int i=0;i<str.size();i++){
	        Character c=str.get(i);
	        result.append(c);
	        str.remove(i);
	        permutation(str,n,current+1,result,re);
	        str.add(i,c);
	        result.setLength(result.length()-1);
	    }
    }
    
    // public static void main (String[] args) {
	// 	Scanner sc=new Scanner(System.in);
	// 	int tc=sc.nextInt();
	// 	while(tc-- >0)
    // 	{
    // 	 String str1=sc.next();
    // 	 char[] ch=str1.toCharArray();
    // 	 Arrays.sort(ch);
    // 	String str= String.valueOf(ch);
    // 	 permutation("",str);
    // 	 System.out.println();
    	 
	    
    // 	}
	// }
	
	// public static void permutation(String prefix, String str)
	// {
	//     int n=str.length();
	//     if(n==0) {System.out.print(prefix+" ");
	       
	//     }
	//     else {
	//         for(int i=0;i<n;i++)
	//         {
	//             permutation(prefix+str.charAt(i), str.substring(0,i)+str.substring(i+1,n));
	//         }
	//     }
	// }
}
