/*
 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

 What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
package de.sters;

/**
 *
 * @author exe
 */
public class Main3 {

    public static void main(String[] args) {
        String[] animale = {"caine", "pisica", "tigru", "sarpe", "peste", "veverita"};
        //Folosind o structura de tip Switch, Case, Break, verificati cuvintele din vectorul animale astfel:
        //Daca este animal domestic (Caine, Pisica, Peste) - afisati pe ecran animale[x] (pozitia curenta) " este animal domestic"
        //Daca ne aflam in cazul Tigru sau Sarpe - afisati pe ecrane animale[x] " este animal salbatic"
        //In orice alt caz afisati "Nu stim ce tip de animal este " + animale[x]

        for (String x : animale) {
            switch (x) {
                case "caine":
                case "pisica":
                case "peste":
                    System.out.println(x + " este un animal domestic.");
                    break;
                case "tigru":
                case "sarpe":
                    System.out.println(x + " este un animal salbatic.");
                    break;
                default:
                    System.out.println(x + " nu stim ce fel de animal este.");
                    break;
            }

        }

        int a = 8;
        //Folosind o conditionala cu conditii multiple, daca numarul stocat in variabila a este mai mic decat 10 si mai mare decat 8, afisati 
        //Textul "Numarul este bun", altfel, afisati textul "Numarul nu este bun"

        if (a < 10 && a > 8) {
            System.out.println("Numarul este bun");

        }
        else {
            System.out.println("Numarul nu este bun");

        }

        int n = 15;
        //Calculati si afisati suma armonica. Formula este: harmonic(x) = 1 + 1/2 + 1/3 + 1/4 + ...+ 1/x
        //Daca aceasta este mai mare decat 1.3 sau este mai mica decat 3, afisati patratul acesteia
        double armonica = 0;
        for (int i = 1; i < n; i++) {

            armonica += (1 / (double) i);

        }
        System.out.println("armonica este " + armonica);

        //Afisati, folosind 2 structuri repetitive, un patrat de 5/5, care contine doar elemente "#".
        //Apoi, folosind acelasi patrat, inlocuiti elementele de pe diagonala principala cu "*";
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                System.out.print(" #");
            }
            System.out.println();

            for (i = 0; i < 4; i++) {

                for (int j = 0; j < 4; j++) {

                    if (i == j) {

                        System.out.print(" *");
                    }
                    else {
                        System.out.print(" #");

                    }
                }
                System.out.println();

            }

        }
        System.out.println("*\t|\t1\t2\t3\t4\t5\t6\t7\t8\t9\n");
        System.out.println("-\t-\t-\t-\t-\t-\t-\t-\t-\t-\t-");

        int[][] inmultire = new int[9][9];
        for (int x = 0; x < inmultire.length; x++) {
            System.out.print((x + 1) + "\t|\t");
            for (int y = 0; y < inmultire.length; y++) {
                inmultire[x][y] = (x + 1) * (y + 1);
                System.out.print(inmultire[x][y] + "\t");

            }
            System.out.println();
        }

        //Calculati si afisati inversul numarului m (4994321).
        // Formati un numar nou, utilizand doar cifrele pare ale numarului m.
        int m = 4994321;
        int invers = 0;
        while (m > 0) {
            invers = invers * 10 + m % 10;
            m /= 10;

        }
        int h = 3;
        int min = 30;
        // Mai sus aveti 2 variabile care semnifica un cronometru care porneste de
        // la 3 ore, 30 de minute.
        // Afisati, folosind structuri repetitive, toate iteratiile prin care trece
        // acest cronometru (sub forma h:min), pana ajunge la 2 ore si 50 de minute
        while (h >= 0) {
            System.out.println(h + ":" + min);
            if (min > 0) {
                min -= 1;
            }
            else {
                h -= 1;
                min = 59;
            }
            if (h == 2 && min == 50) {
                break;
            }
        }
        // Formati un numar din prima si ultima cifra a ariei unui triunghi
        // dreptunghic cu catetele egale cu 18;
        int c = 18;
        int aria = c * c / 2;
        int ultimacifra = aria % 10;
        int primacifra = 0;
        int rezultat = 0;
        while (aria % 10 > 1) {
            primacifra = aria % 10;
            aria /= 10;
            rezultat = primacifra * 10 + ultimacifra;
        }
        System.out.println(rezultat);

        int x = 7;
        int y = 194;
        /*
         * Folosind operatorul conditional, calculati de cate sticle de cate x litri
         * fiecare este nevoie pentru a umple un vas de y litri. Exemplu: daca x=4
         * si y=20 , atunci e nevoie de 5 sticle daca x=4 si y=23 , atunci e nevoie
         * de 6 sticle*/
        if (y % x == 0) {
            System.out.println(y / x);
        }
        else {
            System.out.println(y / x + 1);
        }
        int j = 1024534;
        // Se citeste un numar natural j. Sa se determine daca este cub perfect.
        double cub = Math.cbrt(j);
        System.out.println(cub);
        double r = Math.round(cub);
        if (r * r * r == j) {
            System.out.println("Numarul " + j + " este cub perfect");
        }
        else {
            System.out.println("Numarul " + j + " nu este cub perfect");

        }


        }
    }
}
