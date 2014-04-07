/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuan2;

/**
 *
 * @author zword
 */
public class Dewasa extends Bayi{
    
    @Override
    public void lari(){
        System.out.println("Lariii!!");
    }
    
    // istilah overide adalah ketika method dengan nama dan parameter yang sama ditulis kembali
    // berfungsi untuk menulis kembali method dari parent class berisi method yamg kita inginkan
}
