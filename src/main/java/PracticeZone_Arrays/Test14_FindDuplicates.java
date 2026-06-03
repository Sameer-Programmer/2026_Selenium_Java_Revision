package PracticeZone_Arrays;

import java.util.HashSet;

public class Test14_FindDuplicates {
    static void main(String[] args) {
        int [] arr = {1,2,3,4,4,5,3,4,3,4};
        HashSet<Integer> set = new HashSet<>();
        HashSet  printed = new HashSet();

        for(int k :arr){
            if(set.contains(k) && !printed.contains(k)){
                System.out.println(k);
                printed.add(k);
            }else {
                set.add(k);
            }
        }


    }
}
