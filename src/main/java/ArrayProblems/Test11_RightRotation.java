package ArrayProblems;
import java.util.Arrays;

// step 1 -> {1,2,3,4,5,6,7,8,9,0};
//Expected ---> 9,0, 1,2,3,4,5,6,7,8
// step 2 -> [0, 9, 8, 7, 6, 5, 4, 3, 2, 1]
// step 3 --> 9,0 -->

public class Test11 {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
            int k = 2;
            int left = 0;
            int right = arr.length-1;
            // step 1 reverse the whole array

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));

        left = 0;
        right = k % arr.length -1;
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
