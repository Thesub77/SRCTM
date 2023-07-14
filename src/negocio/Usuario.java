package negocio;

import datos.DB_Usuario;
import java.sql.SQLException;

public class Usuario extends emp{
    
    protected static Usuario instance;
    
    // Variables de instancia
    protected int idUser;
    protected int idEmp;
    protected String correo;
    protected String contrasenia;
    
    // Constructores
    public Usuario(){
        this.inss = "";
        this.nombre = "";
        this.p_apellido = "";
        this.s_apellido = "";
        this.correo = "";
        this.contrasenia = "";
    }

    public Usuario(String correo, String contrasenia) {
        this.correo = correo;
        this.contrasenia = contrasenia;
    }
    
    // GET Y SET

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(int idEmp) {
        this.idEmp = idEmp;
    }
    
    // Metodo para insertar un usuario
    public int insertarUsuario() throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        DB_Usuario user_db = new DB_Usuario(this);

        //Verificar si es una actualización o una nueva inserción
        if (!user_db.verificarUsuario()) {
            return user_db.insertar(false);  //Se trata de una nueva inserción
        } else {
            return user_db.insertar(true); //Se trata de una actualización   
        }
    }
    
    // Metodo para leer un Usuario
    public Usuario leerUsuario(String inss) throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        DB_Usuario bdUser = new DB_Usuario();
        return bdUser.buscarUsuario(inss);
    }
    
    // Metodo para anular un registro de modalidad
    public boolean borrarUsuario(String inss) throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        
        DB_Usuario bdUser = new DB_Usuario();
        return bdUser.borrar(inss);
    }
    
    // Metodo para iniciar sesion
    public Usuario iniciarSesion(String correo) throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        DB_Usuario bdUser = new DB_Usuario();
        return (Usuario) bdUser.inicioSesion(correo);
    }
    
    
    
    
    public static Usuario getInstance() {
        if (instance == null) {
            instance = new Usuario();
        }
        return instance;
    }
}
