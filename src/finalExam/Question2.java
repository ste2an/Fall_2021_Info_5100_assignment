package finalExam;

import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        String[] test1 = {"eat","tea","tan","ate","nat","bat"};

        Question2 q = new Question2();
        List<List<String>> res = q.getAnagram(test1);
        System.out.println(res);
    }

    private List<List<String>> getAnagram(String[] words){
        List<List<String>> res = new ArrayList<>();
        int len = words.length;
        if(len <= 1){
            return res;
        }

        Map<String, List<String>> map = new HashMap<>();

        for(String str : words){
            String tmp = sortWords(str);


            if( !map.containsKey(tmp) ){
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(tmp, list);
            }else{
                map.get(tmp).add(str);
            }
        }

        for(String s : map.keySet()){
            res.add(map.get(s));
        }

        return res;
    }

    private String sortWords(String s){
        char[] chs = s.toCharArray();
        Arrays.sort(chs);

        StringBuilder sb = new StringBuilder();
        sb.append(chs);

        return sb.toString();
    }
}
