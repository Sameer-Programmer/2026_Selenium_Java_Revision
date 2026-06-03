package Maths_Problems_Java;

public class TEST8 {
    static void main(String[] args) {
        // Prime Number 1-100

        for(int num = 1; num<=100;num++){
            int count = 0;
            for(int i = 1; i<=num; i++){
                if(num % i ==0){
                    count++;
                }
            }

            if(count ==2){
                System.out.println(num);
            }
        }
    }
}
