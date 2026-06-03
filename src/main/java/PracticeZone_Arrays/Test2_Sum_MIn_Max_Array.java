package PracticeZone_Arrays;

public class Test2_Sum_MIn_Max_Array {
    static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,0};
        int min = arr[0];
        int max = arr[0];
        int sum = 0;

        for(int i = 0; i< arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }

            sum = sum +arr[i];
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(sum);

    }
}
