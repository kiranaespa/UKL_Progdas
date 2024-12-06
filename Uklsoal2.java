/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoal2;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Uklsoal2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bulan = 12;
        int tabungansetiapbulan = 100000;
        int totaltabungan = 0;
        
        System.out.println("Jumlah tabungan setiap bulan");
        
        for (int i = 1; i <= bulan; i++){
            System.out.println("bulan ke -" + i + ": Rp " + tabungansetiapbulan);
            totaltabungan += tabungansetiapbulan;
            tabungansetiapbulan += 50000;
        }
        System.out.println("total tabungan setelah:" + bulan + "bulan: Rp " + totaltabungan);
    }
}
