package PracticeZone_Arrays;

public class Test21 {
    static void main(String[] args) {
        String [] arr = {"Apple","Banana","Apple"};
        // find duplicates
        for(int i = 0; i< arr.length; i++){
            for(int j = i+1; j< arr.length;j++){
                if(arr[j]==arr[i]){
                    System.out.println(arr[i]);
                }
            }
        }

    }
}
