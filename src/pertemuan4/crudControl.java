/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuan4;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zword
 */
public class crudControl {
    public List<crudModel> loadDbModel () throws SQLException{
        Statement statement = DriverRegister
                .getConnection().createStatement(); // membuat koneksi
        ResultSet resultSet = statement.executeQuery("select * from crud"); // menjalankan query
        
        List<crudModel> list = new ArrayList<crudModel>();
        
        while(resultSet.next()){
            crudModel model = new crudModel(); // membuat object
            
            model.setNim(resultSet.getString("nim"));
            model.setNama(resultSet.getString("nama"));
            model.setNilai(resultSet.getInt("nilai"));
            
            list.add(model); // object dimasukkan dalam list
        }
        return list;
    }
    
    public void isiTabelCrud(crudModel model)throws SQLException{
        PreparedStatement preparedStatement = DriverRegister.getConnection().
                prepareStatement("insert into crud (nim,nama,nilai) values (?,?,?)");
        preparedStatement.setString(1, model.getNim());
        preparedStatement.setString(2, model.getNama());
        preparedStatement.setInt(3, model.getNilai());
        
        preparedStatement.executeUpdate();
    }
    
    public void hapusTabelCrud(crudModel model)throws SQLException{
        PreparedStatement preparedStatement = DriverRegister.getConnection().
                                    prepareStatement("delete from crud where nim = ? ");
        preparedStatement.setString(1, model.getNim());
        preparedStatement.executeUpdate();

    }
    
    
    
}
