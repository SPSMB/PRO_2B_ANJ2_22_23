package com.company;

import java.util.Scanner;

public class Main {

    /*
    Vytvořte kalkulačku, kde uživatel zadá, kolik bude chtít zadat čísel.
    Uživatel bude tato čísla postupně zadávat i s matematickýma operacema. Program poté vypíše výsledek.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to count?");
        int input = sc.nextInt();
        double currentSum = 0;
        for (int i = 0; i < input; i++) {
            System.out.println("Write the number");
            double num = Double.parseDouble(sc.next());
            System.out.println("Write a mathematical operation");
            String operation = sc.next();
            switch (operation) {
                case "+" -> currentSum+=num;
                case "-" -> currentSum-=num;
                case "*" -> currentSum*=num;
                case "/" -> currentSum/=num;
                default -> System.out.println("Bad operation. Ignore...");
            }
        }
        System.out.println("Result: " + currentSum);
    }
}
