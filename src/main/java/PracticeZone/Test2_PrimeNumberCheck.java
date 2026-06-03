package PracticeZone;

public class Test2_PrimeNumberCheck {
    static void main(String[] args) {

        int num = 72;
        int count = 0;

        for(int i =1; i<=num; i++){
            if(num%i==0){
                count++;
            }
        }

        if(count==2){
            System.out.println("PrimeNUmber");
        }else {
            System.out.println("Not a PrimeNumber");
        }
    }
}
