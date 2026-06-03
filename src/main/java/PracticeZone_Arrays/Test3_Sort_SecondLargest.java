package PracticeZone_Arrays;

import java.util.Arrays;

public class Test3_Sort_SecondLargest {
    static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,0};

        for(int i =0; i< arr.length; i++){
            for(int j =0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-2]);

    }
}
