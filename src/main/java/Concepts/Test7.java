package Concepts;

interface Test7 {
    public void m1 ();
}

interface Test8 {
    public void m2();
}

class Boy implements Test7,Test8 {
    public void m1 (){
        System.out.println("implemented here");
    }
    public void m2 (){
        System.out.println("implemented  2nd one ");
    }

    static void main(String[] args) {
        Boy boy = new Boy();
        boy.m1();
        boy.m2();
    }
}
