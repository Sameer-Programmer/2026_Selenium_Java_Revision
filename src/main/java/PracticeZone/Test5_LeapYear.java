package PracticeZone;

public class Test5_LeapYear {
    public static void main(String[] args) {
        // leapYear - 400 , 100, 4

        int year = 2012;

        if(year%400 ==0 ){
            System.out.println("LeapYear");
        }else if(year%100 ==0){
            System.out.println("Not a Leap year");
        } else if (year%4==0) {
            System.out.println("LeapYear");
        }else {
            System.out.println("Not a leap year");

        }
    }
}
