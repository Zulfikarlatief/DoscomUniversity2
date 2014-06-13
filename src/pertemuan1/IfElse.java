/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;



/**
 *
 * @author zword
 */
class IfElse { 
    
     public static void main (String args[]) { 
         
          char firstInitial = 'u'; // bisa diinput langsung karena variabel local
          
          
          if (firstInitial == 'a') // jika first inial a
               System.out.println("Nama anda pasti Asep!"); 
          else if (firstInitial == 'b')      // jika first inial b
               System.out.println("Nama anda pasti Brodin!"); 
          else if (firstInitial == 'c') 
               System.out.println("Nama anda pasti Cecep!"); 
          else 
               System.out.println("Nama anda tidak terkenal!"); 
     } 
} 
