package PracticeZone_Arrays;

public class Test5_FindDuplicates {
    static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,0,2,3,4};
        for(int i = 0; i< arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[j] == arr[i]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
