package midTerm;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Map;

public class question4 {
    public static void main(String[] args) {

        String str = "abcabcdabc";
        System.out.println(getLongestNonRepeated(str));

    }

    public static String getLongestNonRepeated(String s){
        int len = s.length();

        if(len < 1){
            return "";
        }

        if(len == 1){
            return s;
        }

        int l = 0;
        int r = 0;
        String res = "";
        int sz = 0;

        Map<Character, Integer> map = new HashMap<>();

        while(r < len){
            char cur = s.charAt(r);

            if(map.containsKey(cur)){
                l = Math.max(l, map.get(cur) + 1);
            }

            int curLen = r - l + 1;
            if(curLen > sz) {
                sz = curLen;
                res = s.substring(l, r + 1);
            }
            map.put(cur, r);
            r ++;
        }
        return res;
    }
}
