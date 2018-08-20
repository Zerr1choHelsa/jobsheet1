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
public class Bus2 {
   private int penumpang ;
   private int maxPenumpang;
   
   //konstruktor kelas Bus
   public Bus2(int maxpenumpang){
       this.maxPenumpang = maxPenumpang;
       penumpang = 0;
   
   }
   //method mutator untuk menambah penumpang
   public void addPenumpang(int penumpang){
   int temp;
   temp = this.penumpang+penumpang;
   if (temp >= maxPenumpang){
       System.out.println(" Penumpang Melebihi Kuota");}
   
   else { this.penumpang = temp;}
   }
    public void cetak(){
        System.out.println("Penumpang Bus Sekarang adalah : "+penumpang);
        System.out.println("Penumpang Maksimum seharusnya adalah " + maxPenumpang);
    }
}
