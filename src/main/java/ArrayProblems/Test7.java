package ArrayProblems;
// Duplicatw words in a Array
public class Test7 {
    static void main(String[] args) {
        String[] arr = { "Ramesh", "Imran", "Sameer","Imran"};
        for(int i = 0 ; i<arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i].equals(arr[j]) ){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
