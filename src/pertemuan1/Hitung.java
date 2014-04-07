/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;

/**
 *
 * @author zword
 */
public class Hitung {
    final static float phi = 3.14f; // tipe data float , final seperti constan / tidak dapat dirubah
    static int jari2;   // harus diberi static karena variabel global 
    static float luas;
    
    public static void main(String [] args){
        jari2 = 7; // assignment langsung karena method static
        luas = phi*jari2*jari2;
        
        System.out.println("Luas lingkaran dengan jari2 "+jari2 +" adalah : "+luas );
    }
    
    // BUat output untuk menghitung luas persegi
}
