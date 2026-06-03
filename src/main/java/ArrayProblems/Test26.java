package Java;

public class Test26{
    public static void main(String[] args) {
        // first non repeted element
        int [] arr = {1,2,3,4,5,6,7,8,2,1};
        for(int i = 0; i<arr.length; i++){
            int count  = 0;
            for(int j =0; j<arr.length; j++){
                if(arr[j]==arr[i]){
                    count ++;
                }
            }

            if(count==1){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
