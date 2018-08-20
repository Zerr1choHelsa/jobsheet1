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
public class Biodata { 
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        String jenis,tempatlahir,alamat,nama,motto;
        int NIS,tgllahr;
        System.out.println("nama : ");   
        nama = masukan.nextLine( );
        System.out.println("NIS : ");
        NIS = masukan.nextInt();
        System.out.println("Tempat Lahir : ");
        tempatlahir = masukan.nextLine();
        System.out.println("Tanggal Lahir : ");
        tgllahr = masukan.nextInt();
        System.out.println("Jenis Kelamin : ");
        jenis = masukan.nextLine();
        System.out.println("Alamat : ");
        alamat = masukan.nextLine();
        System.out.println("Motto Hidup : ");
        motto = masukan.nextLine();
        
        
        
    }
    
}
