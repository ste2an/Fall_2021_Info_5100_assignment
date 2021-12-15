package finalExam;

public class Question3 {
    public static void main(String[] args) {
        int[] test1 = new int[]{1,1,1};
        Question3 q = new Question3();

        System.out.println(q.getContinuousSub(test1, 2));

        int[] test2 = new int[]{1,3,6,3,7,9,2,1,4,7,3,4,1};

        System.out.println(q.getContinuousSub(test2, 10));
    }

    private int getContinuousSub(int[] nums, int k){

        int len = nums.length;

        if(len <= 1){
            return nums.length;
        }

        int count = 0;
        for(int i = 0; i < len; i ++){
            int sum = 0;
            for(int j = i; j < len ; j ++){
                sum += nums[j];

                if(sum == k){
                    count ++;
                }
            }
        }
        return count;
    }
}
