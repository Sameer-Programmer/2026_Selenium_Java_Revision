package Oops_concept_And_PracticeZone;

/*
Only methods can be overridden in Java.
Variables cannot be overridden; they are hidden,
and access to them depends on the reference type.

 */

public class OverRideDemo {
    static void main(String[] args) {
        SBI sbi=new SBI();
        sbi.m1(); // sbi

        Bank bank =new SBI();
        bank.m1(); //sbi

        Bank bank1 =new Bank();
        bank1.m1(); // bank

        // variables not over rides

        Bank bank2 = new SBI();
        String nameref = bank2.name;
        System.out.println(nameref);

    }
}
