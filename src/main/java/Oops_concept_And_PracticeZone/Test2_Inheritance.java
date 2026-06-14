package Oops_PracticeZone;

class Fruits {

    String colour = "Red";
    public void m1(){
        System.out.println(colour);
    }
}

class Apple extends Fruits {
}

public class Test2_Inheritance {
    static void main(String[] args) {
        Apple apple = new Apple();
        apple.m1();
    }

}
