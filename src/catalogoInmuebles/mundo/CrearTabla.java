/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catalogoInmuebles.mundo;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;


/**
 *
 * @author Andrea Baron
 */
public class CrearTabla {
    public static void main(String[] args) throws Exception {
        System.out.println("¡Hola!");
        //Conexión a la BD
        ConnectionSource conexion;
        
        //URL de la BD. Crea la BD si no existe.
        String url = "jdbc:h2:file:./data/inmobiliaria";
        
        //Conectarse a la BD de la URL
        conexion = new JdbcConnectionSource(url);
        System.out.println("¡Conexión correcta!");
        //Crear la tabla inmuebles
        TableUtils.createTableIfNotExists(conexion, Inmueble.class);
        System.out.println("¡Tabla de inmuebles creada correctamente!");
        
        //Cerrar la conexión
        conexion.close();
    }
    
}
