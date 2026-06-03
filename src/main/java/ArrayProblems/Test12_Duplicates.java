package ArrayProblems;

public class Test12 {
    static void main(String[] args) {
        // Remove Duplicates in a Array
        int [] nums = {1,2,3,4,5,5,6,7,7,1};
        int [] result = {} ;

        for(int i = 0; i<nums.length; i++){
           for(int j = i+1; j<nums.length; j++){
               if(nums[i]==nums[j]){
                   System.out.println(nums[i]);
               }
           }
        }
    }
}
