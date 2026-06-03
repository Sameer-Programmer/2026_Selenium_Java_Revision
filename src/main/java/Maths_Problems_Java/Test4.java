package Maths_Problems_Java;
//Armstrong Number
//153 = 1
public class Test4 {
    static void main(String[] args) {
        int num = 153;
        int expected = num;
        int result = 0;
        for(num = 153 ; num>0;num = num/10){
            int lastDigit= num %10;
            result = result + (lastDigit*lastDigit*lastDigit);
        }
        System.out.println(result);

        if(result==expected){
            System.out.println("Armstrong");
        }else {
            System.out.println("Not an Armstrong");
        }

    }
}
