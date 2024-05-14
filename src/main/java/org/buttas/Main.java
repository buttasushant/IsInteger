package org.buttas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Programme to check if input is integer or not");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        if (sc.hasNextInt())
        {
            System.out.println("Input is an integer");
        }
        else
        {
            System.out.println("Input is not an integer");
        }
    }
}