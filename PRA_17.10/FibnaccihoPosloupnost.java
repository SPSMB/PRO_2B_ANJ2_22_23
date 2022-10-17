package com.company;

import java.util.Scanner;

public class FibnaccihoPosloupnost {

    /*
    Zadání:
    Vytvořte program pro vypsání Fibonacciho posloupnosti.
     */

    public static void main(String[] args) {
        Scanner pocet = new Scanner(System.in); //Scanner - vstup z konzole
        System.out.println("Zadej počet čísel čísel");
        int x = pocet.nextInt(); // Proměnná X, kde je uložen počet členů posl.
        int one = 0; //První předchozí číslo
        int two = 1; //Druhé předchozí číslo
        System.out.print("0 1 "); //První dvě čísla máme definovaný - vypíšeme je
        for (int i = 0; i < (x-2); i++) { //Od X odečteme 2 (už jsme dvě čísla vypsali)
            int next = one + two; //Sečteme předchozí čísla
            System.out.print(next + " "); //vypíšeme další číslo
            one = two; //První předchozí číslo nastavíme na druhé
            two = next; //Druhé předchozí číslo nastavíme na aktuální
        }
    }
}
