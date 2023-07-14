package controlador;

import java.sql.SQLException;
import negocio.Usuario;

public class CtrlUsuario {
    
     // Metodo para mandar a insertar un Usuario
    public static int insertar_usuario(String correo, String contrasenia)
            throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Usuario user = new Usuario(correo, contrasenia);
        return user.insertarUsuario();
    }

    // Metodo para mandar a leer un registro de Usuario
    public static Usuario leerRegistro(String inss) throws
            ClassNotFoundException,
            InstantiationException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Usuario user = new Usuario();
        return (Usuario) user.leerUsuario(inss);
    }

    // Metodo para mandar a eliminar un registro de Usuario
    public static boolean eliminar(String inss) throws ClassNotFoundException,
            InstantiationException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        Usuario user = new Usuario();
        return user.borrarUsuario(inss);
    }
    
    // Metodo para iniciar sesion
    public static Usuario iniciarSesion(String correo) throws
            ClassNotFoundException,
            InstantiationException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Usuario user = Usuario.getInstance();
        return (Usuario) user.iniciarSesion(correo);
    }
}
