package negocio;

import datos.DB_ModalidadGraduacion;
import java.sql.SQLException;

public class ModalidadGraduacion {
    
    // Variables de instancia
    protected String codigoModalidad;
    protected String descripcion;

    // Constructores
    public ModalidadGraduacion() {
        this.codigoModalidad = "";
        this.descripcion = "";
    }

    public ModalidadGraduacion(String codigoModalidad, String descripcion) {
        this.codigoModalidad = codigoModalidad;
        this.descripcion = descripcion;
    }

    public String getCodigoModalidad() {
        return codigoModalidad;
    }

    public void setCodigoModalidad(String codigoModalidad) {
        this.codigoModalidad = codigoModalidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    // Metodo para insertar una modalidad
    public int insertarRegistro() throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        DB_ModalidadGraduacion mod_db = new DB_ModalidadGraduacion(this);

        //Verificar si es una actualización o una nueva inserción
        if (!mod_db.verificarModalidad()) {
            return mod_db.insertar(false);  //Se trata de una nueva inserción
        } else {
            return mod_db.insertar(true); //Se trata de una actualización   
        }
    }
    
    // Metodo para leer una modalidad
    public ModalidadGraduacion leerRegistro(String codigo) throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        DB_ModalidadGraduacion bdMod = new DB_ModalidadGraduacion();
        return bdMod.buscarModalidad(codigo);
    }
    
    // Metodo para anular un registro de modalidad
    public boolean borrarRegistro(String codigo) throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        
        DB_ModalidadGraduacion bdMod = new DB_ModalidadGraduacion();
        return bdMod.borrar(codigo);
    }
}
