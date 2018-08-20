/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum_lat2;

/**
 *
 * @author User
 */

public class UjiBUs {
    public static void main(String[] args) {
        // Membuat objek bus mini dari kelas bus
        Bus busMini = new Bus();
        // Masukan nilai Jumlah Penumpang dan penumpang maksimal ke
        // dalam objek busMini
        busMini.penumpang = 5 ;
        busMini.maxPenumpang = 15;
        //memanggil metod cetak kelas Bus
        busMini.cetak();
        
        //menambahkan penumpang pada busMinin
        busMini.penumpang = busMini.penumpang + 5;
        //memanggil method cetak pada kelas Bus
        busMini.cetak();
        
        //mengurangi jumlah pada miniBus
        busMini.penumpang = busMini.penumpang - 2;
        busMini.cetak();
        
        //Menambah Jumlah penumpag pada bus mini
        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();
        
        
    }
    
}
