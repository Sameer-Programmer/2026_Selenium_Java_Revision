package Maths2;

public class Power {
    static void main(String[] args) {
    // 2^3
        int base = 2;
        int power = 3;
        int result = 1;

        for(int i = 1; i<=power; i++){
            result = result * base;
        }
        System.out.println(result);



    }
}
