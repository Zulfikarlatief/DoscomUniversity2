/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

/**
 *
 * @author zword
 */
public class Siswa {
        int nrp;
        
        
        public void setNrp(int i) { //method untuk input
            nrp=i; 
        }
        
        public static void main(String[] args) { 
            Siswa anak=new Siswa(); //pembuatan object
            anak.nrp=5; // pengeisian variabel secara langsung
            anak.setNrp(5);  // pengisian variabel melalui method / enkapsulasi
            
            System.out.println(anak.nrp); 
            
            // Buat dibawah
            
            
            
        } 
        
        
         // Buatlah Objek baru dari class Siswa bernama siswaIt   


}
