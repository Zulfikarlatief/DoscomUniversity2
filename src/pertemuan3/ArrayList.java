/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

import java.util.List;



/**
 *
 * @author zword
 */
public class ArrayList {
  public static void main(String[] args) {
    List<String> list = new java.util.ArrayList<>();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("a");
    list.add("z");
    
    
    System.out.println("isi dari list : ");
    for(int i=0; i< list.size();i++) {
      System.out.println("index ke-" + i + ":" + list.get(i) ); 
    }
    
    System.out.println("isi dari list : ");
    for(String a:list) {
      System.out.println(a); 
    }
    
    
  }

}
