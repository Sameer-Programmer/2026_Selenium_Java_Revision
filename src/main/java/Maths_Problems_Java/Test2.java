package Maths_Problems_Java;
//Fibnacci Series
// 0,1,
// 1,2,3,5,8
public class Test2 {
    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);
        int a = 0;
        int b = 1;
        for(int i = 0; i<5;i++){
            int temp = a+b; //1
            System.out.println(temp);
            a= b;
            b = temp;
        }
    }
}
