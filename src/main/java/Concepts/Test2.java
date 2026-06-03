package Concepts;

public class Test2 {



    int z ;

    Test2 (){
        int y  =10;
        System.out.println(y);
    }

    Test2 (int x ,int y){
        System.out.println(x+y);
    }


    Test2 (int z){
        this.z = z;
    }

    public static void main(String[] args) {

        Test1 test1 = new Test1();
        test1.schoolname = "VVS";
        System.out.println(test1.schoolname);
        test1.HM = "URU";
        String result = test1.HM;

        System.out.println(result);


       // test1.x = 101;
        System.out.println(test1.x);

        Test2 test2 = new Test2();

        Test2 test3 = new Test2(7,8);
        Test2 test4 = new Test2(34);
        System.out.println(test4.z);



        Test3 mytest3 = new Test3();
        mytest3.setCustomerName("Sameer");
       String result3 = mytest3.getCustomerName();
        System.out.println(result3);

    }

}