package assignment2.leetcode;


public class Palindrome {
    public static void main(String[] args) {


    }
    public boolean isPalindrome(String s) {
        int len = s.length();

        if( len <= 1 ) return true;

        int left = 0;
        int right = len - 1;

        // s.toLowerCase(); ×
        // -> String s1 = s.toLowerCase(); ✔

        while(left < right){
            char l = s.charAt(left);
            char r = s.charAt(right);

            if(! Character.isLetterOrDigit(l)){
                left ++;
                continue;
            }

            if(! Character.isLetterOrDigit(r)){
                right --;
                continue;
            }

            if(Character.toLowerCase(l) != Character.toLowerCase(r)){
                return false;
            }

            left ++;
            right --;

        }
        return true;
    }
}
