package Maths2;

public class Factorial {
    static void main(String[] args) {
        int num = 5;
        int result = 1;
        for(int i = num; i>0; i--){
            result = result*i;
        }
        System.out.println(result);
    }
}
