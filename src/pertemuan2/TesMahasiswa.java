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
public class TesMahasiswa {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();  // membuat object m1 dari Mahasiswa
        System.out.println("nrp = "+m1.nrp +" ,nama = "+m1.nama);
        
        Mahasiswa m2 = new Mahasiswa("dwica");
        System.out.println("nrp = "+m2.nrp +" ,nama = "+m2.nama);
        
        Mahasiswa m3 = new Mahasiswa(779, "ihsan");
        System.out.println("nrp = "+m3.nrp +" ,nama = "+m3.nama);        
    }
}
