package PracticeZone_Arrays;

import java.util.HashSet;

public class Test23 {
    static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6,7,8,11,12,13,9,0};
        int [] arr2 = {11,12,12,12,13,};

        // intersection of Two Arrays - Common elemnets in Two Arrays Right
        HashSet set1 = new HashSet<>();
        HashSet set2 = new HashSet<>();

        for(int k:arr1){
        set1.add(k);
        }
        System.out.println(set1);
        //
        for(int k:arr2){
            set2.add(k);
        }
        System.out.println(set2);

       set1.retainAll(set2);
        System.out.println(set1);

    }
}
