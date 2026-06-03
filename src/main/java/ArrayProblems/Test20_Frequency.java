package ArrayProblems;

public class Test20 {
    static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,1,1};
        for(int i = 0; i<a.length; i++){

            int ch = a[i];
            int count = 0;
            if(ch == -1) continue;
            for(int j =0; j<a.length; j++){
                if(a[j]==ch){
                    count++;
                    a[j] = -1;
                }
            }
            System.out.println(ch+":"+count);
        }
    }

}
