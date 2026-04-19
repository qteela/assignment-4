package sif.geometry.ui;

import java.util.Scanner;
import sif.geometry.circles.one.Circle;

public class CircleDemo_v_2_0 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Circle Demo v2.0");
        System.out.println("by Ushaim");
        System.out.println("=====================");
        System.out.print("Ada berapa lingkaran yang akan dibuat? ");
        int total = scn.nextInt();
        scn.nextLine();

        Circle[] lingkaran = new Circle[total];
        for (int i = 0; i < total; i++) {
            lingkaran[i] = new Circle();
            System.out.println("Lingkaran ke-" + (i + 1));
            System.out.print("  Masukkan ID: ");
            String id = scn.nextLine();
            System.out.print("  Masukkan radius (m): ");
            double radius = scn.nextDouble();
            scn.nextLine();

            lingkaran[i].setId(id);
            lingkaran[i].setRadius(radius);
        }

        System.out.println("Deskripsi seluruh lingkaran");
        System.out.println("---------------------------");
        for (int i = 0; i < total; i++) {
            System.out.println("Lingkaran ke-" + (i + 1) + ":");
            System.out.printf("  ID: %s%n", lingkaran[i].getId());
            System.out.printf("  Radius: %.2f m%n", lingkaran[i].getRadius());
            System.out.printf("  Luas: %.2f m2%n", lingkaran[i].getArea());
            System.out.printf("  Keliling: %.2f m%n", lingkaran[i].getPerimeter());
        }

        scn.close();
    }
}