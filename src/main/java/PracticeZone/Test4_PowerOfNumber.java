package PracticeZone;

public class Test4_PowerOfNumber {
    static void main(String[] args) {
        // 2^3 = 8;

        int base = 2;
        int power = 3;

        int result = 1;

        for(int i = 1; i<=power; i++){
            result = result*base;
        }
        System.out.println(result);
    }
}
