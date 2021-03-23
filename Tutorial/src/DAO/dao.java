package DAO;

import Connection.DatabaseConnection;
import Model.userModel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dao extends DatabaseConnection {
    public boolean checkLogin(userModel userModel){
        boolean check = false;
        String sql ="select * from [DangNhap] where UserName = " + "'" + userModel.getUserName() + "'";
        Connection conn =super.getJDBCConnection();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
//                if(Username.equals(rs.getString("Staff_Account")) && BCrypt.checkpw(Password, rs.getString("Staff_Password"))){
                if(userModel.getUserName().equals(rs.getString("UserName")) && userModel.getPassword().equals(rs.getString("Password"))){
                    check = true;
                }
            }
            else {
                check = false;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return check;
    }
}
