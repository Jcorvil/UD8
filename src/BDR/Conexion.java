package BDR;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/tienda";
                    //":protocolo://puerto:puerto/BBDD"
        try {
            Connection con = DriverManager.getConnection(url, "jorge", "jorge");
            Statement stm = con.createStatement();

            //TODO consultas



            //Cerrar la conexión
            stm.close();
            con.close();

        } catch (SQLException e) {
            System.err.println("La conexión ha fallado: " + e.getMessage());
        }
    }
}