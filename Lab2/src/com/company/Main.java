package com.company;
import java.util.Scanner;

/**
 * C5 = 3, C=A⊕B;
 * C7 = 5, char;
 * C11 = 2: Обчислити суму найбільших елементів кожного стовпця матриці
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int s = in.nextInt();
        char[][] a = new char[s][s];
        char[][] b = new char[s][s];
        char[][] c = new char[s][s];
        int Res = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = (char) Math.round(Math.random() * 10);
                b[i][j] = (char) Math.round(Math.random() * 10);
                c[i][j] = (char) (a[i][j] ^ b[i][j]);
            }
        }
        for (char[] ints : c) {
            for (char anInt : ints) {
                System.out.print((int)anInt + "\t");
            }
            System.out.println();
        }
        char cmax;
        for (int i = 0; i < c[0].length; i++) {
            cmax = 0;
            for(int j = 0; j < c.length; j++) {
                if (c[j][i] > cmax) {
                    cmax = c[j][i];
                }
            }
            Res += cmax;
        }
        System.out.println("The result is " + Res);
     }
    }

