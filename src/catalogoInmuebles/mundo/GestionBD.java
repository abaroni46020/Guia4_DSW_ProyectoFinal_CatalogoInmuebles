/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catalogoInmuebles.mundo;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrea Baron
 */

/**
 * Clase que permite la gestión de la BD, por ejemplo, insertar nuevos registros y realizar consultas.
 */

public class GestionBD {


    /**
     * Método para insertar nuevo registro de inmueble en la BD.
     */

    public void insertarNuevoInmueble(String codig, String loc, String area1, String prec,
                                      String habit, String tipo, String cat, String contac) throws Exception {
       //Conexión a la BD
        ConnectionSource conexion;

        //URL de la BD. Crea la BD si no existe.
        String url = "jdbc:h2:file:./data/inmobiliaria";

        //Conectarse a la BD de la URL
        conexion = new JdbcConnectionSource(url);

        //DAO = Data Access Object
        Dao<Inmueble, Integer> tablaInmuebles;
        tablaInmuebles = DaoManager.createDao(conexion, Inmueble.class);

        //Convertir a enteros
        int cod = Integer.parseInt(codig);
        int are = Integer.parseInt(area1);
        int pre = Integer.parseInt(prec);
        int hab = Integer.parseInt(habit);

        //Crear registro en la tabla
        Inmueble inmueble = new Inmueble(cod, loc, are, pre, hab, tipo, cat, contac);
        tablaInmuebles.create(inmueble);

        //Mostrar todos los inmuebles registrados en la BD.
        List<Inmueble> losInmuebles = tablaInmuebles.queryForAll();
        for (Inmueble i : losInmuebles) {
            System.out.println("Código: " + i.getCodigo());
            System.out.println("Habitaciones: " + i.getNumHabitaciones());
        }

        //Cerrar la conexión
        conexion.close();
    }

    /**
     * Método que devuelve el inmueble del catálogo con mayor precio.
     */
    public List<Inmueble> buscarPorMayorPrecio() throws Exception {

        //Conexión a la BD
        ConnectionSource conexion;

        //URL de la BD. Crea la BD si no existe.
        String url = "jdbc:h2:file:./data/inmobiliaria";

        //Conectarse a la BD de la URL
        conexion = new JdbcConnectionSource(url);

        //DAO = Data Access Object que nos permite recorrer la tabla
        Dao<Inmueble, Integer> tablaInmuebles;
        tablaInmuebles = DaoManager.createDao(conexion, Inmueble.class);

        //Guarda los registros de la tabla inmuebles de la BD en la lista losInmuebles.
        List<Inmueble> losInmuebles = tablaInmuebles.queryForAll();

        //Búsqueda del inmueble con precio más alto.
        List<Inmueble> listaResultados = new ArrayList<>();
        Inmueble res = new Inmueble();
        res.setPrecio(0);
        for (Inmueble i : losInmuebles){
            if (res.getPrecio() <= i.getPrecio()) {
                res = i;
            }
        }
        listaResultados.add(res);

        //Cerrar la conexión
        conexion.close();
        return listaResultados;
    }

    /**
     * Método que devuelve el inmueble del catálogo con menor precio.
     */
    public List<Inmueble> buscarPorMenorPrecio() throws Exception {

        //Conexión a la BD
        ConnectionSource conexion;

        //URL de la BD. Crea la BD si no existe.
        String url = "jdbc:h2:file:./data/inmobiliaria";

        //Conectarse a la BD de la URL
        conexion = new JdbcConnectionSource(url);

        //DAO = Data Access Object que nos permite recorrer la tabla
        Dao<Inmueble, Integer> tablaInmuebles;
        tablaInmuebles = DaoManager.createDao(conexion, Inmueble.class);

        //Guarda los registros de la tabla inmuebles de la BD en la lista losInmuebles.
        List<Inmueble> losInmuebles = tablaInmuebles.queryForAll();

        //Búsqueda del inmueble con precio más bajo.
        List<Inmueble> listaResultados = new ArrayList<>();
        Inmueble res = new Inmueble();
        res.setPrecio(1900000000);
        for (Inmueble i : losInmuebles){
            if (res.getPrecio() > i.getPrecio()) {
                res = i;
            }
        }
        listaResultados.add(res);

        //Cerrar la conexión
        conexion.close();
        return listaResultados;
    }

    /**
     * Método que devuelve el inmueble del catálogo con mayor área.
     */
    public List<Inmueble> buscarPorMayorArea() throws Exception {

        //Conexión a la BD
        ConnectionSource conexion;

        //URL de la BD. Crea la BD si no existe.
        String url = "jdbc:h2:file:./data/inmobiliaria";

        //Conectarse a la BD de la URL
        conexion = new JdbcConnectionSource(url);

        //DAO = Data Access Object que nos permite recorrer la tabla
        Dao<Inmueble, Integer> tablaInmuebles;
        tablaInmuebles = DaoManager.createDao(conexion, Inmueble.class);

        //Guarda los registros de la tabla inmuebles de la BD en la lista losInmuebles.
        List<Inmueble> losInmuebles = tablaInmuebles.queryForAll();

        //Búsqueda del inmueble con precio más alto.
        List<Inmueble> listaResultados = new ArrayList<>();
        Inmueble res = new Inmueble();
        res.setArea(0);
        for (Inmueble i : losInmuebles){
            if (res.getArea() <= i.getArea()) {
                res = i;
            }
        }
        listaResultados.add(res);

        //Cerrar la conexión
        conexion.close();
        return listaResultados;
    }

    /**
     * Método que devuelve el inmueble del catálogo con menor área.
     */
    public List<Inmueble> buscarPorMenorArea() throws Exception {

        //Conexión a la BD
        ConnectionSource conexion;

        //URL de la BD. Crea la BD si no existe.
        String url = "jdbc:h2:file:./data/inmobiliaria";

        //Conectarse a la BD de la URL
        conexion = new JdbcConnectionSource(url);

        //DAO = Data Access Object que nos permite recorrer la tabla
        Dao<Inmueble, Integer> tablaInmuebles;
        tablaInmuebles = DaoManager.createDao(conexion, Inmueble.class);

        //Guarda los registros de la tabla inmuebles de la BD en la lista losInmuebles.
        List<Inmueble> losInmuebles = tablaInmuebles.queryForAll();

        //Búsqueda del inmueble con precio más bajo.
        List<Inmueble> listaResultados = new ArrayList<>();
        Inmueble res = new Inmueble();
        res.setArea(10000);
        for (Inmueble i : losInmuebles){
            if (res.getArea() > i.getArea()) {
                res = i;
            }
        }
        listaResultados.add(res);

        //Cerrar la conexión
        conexion.close();
        return listaResultados;
    }


    /**
     * Método para buscar inmuebles del catálogo por el código ingresado por el usuario.
     */
    public List<Inmueble> buscarporCodigo(String codigo) throws Exception {
        int cod = Integer.parseInt(codigo);
        //Conexión a la BD
        ConnectionSource conexion;

        //URL de la BD. Crea la BD si no existe.
        String url = "jdbc:h2:file:./data/inmobiliaria";

        //Conectarse a la BD de la URL
        conexion = new JdbcConnectionSource(url);

        //DAO = Data Access Object que nos permite recorrer la tabla
        Dao<Inmueble, Integer> tablaInmuebles;
        tablaInmuebles = DaoManager.createDao(conexion, Inmueble.class);

        //Recupera de la tabla inmuebles en la BD, el registro que coincida con el código ingresado por el usuario.
        List<Inmueble> listaResultados = new ArrayList<>();
        listaResultados.add(tablaInmuebles.queryForId(cod));
        //System.out.println("Size: " + listaResultados.size());
        //Cerrar la conexión
        conexion.close();
        return listaResultados;
    }

    /**
     * Método para buscar inmuebles del catálogo por la localidad seleccionada por el usuario.
     */
    public List<Inmueble> buscarporLocalidad(String loc) throws Exception {

        //Conexión a la BD
        ConnectionSource conexion;

        //URL de la BD. Crea la BD si no existe.
        String url = "jdbc:h2:file:./data/inmobiliaria";

        //Conectarse a la BD de la URL
        conexion = new JdbcConnectionSource(url);

        //DAO = Data Access Object que nos permite recorrer la tabla
        Dao<Inmueble, Integer> tablaInmuebles;
        tablaInmuebles = DaoManager.createDao(conexion, Inmueble.class);

        //Guarda los registros de la tabla inmuebles de la BD en la lista losInmuebles.
        List<Inmueble> losInmuebles = tablaInmuebles.queryForAll();

        //Busca en la lista los elementos que coinciden con la localidad.
        List<Inmueble> listaResultados = new ArrayList<>();
        for (Inmueble i : losInmuebles){
            if (loc.equalsIgnoreCase(i.getLocalidad())) {
                listaResultados.add(i) ;
            }
        }

        //Cerrar la conexión
        conexion.close();
        return listaResultados;
    }

    /**
     * Método para buscar inmuebles del catálogo por rango de precio seleccionado por el usuario.
     */
    public List<Inmueble> buscarPorPrecio(String opcion) throws Exception {

        //Conexión a la BD
        ConnectionSource conexion;

        //URL de la BD. Crea la BD si no existe.
        String url = "jdbc:h2:file:./data/inmobiliaria";

        //Conectarse a la BD de la URL
        conexion = new JdbcConnectionSource(url);

        //DAO = Data Access Object que nos permite recorrer la tabla
        Dao<Inmueble, Integer> tablaInmuebles;
        tablaInmuebles = DaoManager.createDao(conexion, Inmueble.class);

        //Guarda los registros de la tabla inmuebles de la BD en la lista losInmuebles.
        List<Inmueble> losInmuebles = tablaInmuebles.queryForAll();

        //Busca en la lista los elementos que coinciden con el rango de precios.
        List<Inmueble> listaResultados = new ArrayList<>();
        switch (opcion){
            case " < 1'000.000": {
                for (Inmueble i : losInmuebles){
                    if (i.getPrecio() < 1000000) {
                        listaResultados.add(i) ;
                    }
                }
                break;
            }
            case "1'000.001 y 3'000.000": {
                for (Inmueble i : losInmuebles) {
                    if (i.getPrecio() > 1000000 && i.getPrecio() <= 3000000) {
                        listaResultados.add(i);
                    }
                }
                break;
            }
            case "3'000.001 y 5'000.000":{
                for (Inmueble i : losInmuebles) {
                    if (i.getPrecio() > 3000000 && i.getPrecio() <= 5000000) {
                        listaResultados.add(i);
                    }
                }
                break;
            }
            case " > 5'000.000":{
                for (Inmueble i : losInmuebles) {
                    if (i.getPrecio() > 5000000) {
                        listaResultados.add(i);
                    }
                }
                break;
            }
        }

        //Cerrar la conexión
        conexion.close();
        return listaResultados;
    }

    /**
     * Método para buscar inmuebles del catálogo por el tipo de inmueble seleccionada por el usuario.
     */
    public List<Inmueble> buscarPorTipo(String tip) throws Exception {

        //Conexión a la BD
        ConnectionSource conexion;

        //URL de la BD. Crea la BD si no existe.
        String url = "jdbc:h2:file:./data/inmobiliaria";

        //Conectarse a la BD de la URL
        conexion = new JdbcConnectionSource(url);

        //DAO = Data Access Object que nos permite recorrer la tabla
        Dao<Inmueble, Integer> tablaInmuebles;
        tablaInmuebles = DaoManager.createDao(conexion, Inmueble.class);

        //Guarda los registros de la tabla inmuebles de la BD en la lista losInmuebles.
        List<Inmueble> losInmuebles = tablaInmuebles.queryForAll();

        //Busca en la lista los elementos que coinciden con la localidad.
        List<Inmueble> listaResultados = new ArrayList<>();
        for (Inmueble i : losInmuebles){
            if (tip.equalsIgnoreCase(i.getTipoInmueble())) {
                listaResultados.add(i) ;
            }
        }

        //Cerrar la conexión
        conexion.close();
        return listaResultados;
    }
}

