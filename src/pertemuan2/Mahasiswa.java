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
public class Mahasiswa {
    int nrp;
    String nama;
    
    public Mahasiswa(){ // constructor / termasuk method tanpa tipe
        nrp = 0;
        nama = "";
    }
    
    public  Mahasiswa(String nama){ // constructor dengan tambahan parameter nama
        nrp = 0 ;
        this.nama = nama;
    }
    
    public Mahasiswa(int nrp,String nama){ // constructor dengan tambahan parameter nrp dan nama 
        this.nrp = nrp ;
        this.nama = nama;
    }
    
    // method bernama sama tetapi berparameter berbeda disebut dengan OVERLOADING
}
