package ArraysConcept;

import java.util.Arrays;

public class Test1_SingleDimensionalArray {
    static void main(String[] args){
        int [] arr = {11,2,3,4,5,6,7,8,9};
        System.out.println(arr.length); //-- Findlength
        System.out.println(arr[0]); // Extract and Print
        arr[0] = 13;
        System.out.println(arr[0]);  //Update
        System.out.println(Arrays.toString(arr));
        //SortMethod
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
