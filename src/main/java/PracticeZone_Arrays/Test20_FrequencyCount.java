package PracticeZone_Arrays;

public class Test20_FrequencyCount {
    static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,2,3,3,5,5,9,9};
        for(int i = 0; i< arr.length; i++){
            int ch = arr[i];
            int count = 0;
            if(ch== -1) continue;
            for(int j =0; j< arr.length; j++){
                if(arr[j]==ch){
                    count++;
                    arr[j] =-1;
                }
            }
            System.out.println(ch+":"+count);
        }

    }
}
