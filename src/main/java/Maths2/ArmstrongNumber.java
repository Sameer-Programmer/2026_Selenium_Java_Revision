package Maths2;

//153 = 1 cube + 5+3

public class ArmstrongNumber {
    static void main(String[] args) {
          int num = 153;
          int lastdigit ;
          int result = 0;
          for( int i =  num; num>0; num =num/10){
              lastdigit = num %10;
              result = result + (lastdigit*lastdigit*lastdigit);
          }
        System.out.println(result);
    }
}
