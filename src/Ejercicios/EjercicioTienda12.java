package Ejercicios;

import java.sql.*;

public class EjercicioTienda12 {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/tienda";

        try {
            Connection con = DriverManager.getConnection(url, "root", "");
            Statement stm = con.createStatement();

            //El metadata nos permite ver datos que se necesitan para realizar operaciones, como la URL, o
            //el usuario de la BBDD.

            DatabaseMetaData metaData = con.getMetaData();
            metaData.getCatalogs();

            System.out.println("•El usuario en uso es: " + metaData.getUserName());
            System.out.println("•La URL en uso es: " + metaData.getURL());
            System.out.println("•Versión: " + metaData.getDriverName() + metaData.getDriverVersion());
            System.out.println("•El SGBD: " + metaData.getDatabaseProductName());


            ResultSet resultado = metaData.getTables(null, "tienda", null, null);
            resultado = metaData.getColumns("tienda", null, null, null);

            System.out.println("Columnas de 'producto' de la BBDD 'tienda': ");
            while (resultado.next()){
                System.out.println(resultado.getString("COLUMN_NAME"));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}