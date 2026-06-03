package PracticeZone_Arrays;

public class Test6_Frequency {
    static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,0,2,3,4};
        for(int i = 0; i< arr.length; i++){
            int ch = arr[i];
            int count = 0;
if(arr[i] == -1) continue;
            for(int j = 0; j<arr.length; j++){
                if(arr[j]==ch){
                    count++;
                    arr[j] = -1;

                }
            }
            System.out.println(ch+":"+count);
        }
    }
}
