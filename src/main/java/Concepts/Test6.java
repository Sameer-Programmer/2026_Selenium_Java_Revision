package Concepts;

public abstract class Test6 {
    abstract void  m1();
    public void sleep(){
        System.out.println("Sleeping ");
    }
}

class Human extends Test6 {
    public void m1 (){
        System.out.println("abstract Method");
    }

    public static void main(String[] args) {
        Human human = new Human();
        human.m1();
        human.sleep();
    }
}
