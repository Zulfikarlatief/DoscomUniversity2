/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

/**
 *
 * @author zword
 */
public class Manusia {

   
    public int tinggi; // variabel tinggi dan berat sebagai atribut / varabel global
    public int berat;
    
    public static void main(String [] args){
        
        Manusia tono = new Manusia();//pembuatan object
        
        tono.tinggi = 150;//input langsung
        tono.berat  = 60;
        System.out.println("Tinggi tono : "+tono.tinggi ); // mengeluarkan output tinggi dari objek tono
        System.out.println("Berat tono : "+tono.berat );
        
    }
    
    
}
