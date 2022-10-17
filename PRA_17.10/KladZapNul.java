package com.company;

import java.util.Scanner;

public class KladZapNul {

    /*
    Zadání: Vytvořte program, kde uživatel zadá, kolik bude chtít zadat čísel.
    Uživatel tato čísla zadá a program vypíše, kolik z těchto čísel bylo kladných, záporných a nulových.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Vstup z konzole
        System.out.println("Kolik chces zadat cisel?");
        int x = sc.nextInt(); //Počet čísel, které chce uživatel zadat
        int klad = 0; //Počet kladných čísel
        int zap = 0; //Počet záporných čísel
        int nul = 0; //Počet nulových čísel
        for (int i = 0; i < x; i++) { //Cyklus pro získání konkrétních čísel
            System.out.println("Zadej " + (i+1) + ". cislo");
            int next = sc.nextInt(); //Další číslo, které chce uživatel zadat
            if (next < 0) { //Pokud je číslo menší než 0, tak přičteme k záporným
                zap++;
            } else if (next == 0) { //Pokud je číslo rovno nule, přičteme k nulovým
                nul++;
            } else { //Pokud číslo není menší než 0 a není 0 (je větší než 0), přičteme ke kladným
                klad++;
            }
        }
        System.out.println("Kladnych: " + klad); //Vypíšeme kladná čísla
        System.out.println("Zapornych: " + zap); //Vypíšeme záporná čísla
        System.out.println("Nulovych: " + nul); //Vypíšeme nulová čísla
    }
}
