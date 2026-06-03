package PracticeZone;

public class Test1_GCD_LCM {
    static void main(String[] args) {
        //gcd
        int num1 = 10;
        int num2 = 20;
        int gcd = 1;
        for(int i = 1 ; i<=num2; i++){
            if(num1%i ==0 && num2%i==0){
                gcd =i;
            }

        }

        System.out.println(gcd+"   GCD");

        int lcm = (num1*num2) / gcd;
        System.out.println(lcm+"   LCM");
    }
}
