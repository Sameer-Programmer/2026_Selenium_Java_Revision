package ArrayProblems;

import java.util.HashSet;

public class Test19 {
    static void main(String[] args) {
        int[] nums = {1,2,3,3,2,1,4,5,6,6,5,3};
        // remove duplicates

        HashSet set = new HashSet<>();
        for(int values :nums){
            set.add(values);
        }
        System.out.println(set);
    }
}
