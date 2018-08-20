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
public class TestSiswa {
public static void main ( String args[]){
EncapSiswa siswa = new EncapSiswa();
siswa.setName("julian");
siswa.setAge(23);
siswa.setaddress("Malang");
    System.out.println("Nama : "+ siswa.getName() + "  Absen : "+siswa.getAbsen()+"  Address : "+ siswa.getAddress()); 
}    
}
