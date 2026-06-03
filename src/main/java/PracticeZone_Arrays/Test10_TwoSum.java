package PracticeZone_Arrays;

public class Test10 {
    static void main(String[] args) {
   //Two Sum
        int [] arr = {1,1,2,3,4,5,6,7,8,9,0,0,2,3,4};
          int target = 6;

          //1,1,2,3,4,5
        // 1,6

          for(int i = 0; i< arr.length; i++){
              for(int j =i+1; j<arr.length; j++){
                  if(arr[i]+arr[j] == target){
                      System.out.println(arr[i]+" "+arr[j]);
                  }
              }
          }

    }
}
