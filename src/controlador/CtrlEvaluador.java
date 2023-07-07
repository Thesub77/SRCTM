package controlador;

import java.sql.SQLException;
import negocio.Evaluador;

public class CtrlEvaluador {

    // Metodo para mandar a crear un objeto de Evaluador
    public static int insertar_evaluador(String inss, String nomb, String apell1,
            String apell2)
            throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Evaluador eva = new Evaluador(inss, nomb, apell1, apell2);
        return eva.insertarRegistro();
    }
    
    // Metodo para mandar a leer un registro de Evaluador
    public static Evaluador leerRegistro(String inss) throws
            ClassNotFoundException,
            InstantiationException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Evaluador eva = new Evaluador();
        return (Evaluador) eva.leerRegistro(inss);
    }
    
    // Metodo para mandar a eliminar un registro de Evaluador
    public static boolean eliminar(String inss) throws ClassNotFoundException,
            InstantiationException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        
        Evaluador e = new Evaluador();
        return e.borrarRegistro(inss);
    }
}
