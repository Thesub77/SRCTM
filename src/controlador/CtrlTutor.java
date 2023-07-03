package controlador;

import java.sql.SQLException;
import negocio.Tutor;

public class CtrlTutor {

    // Metodo para mandar a insertar un Tutor
    public static int insertar_tutor(String inss, String nomb, String apell1,
            String apell2)
            throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Tutor tut = new Tutor(inss, nomb, apell1, apell2);
        return tut.insertarRegistro();
    }

    // Metodo para mandar a leer un registro de Tutor
    public static Tutor leerRegistro(String inss) throws
            ClassNotFoundException,
            InstantiationException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Tutor tut = new Tutor();
        return (Tutor) tut.leerRegistro(inss);
    }

    // Metodo para mandar a eliminar un registro de Tutor
    public static boolean eliminar(String inss) throws ClassNotFoundException,
            InstantiationException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        Tutor t = new Tutor();
        return t.borrarRegistro(inss);
    }
}
