package ArrayProblems;

public class Test22 {
    static void main(String[] args) {
        // Max Sub arry Sum
        int [] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            currentSum = currentSum + arr[i];
            if(currentSum>maxSum){
                maxSum = currentSum;
            }

            if(currentSum<maxSum){
                currentSum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
