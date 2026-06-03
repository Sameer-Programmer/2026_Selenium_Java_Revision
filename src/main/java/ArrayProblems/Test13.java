package ArrayProblems;

public class Test13 {
    static void main(String[] args) {
        int [] arr = {1,2,3,4,56,1,2,3,4};
        for(int i = 0; i<arr.length; i++){
            boolean flag = false;
            for(int j = 0; j<arr.length; j++){
               if(arr[i] == arr[j] && i!=j) {
                   flag = true;
                   break;
               }
            }
            if(!flag){
                System.out.println(arr[i]);
            }
        }
    }
}
