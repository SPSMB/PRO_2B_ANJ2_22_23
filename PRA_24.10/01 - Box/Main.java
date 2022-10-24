package com.company;

import java.util.Scanner;

public class Main {

    /*
    Vytvořte program pro vykreslení boxu do konzole.
    Uživatel zadá počet řádků a sloupců a podle těchto údajů vykreslíte box vyplněný znaky "#"
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        int columns = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
