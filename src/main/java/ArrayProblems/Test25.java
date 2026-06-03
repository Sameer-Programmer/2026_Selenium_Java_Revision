package ArrayProblems;

// Find sub array with given sum

public class Test25 {
    static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 6;
        for(int  i = 0; i<arr.length; i++){
            int sum = 0 ;
            for(int j = 0; j< arr.length; j++){
                sum = sum + arr[j];
                if (sum == target) {

//System.out.print("Subarray Found: ");

                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }

                    System.out.println();
                }
            }
        }
    }
}

/*

this part i amnot getting      for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }

                    System.out.println();
                }
 */