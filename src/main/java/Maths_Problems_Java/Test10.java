package Maths_Problems_Java;

public class Test10 {
    static void main(String[] args) {
        // Leap Year bsa
        int num = 2024;
        if(num %400 == 0){
            System.out.println("Leap Year");
        }else if(num%100 ==0){
            System.out.println("NOT Leap Year");
        }else if(num % 4==0) {
            System.out.println(" Leap Year");
        }else {
            System.out.println("NOT Leap Year");
        }

    }
}
