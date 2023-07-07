package controlador;

import java.sql.SQLException;
import negocio.ModalidadGraduacion;

public class CtrlModalidadGraduacion {
    
    // Metodo para mandar a insertar una modalidad
    public static int insertar_modalidad(String codigo, String descripcion)
            throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        ModalidadGraduacion mod = new ModalidadGraduacion(codigo, descripcion);
        return mod.insertarRegistro();
    }
    
    // Metodo para mandar a leer un registro de Modalidad
    public static ModalidadGraduacion leerRegistro(String codigo) throws
            ClassNotFoundException,
            InstantiationException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        ModalidadGraduacion mod = new ModalidadGraduacion();
        return mod.leerRegistro(codigo);
    }
    
    // Metodo para mandar a eliminar un registro de Modalidad
    public static boolean eliminar(String codigo) throws ClassNotFoundException,
            InstantiationException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        
        ModalidadGraduacion mod = new ModalidadGraduacion();
        return mod.borrarRegistro(codigo);
    }
}
