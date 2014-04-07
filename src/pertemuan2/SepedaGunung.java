/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuan2;

/**
 *
 * @author zword
 */


// Sepeda Gunung mewarisi semua method dan atribut dari sepepda

public class SepedaGunung extends Sepeda{

    public SepedaGunung(int kecepatan) { 
        // constructor sepeda gunung harus dibuat 
        //karena sepeda mempunyai konstruktor yang variabelnya harus di isi 
        
        super(kecepatan); // kata kunci super digunakan untuk memanggil variabel / method dari parent classnya
    }
    
    public void naikGunung(){ // method tambahan yang hanya dimiliki oleh sepeda gunung
        System.out.println("Bisa naik gunung");
    }
    
}
