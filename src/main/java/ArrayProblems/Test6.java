package ArrayProblems;

public class Test6 {
    static void main(String[] args) {
// max and Min Element
        int []  arr = {1,2,3,4,5,6};
        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }

            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
