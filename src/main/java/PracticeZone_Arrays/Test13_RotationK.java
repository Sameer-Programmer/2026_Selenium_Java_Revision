package PracticeZone_Arrays;

import java.util.Arrays;
//[9, 8, 7, 6, 5, 4, 3, 2, 1]

public class Test13_RotationK {
    static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int k = 2;

        int left = 0;
        int right = arr.length -1;
        while(left<right){
          int temp = arr[left];
          arr[left] = arr[right];
          arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
        /// /
         left = 0;
         right = k%arr.length -1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
        //
        left = k;
        right = arr.length -1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
}
}