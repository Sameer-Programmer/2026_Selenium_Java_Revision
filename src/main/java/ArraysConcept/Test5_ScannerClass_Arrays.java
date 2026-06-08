package ArraysConcept;

import java.util.Arrays;
import java.util.Scanner;

public class Test5_ScannerClass_Arrays {
    static void main(String[] args){
        int [] arr  = new int[5];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i<arr.length;i++){
            arr[i] =scanner.nextInt();
        }

        System.out.println(Arrays.toString(arr));
    }
}
