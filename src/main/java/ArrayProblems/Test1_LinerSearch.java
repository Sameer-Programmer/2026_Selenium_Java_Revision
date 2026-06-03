package ArrayProblems;

public class Test1 {
    static void main(String[] args) {
        // linerSearch
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int lengthofarr = arr.length;
        int searchElement = 222;
        boolean found =  false;
        for(int i = 0; i<lengthofarr; i++){
            if(arr[i]==searchElement){
                found = true;
                System.out.println("found");
            }
        }

        if(!found){
            System.out.println("Not Found");
        }

    }
}
