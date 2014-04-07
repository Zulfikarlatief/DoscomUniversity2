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
public class Sepeda {
    int kecepatan;



    public Sepeda(int kecepatan) {
        this.kecepatan = kecepatan;
    }
     

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public void jalan(){
        System.out.println("Jalan dengan kecepatan "+getKecepatan());
    }
    
     
}
