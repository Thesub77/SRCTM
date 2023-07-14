package datos;

import java.sql.SQLException;
import negocio.Usuario;
import servicios.Conexion;
import servicios.MS_SQLServer;

public class DB_Usuario {
    // Variables de instancia
    private Usuario user; //Instancia de Usuario
    private Conexion cnx; //= null; //Manejador de conexión

    // Constructores
    public DB_Usuario() {
        user = null;
    }

    public DB_Usuario(Usuario pt) {
        this.user = pt;
    }
    
    // Metodo para insertar un Modalidad
    public int insertar(boolean op) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        cnx = new MS_SQLServer();
        String sql; //Define la cadena de SQL a procesar
        //Si op (operación) no es true se trata de un nuevo registro
        if (!op) {
            sql = "INSERT INTO Usuario "
                    + "VALUES ";
            sql += "?, ?, ?, ?";

            //Preparar la consulta y establecer los valores del PreparedStatement
            cnx.pst = cnx.conexion.prepareStatement(sql);
            cnx.pst.setInt(1, user.getIdEmp());
            cnx.pst.setString(2, user.getCorreo());
            cnx.pst.setString(3, user.getContrasenia());
            cnx.pst.setInt(4, 1);
        } else {
            //La Operación se trata de una actualización de Registro
            sql = "UPDATE Usuario "
                    + "SET correo_emp = ?, contrasenia_emp = ?";

            //Establecer los parámetros a pasar a la consulta
            cnx.pst = cnx.conexion.prepareStatement(sql);
            cnx.pst.setString(1, user.getCorreo());
            cnx.pst.setString(2, user.getContrasenia());
        }//Fin

        return cnx.pst.executeUpdate();
    }// Fin
    
    // Buscar un registro de Usuario
    public Usuario buscarUsuario(String inss) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        // Objeto Modalidad que guardara el resultado de la consulta
        Usuario user = null;

        String sql = "SELECT correo_emp, contrasenia_emp "
                + "FROM Usuario "
                + "INNER JOIN Empleado "
                + "ON Usuario.id_empleado = Empleado.id_empleado "
                + "WHERE Empleado.INSS_empleado = ? AND Usuario.Activo = 1 AND Empleado.activo = 1";

        cnx = new MS_SQLServer();
        //Preparar la conexión hacia el SGBD para obtener registros
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setString(1, inss);
        cnx.resultado = cnx.pst.executeQuery();

        //Recorrer los resultados obtenidos en la consulta si los hay
        if (cnx.resultado.next()) {
            //Recuperar los valores del registro y asignar al objeto p
            user = new Usuario(cnx.resultado.getString("correo_emp"),
                    cnx.resultado.getString("contrasenia_emp"));
        }//Fin

        return user;//Retornar el objeto con los valores encontrados
    }//Fin
    
    // Metodo para verificar la existencia de un registro de Usuario
    public boolean verificarUsuario() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        //Instancia de conexión con la base de datos
        cnx = new MS_SQLServer();

        //Establecer la Sentencia SQL de consulta en la base de datos
        String sql = "SELECT correo_emp "
                + "FROM Usuario "
                + "WHERE correo_emp = ?";// Pendiente aniadir el stored procedure

        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setString(1, user.getCorreo()); //Indicar el número de INSS
        cnx.resultado = cnx.pst.executeQuery();
        //Retornar el resultado obtenido en la consulta
        return cnx.resultado.next();
    }//Fin
    
    // Metodo para borrar un registro de Usuario
    public boolean borrar(String correo) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        //Instancia de conexión con la base de datos
        cnx = new MS_SQLServer();

        // Cadena que almacenara la consulta
        String sql;

        sql = "UPDATE Usuario "
                + "SET activo = 0 "
                + "WHERE correo_emp = ?"; // TRANSACT con EMPLEADO

        //Establecer los parámetros a pasar a la consulta
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setString(1, correo);

        //Retornará verdadero si hubieron registros afectados false sino es así
        return cnx.pst.executeUpdate() > 0;
    }//Fin
    
    // Metodo para iniciar sesion
    public Usuario inicioSesion(String correo) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        // Objeto Modalidad que guardara el resultado de la consulta
        Usuario user = null;

        String sql = "SELECT * "
                + "FROM Usuario "
                + "WHERE correo_emp = ? AND activo = 1";

        cnx = new MS_SQLServer();
        //Preparar la conexión hacia el SGBD para obtener registros
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setString(1, correo);
        cnx.resultado = cnx.pst.executeQuery();

        //Recorrer los resultados obtenidos en la consulta si los hay
        if (cnx.resultado.next()) {
            //Recuperar los valores del registro y asignar al objeto p
            /*user = new Usuario(cnx.resultado.getString("correo_emp"),
                    cnx.resultado.getString("contrasenia_emp"));
            user.setIdEmp(cnx.resultado.getInt("id_empleado"));
            user.setIdUser(cnx.resultado.getInt("id_usuario"));*/
            
            user = Usuario.getInstance();
            user.setCorreo(cnx.resultado.getString("correo_emp"));
            user.setContrasenia(cnx.resultado.getString("contrasenia_emp"));
            user.setIdEmp(cnx.resultado.getInt("id_empleado"));
            user.setIdUser(cnx.resultado.getInt("id_usuario"));
        }//Fin

        return user;//Retornar el objeto con los valores encontrados
    }//Fin
}
