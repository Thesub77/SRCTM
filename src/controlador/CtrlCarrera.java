package controlador;

import java.sql.SQLException;
import negocio.Carrera;

public class CtrlCarrera {
    
    // Metodo para mandar a insertar una carrera
    public static int insertar_carrera(String codigo, String descripcion)
            throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Carrera carr = new Carrera(codigo, descripcion);
        return carr.insertarRegistro();
    }
    
    // Metodo para mandar a leer un registro de Carrera
    public static Carrera leerRegistro(String codigo) throws
            ClassNotFoundException,
            InstantiationException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Carrera carr = new Carrera();
        return carr.leerRegistro(codigo);
    }
    
    // Metodo para mandar a eliminar un registro de Carrera
    public static boolean eliminar(String codigo) throws ClassNotFoundException,
            InstantiationException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        
        Carrera carr = new Carrera();
        return carr.borrarRegistro(codigo);
    }
}
