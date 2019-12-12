package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(leeHoraSegundos());
    }

   public static int leeHoraSegundos()
    {
        return horaASegundos(leeHora(), leeMinutos(), leeSegundos());
    }

    public static int leeHora()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce hora [0-23]: ");
        int n = sc.nextInt();
        while(n>23 || n<0)
        {
            System.out.print("Error. Introduce hora [0-23]: ");
            n = sc.nextInt();
        }
        return n;
    }

    public static int leeMinutos()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce minutos [0-59]: ");
        int n = sc.nextInt();
        while(n>59 || n<0)
        {
            System.out.print("Error. Introduce minutos [0-59]: ");
            n = sc.nextInt();
        }
        return n;
    }

    public static int leeSegundos()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce segundos [0-59]: ");
        int n = sc.nextInt();
        while(n>59 || n<0)
        {
            System.out.print("Error. Introduce segundos [0-59]: ");
            n = sc.nextInt();
        }
        return n;
    }

    public static int horaASegundos(int h, int m, int s)
    {
        return h * 3600 + m * 60 + s;
    }
}
