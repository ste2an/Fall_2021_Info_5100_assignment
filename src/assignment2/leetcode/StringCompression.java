package assignment2.leetcode;

public class StringCompression {
    public int compress(char[] chars) {
        int l = 0;
        int r = 0;
        int index = 0;

        while(r < chars.length){
            char ch = chars[l];
            int count = 0;
            while(r < chars.length && chars[r] == ch){
                r ++;
                count ++;
            }

            chars[index] = ch;
            // record the 1st letter of a3, 'a'
            index ++;

            if(count > 1){
                // turn 12 into char array ['1','2']
                // first turn Integer into String
                for(char c :  String.valueOf(count).toCharArray()){
                    chars[index++] = c;
                }
            }

            l = r;
        }
        return index;
    }
}
