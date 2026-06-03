package PracticeZone;

public class Test10_CountDigits {
    static void main(String[] args) {
        int num = 1200;
        int count =0;
        for(;num>0;num=num/10){
            count++;
        }
        System.out.println(count);
    }
}
