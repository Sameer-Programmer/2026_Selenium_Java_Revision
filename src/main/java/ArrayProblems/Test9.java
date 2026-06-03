package ArrayProblems;

public class Test9 {
    static void main(String[] args) {
        // Find the missing Number
        int[] nums = {1,3,4,5};
        int n = 5;
        int expectedSum = n*(n+1)/2;
        int total = 0;
        System.out.println(expectedSum+" "+" expectedSum");
        int actualSum = 0;
        for(int i = 0; i< nums.length; i++){
            total = total + nums[i];
        }
        System.out.println(total);
        int missing = expectedSum-total;
        System.out.println(missing);

    }
}
