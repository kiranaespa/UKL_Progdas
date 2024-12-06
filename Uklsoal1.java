/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.uklsoal1;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class Uklsoal1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan total belanja: Rp ");
        double totalBelanja = scanner.nextDouble();
        double totalBayar;

        System.out.print("Apakah Anda mempunyai card member? (ya/tidak): ");
        String hasMemberCard = scanner.next();

        if (hasMemberCard.equalsIgnoreCase("ya")) {
            if (totalBelanja >= 100_000 && totalBelanja <= 200_000) {
                totalBayar = totalBelanja * 0.85; // Diskon 15% untuk member
            } else if (totalBelanja > 200_000) {
                totalBayar = totalBelanja * 0.75; // Diskon 25% untuk member
            } else {
                totalBayar = totalBelanja; // Tidak ada diskon
            }
        } else {
            if (totalBelanja >= 100_000 && totalBelanja <= 200_000) {
                totalBayar = totalBelanja * 0.90; // Diskon 10% untuk non-member
            } else if (totalBelanja > 200_000) {
                totalBayar = totalBelanja * 0.80; // Diskon 20% untuk non-member
            } else {
                totalBayar = totalBelanja; // Tidak ada diskon
            }
        }

        System.out.printf("Total yang harus dibayar: Rp %.2f%n", totalBayar);

    }
}
