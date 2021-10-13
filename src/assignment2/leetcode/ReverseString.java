package assignment2.leetcode;

public class ReverseString {
    public static void main(String[] args) {

    }

    public String reverseWords(String s) {
        String s1 = s.trim();
        String[] helper = s1.split("\\s+");

        StringBuilder sb = new StringBuilder();

        int index = helper.length - 1;

        String res = "";
        for(int i = index; i >= 0; i --){
            res += helper[i];
            res += " ";
        }
        return res.trim();
    }
}
