package ArrayProblems;

import java.util.Arrays;

public class Test3 {

    static void main(String[] args) {
        int[] arr = {11,2,3,1,4,5,6,8,9,33,11,22,22};
        // bubble sorting

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        int secondNum = arr[arr.length-2];
        System.out.println(secondNum);
    }
}
