package controlador;

import java.sql.SQLException;
import negocio.emp;

public class CtrlEmpleado {

    // Metodo para mandar a insertar un Empleado
    public static int insertar_empleado(String inss, String nomb, String apell1,
            String apell2)
            throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        emp em = new emp(inss, nomb, apell1, apell2);
        return em.insertarRegistro();
    }

    // Metodo para mandar a leer un registro de Empleado
    public static emp leerRegistro(String inss) throws
            ClassNotFoundException,
            InstantiationException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        emp em = new emp();
        return (emp) em.leerRegistro(inss);
    }

    // Metodo para mandar a eliminar un registro de Empleado
    public static boolean eliminar(String inss) throws ClassNotFoundException,
            InstantiationException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        
        emp em = new emp();
        return em.borrarRegistro(inss);
    }
}
