/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;

import javax.swing.JOptionPane;

/**
 *
 * @author zword
 */
public class TryCatch {
    public static void main(String args[]){
            int pilihan;
            
            try{
            pilihan = Integer.parseInt
                    (JOptionPane.showInputDialog("Masukan Pilihan angka 1 / 2"));
            
            if(pilihan==1)
            {
                System.out.println("Saya Tampan");
            }
            else if(pilihan==2)
            {
                System.out.println("Anda Jelek");
            }
            else{
                System.out.println("Ga bisa Baca ya?");
            }
            }
            catch(Exception e){
                System.out.println("Tambah ngawur");
                System.out.println("Error "+e);

            }
     
    }
}
