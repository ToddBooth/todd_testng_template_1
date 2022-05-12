package org.teacher_todd;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello TestNG World.");

        Calculator demo_1 = new Calculator();
        System.out.println("2 + 3 = ? ..." + demo_1.add(2, 3));
    }
}