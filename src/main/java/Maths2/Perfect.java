package Maths2;

public class Perfect {
    static void main(String[] args) {
    int num =6;
    int result =0 ;
    for(int i = 1 ; i<num; i++){
        if(num%i==0){
            result = result + i ;
        }
    }
        System.out.println(result);

    }
}
