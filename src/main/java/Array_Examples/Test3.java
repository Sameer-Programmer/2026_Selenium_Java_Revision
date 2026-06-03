package Array_Examples;

public class Test3 {
    static void main(String[] args) {
        Object[] values = {1,1.3,'A',"Banana",true};
        int lengthOfValues = values.length;
        for(int i = 0 ; i<lengthOfValues; i++){
            System.out.println(values[i]);
        }
    }
}
