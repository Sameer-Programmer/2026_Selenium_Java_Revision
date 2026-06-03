package PracticeZone_Arrays;

//where i Statrts j should starts frm I only
public class Test12SubArraySum {
    static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,8,9,10};
        int target =12;
        for(int i = 0; i<arr.length;i++){
            int sum =0;
            for(int j = i; j<arr.length; j++){
                sum = sum+arr[j];
                if(sum == target){
                    for(int k =i; k<=j; k++){
                        System.out.println(arr[k]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
