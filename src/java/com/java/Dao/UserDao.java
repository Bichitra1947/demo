
package com.java.Dao;

import com.java.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDao {
    public static boolean insertUserdeatils(String[] data){
        boolean status=false;
        try {
            Connection con=ConnectionFactory.getConnection();
            PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?,?)");
            ps.setString(1, data[0]);
            ps.setString(2, data[1]);
            ps.setString(3, data[2]);
            ps.setString(4, data[3]);
            ps.setString(5, data[4]);
            int count=ps.executeUpdate();
            if(count>0){
               status=true; 
            }else{
                status=false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
}
