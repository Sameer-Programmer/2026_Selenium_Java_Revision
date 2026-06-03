package ArrayProblems;

import java.util.ArrayList;

public class Test14 {
    static void main(String[] args) {
        int [] arr = {1,2,3,4,5,1,2,3};

        ArrayList arrayList = new ArrayList<>();
//        for(int i = 0; i<arr.length; i++){
//            arrayList.add(arr[i]);
//        }
//        System.out.println(arrayList);


        for(int nums :arr){
            arrayList.add(nums);
        }
        System.out.println(arrayList);

    }
}
