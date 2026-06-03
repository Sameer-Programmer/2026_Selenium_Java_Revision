package PracticeZone_Arrays;

public class Test25_LinearSearch {
    static void main(String[] args) {
        int  arr [] = {1,2,3,4,5,6,7,8,9,1};
        int target = 10;
        boolean flag = false;
        for(int i =0 ; i< arr.length;i++){
            int ch = arr[i];
            if(target == ch){
//System.out.println("found");
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println("Found");
        }else {
            System.out.println("Not");
        }
    }
}
