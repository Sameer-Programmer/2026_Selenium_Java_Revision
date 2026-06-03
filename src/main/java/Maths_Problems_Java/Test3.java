package Maths_Problems_Java;
//Factorial (Recursion)

public class Test3 {
    static void main(String[] args) {
        int num =5 ;
        int result = 1;
        for(int i = num; i>0; i--){
            result = result * i ;
            System.out.println(result+" "+i);
        }
        System.out.println(result);
    }
}
