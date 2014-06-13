/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;

/**
 *
 * @author zword
 */
public class Perulangan {
    
     public static void main (String args[]) { 
//         int count=1; //initial awal = 1
//         for (int i=0; i<9; i++) { // i = 1 sampai dangan i kurang dari 9 , dan akan terus bertambah 1
//             //i = 0
//            for (int j=0; j<i+1; j++) { 
// 
//                System.out.print(count);  //output count
//            } 
//            
//            count++;  // isi count bertambah 1
//            
//            System.out.println();  // membuat new line / baris baru
//        }
        
         
        // buat contoh perulangan untuk menghitung faktorial
         
        int faktor = 5;
        int hasil = 1;
        
        for(int h=faktor ; h>=1 ; h--){
            hasil = hasil * h;
            System.out.print(h+" * ");
        }
         System.out.println("");
         System.out.println(hasil);
        
        
        // 10! = 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1
     } 
 
}
