package Array_Examples;

public class Test1 {
    static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8,9,10};
        int lengthOfArray = nums.length;
        System.out.println(lengthOfArray);
        System.out.println(nums[0]);

//        for(int i = 0 ; i<lengthOfArray;i++){
//            System.out.println(nums[i]);
//        }

        for(int values : nums){
            System.out.println(values);
        }
    }
}
