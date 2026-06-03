package PracticeZone;

public class Test8_reverseNumber {
    static void main(String[] args) {
        int num = 123;
        int reverse = 0;
        for( num = 123; num>0; num = num/10){
           int lastDigit = num%10;
            reverse = (reverse *10)+lastDigit;
        }
        System.out.println(reverse);
    }
}
