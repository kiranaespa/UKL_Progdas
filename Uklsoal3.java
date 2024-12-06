/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoal3;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
public class Uklsoal3 {

    public static void main(String[] args) {
        int[] array = {5, -3, 7, 9, -1};
        String hasil = deteksiElemenNegatif(array);
        System.out.println(hasil);
    }

    public static String deteksiElemenNegatif(int[] array) {
        ArrayList<Integer> negatif = new ArrayList<>(); 

        for (int num : array) {
            if (num < 0) { 
                negatif.add(num); 
            }
        }

        if (!negatif.isEmpty()) {
            return "Array mengandung elemen negatif: " 
                    + negatif.toString().replace("[", "").replace("]", "");
        } else {
            return "Array tidak mengandung elemen negatif.";
        }
    }
}