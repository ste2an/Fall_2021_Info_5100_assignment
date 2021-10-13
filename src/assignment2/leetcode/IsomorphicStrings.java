package assignment2.leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s1 = "aaabnt";
        String s2 = "asdfaw";

        System.out.println(isIsomorphic(s1, s2));

        String s3 = "aaabbbc";
        String s4 = "dddeeew";

        System.out.println(isIsomorphic(s3, s4));
    }

    public static boolean isIsomorphic(String s, String t) {
        return helper(s , t) && helper(t , s);
    }

    public static boolean helper(String s, String t){
        Map<Character, Character> map = new HashMap<>();
        for(int i = 0; i < s.length(); i ++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(map.containsKey(sChar)){
                if(map.get(sChar) != tChar){
                    return false;
                }
            }
            map.put(sChar, tChar);
        }
        return true;
    }
}
