package com.Pluralsight;


import java.util.Scanner;

public class sandwich_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("(1 = Regular, 2 = Large): ");
        int size = scanner.nextInt();

        if (size == 1){
            System.out.println("Regular");
        } else if (size ==2) {
            System.out.println("Large");
        }
        System.out.println("what is your ages");
        int ages = scanner.nextInt();
        if (ages <= 17){
            System.out.println("10% discount");
        } else if (ages>=65) {
            System.out.println("20% discount");

        }
        else {
            System.out.println("No discount");
        }
    }
}
