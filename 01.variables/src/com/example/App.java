package com.example;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Customer c1 = new Customer("chin siang");

        System.out.println(c1.getName());
        c1.printName();
        c1.setName("changed name");
        c1.printName();

        final double tax = 0.2;
        double total;

        Clothing cloth1 = new Clothing("jacket", 12, "S");
        Clothing cloth2 = new Clothing("trousers", 12, "L");

        System.out.println(cloth1.getDescription() + "," + cloth1.getPrice() + "," + cloth1.getSize());
        System.out.println(cloth2.getDescription() + "," + cloth2.getPrice() + "," + cloth2.getSize());

        total = (cloth1.getPrice() + cloth2.getPrice()) * (1 + tax);
        System.out.println(total);
    }
}
