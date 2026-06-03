package Maths2;

public class SqureRoot {
    static void main(String[] args) {
        int num = 25;
        int result =0  ;
        for(int i = 0; i<=num; i++){
            if(i*i ==num){
               result = result+i;
            }
        }
        System.out.println(result);


    }
}
