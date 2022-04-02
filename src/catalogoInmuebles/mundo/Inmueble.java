/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catalogoInmuebles.mundo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 *
 * @author Andrea Baron
 */

/**
 * Indica la tabla asociada a la clase.
 */
@DatabaseTable(tableName = "inmuebles")

/**
 * Clase que representa un Inmueble
 */

public class Inmueble {
    // -----------------------------------
    // Atributos
    // -----------------------------------
    
    @DatabaseField(id = true)
    private int codigo;
    
    @DatabaseField(canBeNull = false)
    private String localidad;
    
    @DatabaseField(canBeNull = false)
    private int area;
    
    @DatabaseField(canBeNull = false)
    private int precio;
    
    @DatabaseField(canBeNull = false)
    private int numHabitaciones;
    
    @DatabaseField(canBeNull = false)
    private String tipoInmueble;
    
    @DatabaseField(canBeNull = false)
    private String categoria;
    
    @DatabaseField(canBeNull = false)
    private String numContacto;
    
    // -----------------------------------
    // Constructores
    // -----------------------------------

    public Inmueble() {
    }

    public Inmueble(int codigo, String localidad, int area, int precio, int numHabitaciones, String tipoInmueble, String categoria, String numContacto) {
        this.codigo = codigo;
        this.localidad = localidad;
        this.area = area;
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.tipoInmueble = tipoInmueble;
        this.categoria = categoria;
        this.numContacto = numContacto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public String getTipoInmueble() {
        return tipoInmueble;
    }

    public void setTipoInmueble(String tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNumContacto() {
        return numContacto;
    }

    public void setNumContacto(String numContacto) {
        this.numContacto = numContacto;
    }
    
    
}
