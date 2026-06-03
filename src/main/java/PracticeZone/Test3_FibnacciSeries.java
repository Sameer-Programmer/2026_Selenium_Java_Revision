package PracticeZone;

public class Test3_FibnacciSeries {
    static void main(String[] args) {
        //0,1,1,2,3,5,8

        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for(int i = 0 ; i<5;i++){
            int temp = a+b;
            System.out.println(temp);
            a = b;
            b = temp;
        }
    }
}
