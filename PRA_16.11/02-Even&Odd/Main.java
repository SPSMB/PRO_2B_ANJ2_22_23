package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] even = new int[6];
        int[] odd =  new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter the number");
            int input = sc.nextInt();
            if(input%2==0) {
                even[i] = input;
                continue;
            }
            odd[i] = input;
        }
        System.out.println("");
        System.out.print("Even numbers: ");
        for (int x: even) {
            if (x == 0) continue;
            System.out.print(x + " ");
        }
        System.out.println("");
        System.out.print("Odd numbers: ");
        for (int x:odd) {
            if (x == 0) continue;
            System.out.print(x + " ");
        }
    }
}
