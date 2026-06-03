package ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Test28 {
    static void main(String[] args) {
        //kth Largest element
        int[] arr = {9,1,2,3,4,5,6,7,8,9,0};
        HashSet set = new HashSet<>();
        for(int i :arr){
            set.add(i);
        }

        System.out.println(set);


        ArrayList arrayList = new ArrayList<>(set);
        Collections.sort(arrayList);
        int size = arrayList.size();

        int k = 3;

        System.out.println(arrayList.get(arrayList.size()-k));

    }
}
