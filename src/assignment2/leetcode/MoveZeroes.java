package assignment2.leetcode;

public class MoveZeroes {
    public static void main(String[] args) {

    }

    public void moveZeroes(int[] nums) {
        if(nums.length < 2) return;
        int count = 0;
        int len = nums.length;
        for(int i = 0; i < len; i ++){
            if(nums[i] == 0){
                count ++;
            }else{
                nums[i - count] = nums[i];
            }
        }

        while(count > 0){
            nums[len - 1] = 0;
            count --;
            len --;
        }
    }
}
