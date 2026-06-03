package ArrayProblems;

import java.util.Arrays;

public class Test17 {
    static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
        //output = {3 4 5 1 2}
        int k = 2;

        // step 1 ==>  2 1 3 4 5

        int left = 0 ;
        int right = k % arr.length -1;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));

        //
         left = k ;
         right =  arr.length -1;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
//
        left = 0 ;
        right =  arr.length -1;

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

/*

Step 1 = left = 0 , right = k
step 2 = left = k , right = arr.length-1;
step 3 = left = 0 , right = arr.length-1;
 */