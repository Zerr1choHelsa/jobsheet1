/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class KonversiSuhu { 
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        float F,C,K,R;
        System.out.println("Masukan Suhu Celcius : ");
        C =masukan.nextInt();
        F= C*9/5+32;
        R= C*4/5;
        K= C+273;
        System.out.println("Suhu Fareneit :"+F);
        System.out.println("Suhu Reamur : "+R);
        System.out.println("Suhu Kelvin : "+K);
                
    }
    
}
