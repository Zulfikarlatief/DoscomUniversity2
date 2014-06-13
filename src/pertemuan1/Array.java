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
        int nilai[]=new int[3];  // Array berisi 3 yang memuat angka / integer 
//        nilai[0]=70; 
//        nilai[1]=80; 
//        nilai[2]=65; 
// 
//        double ratarata=0.0;  // initial rata rata , double lebih panjang dari float
//        
//        for(int i=0; i<nilai.length; i++) { // length menunjukan panjang dari sebuah array
//            
//            ratarata= ratarata + nilai[i];        
//            
//        }
//        ratarata=ratarata/nilai.length; // menghitung rata2
// 
//        System.out.println("Nilai rata-rata = " + ratarata); 
        
        // BUat Array berisi 5 , yang memuat tentang nama lalu tampilkan hasilnya
        
        String nama[];
 
        
        //Tulis code di bawah
        nama = new String[5];
        
        nama[0]= "aaaaa";
        nama[1]= "bbbbb";
        nama[2]= "cccccc";
        nama[3]= "ddddd";
        nama[4]= "eeeeee";
        
         for(int i=0; i<nama.length; i++) { // length menunjukan panjang dari sebuah array
            
             System.out.println(nama[i]);      
            
        }
    } 
    
    

}
