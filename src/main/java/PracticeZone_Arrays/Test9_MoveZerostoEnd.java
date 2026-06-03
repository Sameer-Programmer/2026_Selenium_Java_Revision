package PracticeZone_Arrays;

import java.util.Arrays;

public class Test9 {
    static void main(String[] args) {
        int [] arr = {1,1,2,3,4,5,6,7,8,9,0,0,2,3,4};
        int index = 0 ;
        for(int i = 0; i< arr.length; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index]=temp;
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
