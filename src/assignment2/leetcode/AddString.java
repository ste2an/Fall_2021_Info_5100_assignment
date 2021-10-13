package assignment2.leetcode;

public class AddString {

    public String addStrings(String num1, String num2) {
        int len1 = num1.length() - 1;
        int len2 = num2.length() - 1;

        StringBuilder sb = new StringBuilder();

        int digit = 0;

        while(len1 >= 0 || len2 >= 0 || digit != 0){
            int n1 = len1 >= 0 ? num1.charAt(len1) - '0' : 0;
            int n2 = len2 >= 0 ? num2.charAt(len2) - '0' : 0;

            int sum = n1 + n2 + digit;

            digit = sum / 10;
            sum = sum % 10;

            sb.append(sum);
            len1 --;
            len2 --;
        }

        return sb.reverse().toString();

    }
}
