package com.company;

import java.util.Random;
import java.util.Scanner;


public class A {
    public void hello() {
        System.out.println("Enter name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }

    public void showRandom() {
        Random rn = new Random(30);
        for (int i = 0; i < 5; i++) {
            System.out.println("new string = " + rn.nextInt(30));
        }
        System.out.print("String = ");
        for (int i = 0; i < 5; i++) {
            System.out.print(rn.nextInt(30) + ", ");
        }
    }

    public void pass() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password:");
        String passUser = sc.nextLine();
        String pass = "pass";
        System.out.println(pass.equals(passUser));
    }

    public void numbers() {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(" ");
        System.out.println("Even: ");
        for (int i = 0; i < split.length; i++) {
            int s = Integer.parseInt(split[i]);
            if (s % 2 == 0) {
                System.out.println(s);
            }
        }
        System.out.println("Odd: ");
        for (int i = 0; i < split.length; i++) {
            int s = Integer.parseInt(split[i]);
            if (s % 2 != 0) {
                System.out.println(s);
            }
        }
        System.out.println("Divide to 3 and 9:");
        for (int i = 0; i < split.length; i++) {
            int s = Integer.parseInt(split[i]);
            if ((s % 3 == 0) && (s % 9 == 0)) {
                System.out.println(s);
            } else System.out.println("No result");

        }

        System.out.println("Divide to 5 and 7:");
        for (int i = 0; i < split.length; i++) {
            int s = Integer.parseInt(split[i]);
            if ((s % 5 == 0) && (s % 7 == 0)) {
                System.out.println(s);
            } else System.out.println("No result");
        }
        System.out.println("Numbers with 3 elements:");
        for (int i = 0; i < split.length; i++) {

            int s = Integer.parseInt(split[i]);
            if ((s % 5 == 0) && (s % 7 == 0)) {
                System.out.println(s);
            } else System.out.println("No result");
        }
    }

    public void threeNumb() {
        Scanner sc = new Scanner(System.in);
        String b;
        String[] split = sc.nextLine().split(" ");
        for (int i = 0; i < split.length; i++) {
            b = split[i];
            if (b.charAt(1) == b.charAt(0) || b.charAt(1) == b.charAt(2)) {
                System.out.println(split[i]);
            }
        }
    }

    public void lucky() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int number1 = (i / 1000) % 10 % 10;
        int number2 = (i / 100) % 10 % 10 % 10;
        int number3 = (i / 10) % 10 % 10 % 10 % 10;
        int number4 = i % 10 % 10 % 10 % 10;
        if (number1 + number2 == number3 + number4)
            System.out.println(i + " Lucky ticket");
        else System.out.println("Not lucky ticket");
    }
}









