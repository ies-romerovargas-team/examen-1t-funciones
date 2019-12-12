package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca numero: ");
        n = sc.nextInt();
        int i = 1;
        while((i * i) < n)
        {
            i++;
        }
        if ((i*i) == n)
        {
            System.out.println("Raiz Cuadrada exacta: "+ i);
        }
        else
        {
            System.out.println("La raiz cuadrada es " + (i-1) + " y pico");
        }
    }
}
