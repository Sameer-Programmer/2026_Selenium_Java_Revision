package Maths_Problems_Java;

public class Test9 {
    public static void main(String[] args) {
        // count digits
        int num = 4440;
        int count = 0;

        for(int i = num ; num > 0;num = num/10 ){
            count++;
        }

        System.out.println(count);
    }
}
