package PracticeZone_Arrays;

import java.util.ArrayList;

public class Test8_MoveZerosEnd {
    static void main(String[] args) {
        int [] arr = {1,1,2,3,4,5,6,7,8,9,0,0,2,3,4};
        ArrayList list = new ArrayList();

        for (int num:arr){
            if(num != 0){
                list.add(num);
            }

        }
        System.out.println(list);
        ArrayList list2 = new ArrayList();
        for (int num:arr){
            if(num == 0){
                list2.add(num);
            }

        }
        System.out.println(list2);

        list.addAll(list2);
        System.out.println(list);


    }
}
