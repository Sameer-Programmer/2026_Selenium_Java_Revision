package ArrayProblems;

public class Test27 {
    static void main(String[] args) {
        int[] arr = {9,1,2,3,4,5,6,7,8,9,0};
        boolean isSorted = true ;
        for(int i = 0; i< arr.length-1; i++){
            if(arr[i]<arr[i+1]){
                isSorted = false;
                break;
            }
        }

        if(isSorted){
            System.out.println("Arr is sorted order");
        }else {
            System.out.println("Not Sorted");
        }
    }
}
