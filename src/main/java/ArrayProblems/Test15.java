package ArrayProblems;

import java.util.ArrayList;

public class Test15 {
    static void main(String[] args) {
        int [] arr1 = {1,2,3,4};
        int [] arr2 = {5,6,7,8};

        ArrayList arrayList = new ArrayList<>();

        for(int value:arr1){
            arrayList.add(value);
        }

        for(int value:arr2){
            arrayList.add(value);
        }

        System.out.println(arrayList);
    }
}
