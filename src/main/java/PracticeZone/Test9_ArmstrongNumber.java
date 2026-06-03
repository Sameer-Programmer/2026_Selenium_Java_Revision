package PracticeZone;

public class Test9_ArmstrongNumber {
    static void main(String[] args) {
        int num = 4;
        int expectedNum = num;
        int result = 0;

        for(; num>0; num = num/10){
          int  lastDigit = num%10;
            result = result + (lastDigit*lastDigit*lastDigit);
        }
        System.out.println(result);

        if(result == expectedNum){
            System.out.println("ArmStrong");
        }else {
            System.out.println("Not Armstrong");
        }

    }
}
