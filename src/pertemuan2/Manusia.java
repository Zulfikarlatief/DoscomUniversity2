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

   
    int tinggi;
    int berat;
    
    public static void main(String [] args){
        
        Manusia tono = new Manusia();//pembuatan object
        tono.tinggi = 150;//input langsung
        tono.berat  = 60;
        System.out.println("Tinggi tono : "+tono.tinggi );
        System.out.println("Berat tono : "+tono.berat );
        
    }
    
    
}
