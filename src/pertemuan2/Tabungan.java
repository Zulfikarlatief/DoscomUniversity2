/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

/**
 *
 * @author zword
 */

// Membahas  


public class Tabungan {
    
    int saldo; // variabel saldo / atribut saldo
    
    public Tabungan(int a){
        saldo = a;      // mengeset nilai saldo
    }
    
    void ambilUang(int jumlah){
        saldo = saldo - jumlah; // mengambil nilai saldo
    }
    
    
    
}
