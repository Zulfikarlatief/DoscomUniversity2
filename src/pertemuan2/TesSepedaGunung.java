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
public class TesSepedaGunung {
    public static void main(String[] args) {
        SepedaGunung sepedaGunung1 = new SepedaGunung(100);
        
        sepedaGunung1.jalan(); 
        // sepedaGunung1 memanggil method jalan dari class sepeda
        // sehingga class SepedaGunung tidak perlu membuat method jalan
    }
}
