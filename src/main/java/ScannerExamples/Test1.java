package ScannerExamples;

import java.util.Scanner;

public class Test1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter name , age , salary");
        System.out.println("please enter name");
        String name = scanner.nextLine();
        System.out.println("please enter age");
        int age = scanner.nextInt();
        System.out.println("Salary");
        double salary = scanner.nextDouble();
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}
