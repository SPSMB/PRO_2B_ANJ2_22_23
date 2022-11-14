package com.company;

import java.util.Scanner;

public class Main {

    /*
    Vytvořte program, kde uživatel zadá 5 čísel, uloží je do pole a následně vypočítá jejich průměr.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the number");
            arr[i] = sc.nextInt();
        }
        double sum = 0;
        for (int x : arr) {
            sum+=x;
        }
        double result = sum/arr.length;
        System.out.println(result);
    }
}
