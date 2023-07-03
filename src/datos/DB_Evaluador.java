package datos;

import java.sql.SQLException;
import servicios.Conexion;
import servicios.MS_SQLServer;
import negocio.Evaluador;

public class DB_Evaluador {
    // Variables de instancia
    private Evaluador eva; //Instancia de Evaluador
    private Conexion cnx; //= null; //Manejador de conexión

    // Constructores
    public DB_Evaluador() {
        eva = null;
    }

    public DB_Evaluador(Evaluador pt) {
        this.eva = pt;
    }
    
    // Metodo para insertar un Evaluador
    public int insertar(boolean op) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        cnx = new MS_SQLServer();
        String sql; //Define la cadena de SQL a procesar
        //Si op (operación) no es true se trata de un nuevo registro
        if (!op) {
            sql = "EXECUTE insertar_evaluador ";
            sql += "?, ?, ?, ?, ?";

            //Preparar la consulta y establecer los valores del PreparedStatement
            cnx.pst = cnx.conexion.prepareStatement(sql);
            cnx.pst.setString(1, eva.getInss());
            cnx.pst.setString(2, eva.getNombre());
            cnx.pst.setString(3, eva.getP_apellido());
            cnx.pst.setString(4, eva.getS_apellido());
            cnx.pst.setInt(5, 1);
        } else {
            //La Operación se trata de una actualización de Registro
            sql = "EXECUTE actualizar_evaluador ";
            sql += "?, ?, ?, ?";
            //Establecer los parámetros a pasar a la consulta
            cnx.pst = cnx.conexion.prepareStatement(sql);
            cnx.pst.setString(1, eva.getInss());
            cnx.pst.setString(2, eva.getNombre());
            cnx.pst.setString(3, eva.getP_apellido());
            cnx.pst.setString(4, eva.getS_apellido());
        }//Fin

        return cnx.pst.executeUpdate();
    }// Fin
    
    // Buscar un registro de Evaluador
    public Evaluador buscarEvaluador(String inss) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        // Objeto Evaluador que guardara el resultado de la consulta
        Evaluador t = null;

        String sql = "EXECUTE buscar_evaluador ";
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
            t = new Evaluador (cnx.resultado.getString("INSS_evaluador"),
                    cnx.resultado.getString("nombre_evaluador"),
                    cnx.resultado.getString("p_apellido_evaluador"),
                    cnx.resultado.getString("s_apellido_evaluador"));
        }//Fin
        
        return t; // Retornamos el objeto con los valores encontrados
    }
    
    // Metodo para verificar la existencia de un registro de Evaluador
    public boolean verificarEvaluador () throws ClassNotFoundException,
                                  InstantiationException,
                                  IllegalAccessException,
                                  SQLException
    
    {
       //Instancia de conexión con la base de datos
       cnx = new MS_SQLServer ();
       //Establecer la Sentencia SQL de consulta en la base de datos
       String sql = "EXECUTE verificar_evaluador ?";// Pendiente aniadir el stored procedure
       //sql += "WHERE \"codigo_inss\" = ?";
       
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setString(1, eva.getInss()); //Indicar el número de INSS
        cnx.resultado = cnx.pst.executeQuery();
        //Retornar el resultado obtenido en la consulta
       return cnx.resultado.next();
    }//Fin
    
    // Metodo para borrar un registro de Evaluador
    public boolean borrar(String inss) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        
        //boolean rst = false;  //Variable para indicar el proceso de la consulta
        
        //Instancia de conexión con la base de datos
        cnx = new MS_SQLServer();
        
        // Cadena que almacenara la consulta
        String sql;

        sql = "EXECUTE eliminar_evaluador ";
        sql += "?";
        //sql += "WHERE \"codigo_inss\" = ?";
        
        //Establecer los parámetros a pasar a la consulta
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setString(1, inss);
        
        //Retornará verdadero si hubieron registros afectados false sino es así
        return cnx.pst.executeUpdate() > 0;
    }//Fin
}
