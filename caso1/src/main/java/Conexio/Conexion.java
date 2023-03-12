
package Conexio;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Conexion {
    
    public class Conexion {
    Connection con;
    public Conexion() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_Peliculas","admin","Joshuagonzalez");
        } catch (ClassNotFoundException e) {
            System.err.println("Error:" +e);
        }
    }
    public static void main(String[] args) throws SQLException {
        Conexion cn=new Conexion();
        Statement st;
        ResultSet rs;
        try {
            st=(Statement) cn.con.createStatement();
            rs=st.executeQuery("select * from usuario");
            while (rs.next()) {                
                System.out.println(rs.getInt("id")+" " +rs.getString("user")+" " +rs.getString("dni"));
            }
            cn.con.close();
        } catch (SQLException e) {
        }
        
    }
    }
}
