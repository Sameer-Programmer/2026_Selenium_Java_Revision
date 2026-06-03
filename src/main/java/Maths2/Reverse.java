package Maths2;

public class Reverse {
    static void main(String[] args) {
        int num = 123;
        int lastDigit;
        int reverse = 0;
        for(int i = num; num>0; num= num/10){
            lastDigit = num %10;
            reverse = (reverse *10 )+lastDigit;
        }
        System.out.println(reverse);
    }
}
