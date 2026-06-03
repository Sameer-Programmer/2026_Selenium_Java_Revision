package Maths2;
// 0 1 1 2 3
public class FibnacciSeries {
    static void main(String[] args) {
        int a = 0;
        int b = 1 ;
        System.out.println(a);
        System.out.println(b);
        for(int i = 0 ; i<3; i++){
            int temp = a+b; //1
            System.out.println(temp);
            a = b;
            b = temp;


        }


    }
}
