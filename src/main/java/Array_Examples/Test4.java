package Array_Examples;

public class Test4 {
    static void main(String[] args) {
        int [] arr = {1,2,2,4};
        // Find the frequency
        for(int i = 0; i<arr.length; i++){
            int ch = arr[i];
            int count = 0;
    if(ch == -1 ) continue;
            for(int j = 0; j<arr.length; j++){
                if(arr[j] == ch){
                    count = count+1;
                    arr[j] =-1;  //  arr[j] is repeted so we are
                    //System.out.println(arr[j]);
                 }
            }

            System.out.println(ch +":"+count);
        }

    }
}
// Every time count startsfrom zero right how it stored count = 2  for the nexr time it saw