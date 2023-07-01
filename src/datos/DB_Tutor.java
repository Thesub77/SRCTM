package datos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import negocio.Tutor;
import servicios.Conexion;
import servicios.MS_SQLServer;
import servicios.ServiceFactory;

public class DB_Tutor {

    // Variables de instancia
    private Tutor tut; //Instancia de Tutor
    private Conexion cnx; //= null; //Manejador de conexión

    // Constructores
    public DB_Tutor() {
        tut = null;
    }

    public DB_Tutor(Tutor pt) {
        this.tut = pt;
    }

    // Metodo para insertar un Tutor
    public int insertar(boolean op) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        cnx = new MS_SQLServer();
        String sql; //Define la cadena de SQL a procesar
        //Si op (operación) no es true se trata de un nuevo registro
        if (!op) {
            sql = "EXECUTE insertar_tutor ";
            sql += "?, ?, ?, ?, ?";

            //Preparar la consulta y establecer los valores del PreparedStatement
            cnx.pst = cnx.conexion.prepareStatement(sql);
            cnx.pst.setString(1, tut.getInss());
            cnx.pst.setString(2, tut.getNombre());
            cnx.pst.setString(3, tut.getP_apellido());
            cnx.pst.setString(4, tut.getS_apellido());
            cnx.pst.setInt(5, 1);
        } else {
            //La Operación se trata de una actualización de Registro
            sql = "EXECUTE actualizar_tutor ";
            sql += "?, ?, ?, ?";
            //sql += "WHERE \"INSS_tutor\" = ?";
            //Establecer los parámetros a pasar a la consulta
            cnx.pst = cnx.conexion.prepareStatement(sql);
            cnx.pst.setString(1, tut.getInss());
            cnx.pst.setString(2, tut.getNombre());
            cnx.pst.setString(3, tut.getP_apellido());
            cnx.pst.setString(4, tut.getS_apellido());
        }//Fin

        return cnx.pst.executeUpdate();
    }// Fin

    // Buscar un registro de Tutor
    public Tutor buscarTutor(String inss) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        // Objeto Tutor que guardara el resultado de la consulta
        Tutor t = null;

        String sql = "EXECUTE buscar_tutor ";
        sql += "?";
        //sql += "WHERE \"codigo_inss\" = ?";

        cnx = new MS_SQLServer();
        //Preparar la conexión hacia el SGBD para obtener registros
        //cnx = ServiceFactory.getInstancia().getConexion();       
        //Procesar la ejecución de la consulta en la base de datos
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setString(1, inss);
        cnx.resultado = cnx.pst.executeQuery();

        //Recorrer los resultados obtenidos en la consulta si los hay
        if (cnx.resultado.next()) {
            //Recuperar los valores del registro y asignar al objeto p
            t = new Tutor(cnx.resultado.getString("INSS_tutor"),
                    cnx.resultado.getString("nombre_tutor"),
                    cnx.resultado.getString("p_apellido_tutor"),
                    cnx.resultado.getString("s_apellido_tutor"));
        }//Fin

        return t;//Retornar el objeto con los valores encontrados
    }//Fin

    // Metodo para verificar la existencia de un registro de Tutor
    public boolean verificarTutor () throws ClassNotFoundException,
                                  InstantiationException,
                                  IllegalAccessException,
                                  SQLException
    
    {
       //Instancia de conexión con la base de datos
       cnx = new MS_SQLServer ();
       //Establecer la Sentencia SQL de consulta en la base de datos
       // sql = "EXECUTE verificar_Tutor ?"
       String sql = "SELECT codigo_inss FROM personal_operativo "; // Pendiente aniadir el stored procedure
                                                                      sql += "WHERE \"codigo_inss\" = ?";
       
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setString(1, tut.getInss()); //Indicar el número de INSS
        cnx.resultado = cnx.pst.executeQuery();
        //Retornar el resultado obtenido en la consulta
       return cnx.resultado.next();
    }//Fin
    
    // Metodo para borrar un registro de Tutor
    public boolean borrar(String inss) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        
        boolean rst = false;  //Variable para indicar el proceso de la consulta
        
        //Instancia de conexión con la base de datos
        cnx = new MS_SQLServer();
        
        // Cadena que almacenara la consulta
        String sql;

        sql = "EXECUTE eliminar_tutor ";
        sql += "?";
        //sql += "WHERE \"codigo_inss\" = ?";
        
        //Establecer los parámetros a pasar a la consulta
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setString(1, inss);
        
        //Retornará verdadero si hubieron registros afectados false sino es así
        return cnx.pst.executeUpdate() > 0;
    }//Fin
}
