package ArrayProblems;

import java.util.Arrays;

public class Test21{

    public static void main(String[] args) {
        // Move zeros to end

        int[] arr = {0,0,1,2,3,4,5};
        int index = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


}
