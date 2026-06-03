package ArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class Test4 {
    static void main(String[] args) {
        // scanner class
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];
        for(int i = 0; i<nums.length;i++){
            nums[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(nums));
    }
}
