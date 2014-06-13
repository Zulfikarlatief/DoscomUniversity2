/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuan4;

import java.sql.Connection;
//import java.sql.Driver;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zword
 */
public class DriverRegister {
    private static Connection koneksi;
    
    private static String user="root";
    private static String pass="root" ;
    private static String db="d_university" ;
    
    public static Connection getConnection(){// method bersifat static jadi bisa langsung di panggil
        if(koneksi==null){
            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.
                        getConnection
        ("jdbc:mysql://localhost:3306/"+db,user,pass);
            } catch (Exception e) {
                Logger.getLogger(DriverRegister.class.getName())
                        .log(Level.SEVERE,null,e);
            }
            
        }
        return koneksi;
    }
    
}
