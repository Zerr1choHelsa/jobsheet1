/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContohBufferReader {
    public static void main(String[] args) throws IOException {
        String nama;
        // Membuat Objek Imputanstream
        InputStreamReader isr = new InputStreamReader(System.in);
        // Membuat Objek BufferReader
        BufferedReader br = new BufferedReader(isr);
        // Mengisi Variabel nama dengan BufferReader
        System.out.println("Inputkan Nama : ");
        nama = br.readLine();
        // Tampilkan Output isi variabel nama
        System.out.println("Nama Kamu adalah : " + nama);
        
    }
    
}
