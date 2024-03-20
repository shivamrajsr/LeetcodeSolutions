package leetcode;

import java.util.*;

public class longestSubstring {
    public static void main(String[] args) {
        // longest substring without repeating characters

        String s  = "abcaebcbb";
        List<String> ans = longestSubstringCalculator(s);
        System.out.println("list of non repeating character substrings:");
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i) + " length: " + ans.get(i).length());
       }
    }

    public static List<String> longestSubstringCalculator(String s){
        Set<Character> set = new HashSet<>();
        List<String> allNonRepeatingSubstring = new ArrayList<>();

        int startIndex = 0;
        int lastIndex = 0;
        String ans = "";
        while(lastIndex<s.length()){
            if(!set.contains(s.charAt(lastIndex))){
                set.add(s.charAt(lastIndex));
                lastIndex++;

                if(ans.length() <= set.size()){
                    ans = s.substring(startIndex,lastIndex);
                    allNonRepeatingSubstring.add(ans);
                    System.out.println(ans);

                }
            }
            else{
                set.remove(s.charAt(startIndex));
                startIndex++;
            }

        }
        System.out.println("longest non-repeating substring at last:" + ans);
        return allNonRepeatingSubstring;
    }

}

