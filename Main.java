package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1, x2, y1, y2, z1, z2;

        Vector vector = new Vector(3, 5, 8);
        System.out.println("Vector lenght: " + vector.lenght(3, 5, 8));
        System.out.println("Input x1,x2,y1,y2,z1,z2");
        x1 = in.nextInt();
        vector.setX1(x1);
        x2 = in.nextInt();
        vector.setX2(x2);
        y1 = in.nextInt();
        vector.setY1(y1);
        y2 = in.nextInt();
        vector.setY2(y2);
        z1 = in.nextInt();
        vector.setZ1(z1);
        z2 = in.nextInt();
        vector.setZ2(z2);
        System.out.println("Scalar product" + vector.scalarProduct());
        System.out.println("Vector product for xy: " + vector.vectorProduct(x1, x2, y1, y2));
        System.out.println("Vector product for yz: " + vector.vectorProduct(y1, y2, z1, z2));
        System.out.println("Vector product for zx: " + vector.vectorProduct(z1, z2, x1, x2));
        System.out.println("Cos = " + vector.cosVector());
        System.out.println("Sum for x: " + vector.sumVector(x1, x2));
        System.out.println("Diff for y: " + vector.diffVector(y1, y2));
        System.out.println("Input N");
        int n = in.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = vector.getRandomNumber();
        }
        System.out.println("Your array[" + n + "]");
        for (int i = 0; i < n; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
