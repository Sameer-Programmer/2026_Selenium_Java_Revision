package PracticeZone_Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class Test22 {
    static void main(String[] args) {
       // Merge Arrays-Combine two Arrays
        int [] arr1 = {1,2,3,4,5,6,7,8,9,0};
        int [] arr2 = {11,12,12,12,13,};
        ArrayList list1  = new ArrayList();
        ArrayList list2  = new ArrayList();
        for(int i =0; i< arr1.length; i++){
            list1.add(arr1[i]);
        }
        for(int i =0; i< arr2.length; i++){
            list2.add(arr2[i]);
        }

        list1.addAll(list2);
        System.out.println(list1);

        HashSet set = new HashSet<>(list1);
        System.out.println(set);
    }
}
