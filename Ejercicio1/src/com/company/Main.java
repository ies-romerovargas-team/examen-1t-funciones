package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n1, n2, i;
        n1 = 0;
        while(n1 % 2==0)
        {
            System.out.print("Introduzca un número impar: ");
            n1 = sc.nextInt();
        }
        n2 = n1-1;

        while(n2 % 2==0 || n2 < n1)
        {
            System.out.print("Introduzca otro número impar > n1: ");
            n2 = sc.nextInt();
        }

        for(i=n1; i<=n2; i=i+2)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        for(i=n2; i>=n1; i=i-2)
        {
            System.out.print(i + " ");
        }

    }

}
