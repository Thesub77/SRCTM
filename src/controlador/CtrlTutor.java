package controlador;

import java.sql.SQLException;
import negocio.Tutor;

public class CtrlTutor {

    public static int insertar_tutor(String inss, String nomb, String apell1,
            String apell2)
            throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Tutor tut = new Tutor(inss, nomb, apell1, apell2);
        return tut.insertarRegistro();
    }

    public static Tutor leerRegistro(String inss) throws
            ClassNotFoundException,
            InstantiationException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Tutor tut = new Tutor();
        return (Tutor) tut.leerRegistro(inss);
    }

    public static boolean eliminar(String inss) throws ClassNotFoundException,
            InstantiationException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        Tutor t = new Tutor();
        return t.borrarRegistro(inss);
    }
}
