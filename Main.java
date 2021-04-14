package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n;
        System.out.println("Enter the number of terms: ");
        n = sc.nextInt();
        System.out.println("The Series is: ");

        for(i=1; i<=n; i++)
            System.out.println((i*i*i)-1 + " ");
    }
}
