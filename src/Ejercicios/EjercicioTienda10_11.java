package Ejercicios;

import java.sql.*;

public class EjercicioTienda10_11 {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/tienda";

        try {
            Connection con = DriverManager.getConnection(url, "root", "");
            Statement stm = con.createStatement();

            //Ejercicio 10 VV

            String queryDelete = "DELETE FROM producto";

            stm.executeUpdate(queryDelete);

            String queryInsert1 = "INSERT INTO tienda.producto (id, nombre, descripcion, precio, pais)" +
                    "VALUES ('1', 'manzana', 'manzanas golden', '50', 'Francia')";
            stm.executeUpdate(queryInsert1);

            String queryInsert2 = "INSERT INTO tienda.producto (id, nombre, descripcion, precio, pais)" +
                    "VALUES ('2', 'pera', 'peras conferencia', '25', 'Espana')";
            stm.executeUpdate(queryInsert2);

            String queryInsert3 = "INSERT INTO tienda.producto (id, nombre, descripcion, precio, pais)" +
                    "VALUES ('3', 'uva', 'uva gourmet', '30', 'Espana')";
            stm.executeUpdate(queryInsert3);

            String querySelect = "SELECT * FROM producto;";
            ResultSet resultadoTabla = stm.executeQuery(querySelect);

            //Para Imprimir los resultados
            System.out.println("Resultado ejercicio 10: ");
            while (resultadoTabla.next()){
                System.out.println("•Producto: " + resultadoTabla.getString("nombre") + " " +
                        "•Descripcion: " + resultadoTabla.getString("descripcion") + " " +
                        "•Precio: " + resultadoTabla.getString("precio") + " " +
                        "•Pais: " + resultadoTabla.getString("pais"));
            }

            //Ejercicio 10 ^^


            //Ejercicio 11 VV
            stm.addBatch("DELETE FROM producto");
            stm.addBatch("INSERT INTO tienda.producto (id, nombre, descripcion, precio, pais)" +
                    "VALUES(1, 'Manzana', 'Manzanas Golden', 50, 'Francia'), " +
                    "(2, 'pera', 'peras conferencia', 25, 'Espana'), (3, 'uva', 'uva gourmet', 30, 'Espana')");
            stm.addBatch("UPDATE tienda.producto SET precio = 20 WHERE producto.nombre LIKE 'Pera'");
            stm.addBatch("INSERT INTO tienda.producto (id, nombre, descripcion, precio, pais)" +
                    "VALUES(4, 'Kiwi', 'Zaspri Gold', 120, 'Nueva Zelanda'), " +
                    "(5, 'Perito', 'Perito de Tavizna', 18, 'Espana')," +
                    "(6, 'Platano', 'Platano canario', 40, 'Espana')");

            stm.executeBatch();

            String querySelect2 = "SELECT * FROM producto;";
            ResultSet resultadoTabla2 = stm.executeQuery(querySelect2);

            System.out.println("Resultado ejercicio 11: ");
            while (resultadoTabla2.next()){
                System.out.println("•Producto: " + resultadoTabla2.getString("nombre") + " " +
                        "•Descripcion: " + resultadoTabla2.getString("descripcion") + " " +
                        "•Precio: " + resultadoTabla2.getString("precio") + " " +
                        "•Pais: " + resultadoTabla2.getString("pais"));
            }

            con.commit();
            stm.close();
            con.close();

            //Ejercicio 11 ^^


            //Cerrar la conexión
            stm.close();
            con.close();

        } catch (SQLException e) {
            System.err.println("La conexión ha fallado: " + e.getMessage());
        }
    }
}