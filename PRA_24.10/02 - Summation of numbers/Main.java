package com.company;

import java.util.Scanner;

public class Main {

    /*
    Vytvořte program pro výpočet součtu všech čísel od 1 do X.
    X zadá uživatel.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        String output = "";
        int result = 0;
        for (int i = 1; i <= num; i++) {
            output = output + "" + i + " ";
            if (i == num) {
                output = output + "= ";
            } else {
                output = output + "+ ";
            }
            result+=i;
        }
        output = output + result;
        System.out.println(output);
    }
}
