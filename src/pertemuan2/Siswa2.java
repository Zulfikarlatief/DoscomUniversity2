/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

import javax.swing.JOptionPane;

/**
 *
 * @author zword
 */
public class Siswa2 {
    
    public int nrp; 
 
    
    public Siswa2(int i) { //constructor , dipanggil pertama kali ketika object dibuat
        nrp=i; 
    } 
 
    public void setNrp(int i) { 
        nrp=i; 
    }
    
    public int getNrp() { 
        return nrp; 
    }
    
    public static void main(String[] args) {
            int a;
            a= 3;
            Siswa2 anak=new Siswa2(a); //pembuatan object 
            
            System.out.println(anak.getNrp()); //memangil method get
            
            anak.setNrp(5); //input nrp , memanggil method set
            System.out.println(anak.getNrp()); 
    } 
    
   
}
