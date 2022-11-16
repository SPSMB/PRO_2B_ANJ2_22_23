package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the numbers");
        for (int i = 0; i < 5; i++) {
            int input = sc.nextInt();
            arr[i] = input;
        }
        System.out.println("");
        for (int i = arr.length; i >0 ; i--) {
            System.out.print(arr[i-1] + " ");
        }
    }
}
