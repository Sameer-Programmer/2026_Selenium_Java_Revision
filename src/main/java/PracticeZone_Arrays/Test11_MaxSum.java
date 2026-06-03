package PracticeZone_Arrays;

public class Test11_MaxSum {
    static void main(String[] args) {
        int [] arr = {-1,-1,1,2,3};
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            currentSum = currentSum +arr[i];

            if(currentSum>maxSum){
                maxSum = currentSum;
            }

            if(currentSum<0){
                currentSum =0;
            }
        }
        System.out.println(maxSum);
    }
}
