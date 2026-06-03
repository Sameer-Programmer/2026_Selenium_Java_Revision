package Maths_Problems_Java;

public class Test5 {
    static void main(String[] args) {
        int num = 123;
        int reverse = 0;

        for(num = 123; num>0; num = num /10){
            int lastDigit = num %10;
            reverse =  (reverse *10)+ (lastDigit);
            System.out.println(reverse);
        }

        System.out.println(reverse);


    }
}
