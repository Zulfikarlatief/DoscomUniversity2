/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;

/**
 *
 * @author zword
 */

public class coba { 
    public static void main(String args[]) { 
        Tabungan tabunganeKowen = new Tabungan(5000); // Membuat objek tabunganeKowen dar tabungan
        System.out.println("Saldo awal : "+tabunganeKowen.saldo);
        
        tabunganeKowen.ambilUang(2300); 
        System.out.println("Jumlah uang yang diambil : 2300"); 
        
        System.out.println("Saldo sekarang : " + tabunganeKowen.saldo); 
    } 
} 
 