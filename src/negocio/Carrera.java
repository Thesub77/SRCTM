package negocio;

import datos.DB_Carrera;
import java.sql.SQLException;

public class Carrera {
    
    // Variables de instancia
    protected String codigoCarrera;
    protected String descripcion;

    // Constructores
    public Carrera() {
        this.codigoCarrera = "";
        this.descripcion = "";
    }

    public Carrera(String codigoCarrera, String descripcion) {
        this.codigoCarrera = codigoCarrera;
        this.descripcion = descripcion;
    }

    // Metodos GET y SET
    public String getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(String codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    // Metodo para insertar una Carrera
    public int insertarRegistro() throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        DB_Carrera carr_db = new DB_Carrera(this);

        //Verificar si es una actualización o una nueva inserción
        if (!carr_db.verificarCarrera()) {
            return carr_db.insertar(false);  //Se trata de una nueva inserción
        } else {
            return carr_db.insertar(true); //Se trata de una actualización   
        }
    }
    
    // Metodo para leer una Carrera
    public Carrera leerRegistro(String codigo) throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        DB_Carrera bdCarr = new DB_Carrera();
        return bdCarr.buscarCarrera(codigo);
    }
    
    // Metodo para anular un registro de modalidad
    public boolean borrarRegistro(String codigo) throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        
        DB_Carrera bdCarr = new DB_Carrera();
        return bdCarr.borrar(codigo);
    }
}
