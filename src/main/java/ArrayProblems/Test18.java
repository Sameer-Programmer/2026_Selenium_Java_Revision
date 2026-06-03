package ArrayProblems;

import java.util.ArrayList;
import java.util.HashSet;

public class Test18 {
    static void main(String[] args) {
        int[] nums = {1,2,3,3,2,1,4,5,6,6,5,3};

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i< nums.length; i++){
            set.add(nums[i]);
        }
        System.out.println(set);

        ArrayList arrayList = new ArrayList<>(set);
        System.out.println(arrayList.get(0));
    }
}
