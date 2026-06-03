package PracticeZone_Arrays;

public class TwoSum {
    static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,8,9,10};
        int target =12;
        for(int i =0; i< arr.length; i++){
            for(int j =i+1; j< arr.length; j++){
                if(arr[i]+arr[j] == target){
                    System.out.println("Target Found    "+ arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
