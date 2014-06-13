/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

import java.util.List;
import java.util.ArrayList;
import pertemuan2.Manusia;



/**
 *
 * @author zword
 */
public class ListArray {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>(); // membuat array list dengan Tipe String
    list.add("alpha"); //menambahkan isi array
    list.add("beta");
    list.add("charlie");
    list.add("alternative");
    list.add("zeta");
    
    
    System.out.println("isi dari list : ");
    for(int i=0; i< list.size();i++) { // looping array biasa
      System.out.println("index ke-" + i + ":" + list.get(i) ); 
    }
    
      System.out.println("");
    
    System.out.println("isi dari list : ");
    for(String a:list) { // looping array dengan list
      System.out.println(a); 
    }
    
    
      System.out.println("");
    
    List<Manusia> listManusia = new ArrayList<Manusia>(); // membuat Array list dengan tipe Manusia
    Manusia m1 = new Manusia();
    m1.berat = 1;
    m1.tinggi = 2;
    
    Manusia m2 = new Manusia();
    m2.berat = 5;
    m2.tinggi = 7;
    
    listManusia.add(m1);
    listManusia.add(m2);
    
    System.out.println("isi dari list : ");
    for(Manusia b:listManusia) {
      System.out.println("Manusia berat "+b.berat);
      System.out.println("Manusia tinggi "+b.tinggi);
      
        System.out.println("");
    }
  }

}
