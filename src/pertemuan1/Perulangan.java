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
         int count=1; //initial awal = 1
         for (int i=0; i<9; i++) { // i = 1 sampai dangan i kurang dari 9 , dan akan terus bertambah 1
             
            for (int j=0; j<i+1; j++) { 
 
                System.out.print(count); 
            } 
            
            count++; 
            System.out.println(); 
        } 
     } 
 
}
