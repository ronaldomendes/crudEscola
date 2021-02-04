/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionSQL;

import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ronaldo Mendes
 */
public class ConexionSQL {
   Connection conectar = null;
   private final String database = "jdbc:mysql://localhost:3306/escola";
   private final String user = "root";
   private final String pass = "";
   
   
   public Connection conexion() {
       try {
           Class.forName("com.mysql.jdbc.Driver");
           conectar = (Connection) DriverManager.getConnection(database, user, pass);
           JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
       } catch(HeadlessException | ClassNotFoundException | SQLException e) {
           JOptionPane.showMessageDialog(null, "Erro de conexão: " + e.getMessage());
       }
       return conectar;
   }
}
