package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int n = sc.nextInt();
        System.out.print("Número de cifras: ");
        System.out.println(numeroCifras(n));
    }

    public static int numeroCifras(int n)
    {
        int i = 1;
        if (n < 0)
        {
            n = n * -1;
        }
        while(n/10 >= 1)
        {
            n = n/10;
            i++;
        }
        return i;
    }
}