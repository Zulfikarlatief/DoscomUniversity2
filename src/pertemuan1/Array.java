/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;

/**
 *
 * @author zword
 */
public class Array {
    
    public static void main(String args[]) { 
        int nilai[]=new int[3];  // isi array ada 3 
        nilai[0]=70; 
        nilai[1]=80; 
        nilai[2]=65; 
 
        double ratarata=0.0; 
        for(int i=0; i<nilai.length; i++) { // length menunjukan panjang dari sebuah array
            ratarata+=nilai[i];        
        }
        ratarata/=nilai.length; 
 
        System.out.println("Nilai rata-rata = " + ratarata); 
    } 
    
    // BUat Array berisi 10 , yang memuat tentang nama

}