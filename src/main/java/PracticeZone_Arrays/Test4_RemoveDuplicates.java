package PracticeZone_Arrays;

import java.util.HashSet;

public class Test4_RemoveDuplicates {
    static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,0,2,3,4};
        HashSet set = new HashSet<>();
        for(int num :arr){
            set.add(num);
        }
        System.out.println(set);
    }
}
