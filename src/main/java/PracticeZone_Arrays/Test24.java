package PracticeZone_Arrays;

public class Test24 {
    static void main(String[] args) {
      // Check Array is Sorted

        int [] arr = {1,2,3,4,5,6,7,8,9};
        boolean isSorted = true;
        for(int i =0; i<arr.length; i++){
            for(int j = 0; j< arr.length-1;j++){
               if(arr[j]>arr[j+1]) {
                   isSorted = false;
                   break;
               }
            }
        }
        if(isSorted){
            System.out.println("sorted");
        }else {
            System.out.println("Not sorted");
        }


    }
}
