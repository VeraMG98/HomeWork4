package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char star = '*', enter = ' ';

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int j = 0; j < (n - 1); j++)
            System.out.print(enter);
        System.out.println(star);
        for (int j = 1; j < (n - 1); j++)
        {
            for (int k = 0; k < (n - 1 - j); k++)
                System.out.print(enter);
            System.out.print(star);
            for (int m = 0; m < 2*j-1; m++){
                System.out.print(enter);
            }
            System.out.println(star);
        }
        for (int j = 0; j < n ; j++)
            System.out.print(star + " ");

        //5
        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(enter + " ");
            }
            for (int j = i + 1; j < n; j++) {
                System.out.print(star + " " + enter + " ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(enter + " ");
            }
            System.out.println();
        }*/

        //4
        /*for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print(enter + " ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(star + " " + enter + " ");
            }
            System.out.println();
        }*/

        //3
        /*for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                System.out.print(star + " ");
            }
            System.out.println();
        }*/

        //2
        /*for (int i = 1; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                System.out.print(enter + " ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(star + " ");
            }
            System.out.println();
        }*/

        //1
        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(star + " ");
            }
            System.out.println();
        }
        System.out.println();
        while (a.length() <= n) {
            a = a + star + " ";
            System.out.println(a);
        }*/
        }
}
