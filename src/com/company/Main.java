package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, sum;
        System.out.println("Enter Three Numbers (Press Enter after each):");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        sum = n1 + n2 + n3;
        System.out.println("Total = " + sum);
    }
}
