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
public class UjiBus2 {
    public static void main(String[] args) {
        //membuat Objek busBesar dari class Bus
        Bus busBesar = new Bus(40);
        busBesar.cetak();
        // penambahan penumpang
        busBesar.addPenumpang(15);//menambah penumpang 15
        busBesar.cetak();
        //penambah Penumpang
        busBesar.addPenumpang(5);
        busBesar.cetak();
        // Penambahan Penumpang
        busBesar.addPenumpang(26);
        busBesar.cetak();
    }
    
}
