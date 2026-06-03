package PracticeZone_Arrays;

public class Test16_FindMissingNumber {
    static void main(String[] args) {
        int [] arr = {1,2,3,5,6};
        int Totalsum = 0;
        for(int i =0; i< arr.length; i++){
            Totalsum = Totalsum +arr[i];
        }
        System.out.println(Totalsum);
        int n = 6;
        int ExpectedSum = n*(n+1)/2 ;
        System.out.println(ExpectedSum);








    }
}
