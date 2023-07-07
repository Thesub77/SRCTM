package datos;

import java.sql.SQLException;
import negocio.emp;
import servicios.Conexion;
import servicios.MS_SQLServer;

public class DB_Empleado {
    
    // Variables de instancia
    private emp em; //Instancia de Empleado
    private Conexion cnx; //= null; //Manejador de conexión

    // Constructores
    public DB_Empleado() {
        em = null;
    }

    public DB_Empleado(emp pt) {
        this.em = pt;
    }
    
    // Metodo para insertar un Empleado
    public int insertar(boolean op) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        cnx = new MS_SQLServer();
        String sql; //Define la cadena de SQL a procesar
        //Si op (operación) no es true se trata de un nuevo registro
        if (!op) {
            sql = "EXECUTE insertar_empleado ";
            sql += "?, ?, ?, ?, ?";

            //Preparar la consulta y establecer los valores del PreparedStatement
            cnx.pst = cnx.conexion.prepareStatement(sql);
            cnx.pst.setString(1, em.getInss());
            cnx.pst.setString(2, em.getNombre());
            cnx.pst.setString(3, em.getP_apellido());
            cnx.pst.setString(4, em.getS_apellido());
            cnx.pst.setInt(5, 1);
        } else {
            //La Operación se trata de una actualización de Registro
            sql = "EXECUTE actualizar_empleado ";
            sql += "?, ?, ?, ?";
            
            //Establecer los parámetros a pasar a la consulta
            cnx.pst = cnx.conexion.prepareStatement(sql);
            cnx.pst.setString(1, em.getInss());
            cnx.pst.setString(2, em.getNombre());
            cnx.pst.setString(3, em.getP_apellido());
            cnx.pst.setString(4, em.getS_apellido());
        }//Fin

        return cnx.pst.executeUpdate();
    }// Fin
    
    // Buscar un registro de Empleado
    public emp buscarEmpleado(String inss) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        // Objeto Empleado que guardara el resultado de la consulta
        emp em = null;

        String sql = "EXECUTE buscar_empleado ";
        sql += "?";

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
            em = new emp(cnx.resultado.getString("INSS_empleado"),
                    cnx.resultado.getString("nombre_empleado"),
                    cnx.resultado.getString("p_apellido_empleado"),
                    cnx.resultado.getString("s_apellido_empleado"));
        }//Fin

        return em;//Retornar el objeto con los valores encontrados
    }//Fin
    
    // Metodo para verificar la existencia de un registro de Empleado
    public boolean verificarEmpleado () throws ClassNotFoundException,
                                  InstantiationException,
                                  IllegalAccessException,
                                  SQLException
    
    {
       //Instancia de conexión con la base de datos
       cnx = new MS_SQLServer ();
       
       String sql = "EXECUTE verificar_empleado ?";// Pendiente aniadir el stored procedure
       
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setString(1, em.getInss()); //Indicar el número de INSS
        cnx.resultado = cnx.pst.executeQuery();
        //Retornar el resultado obtenido en la consulta
       return cnx.resultado.next();
    }//Fin
    
    // Metodo para borrar un registro de Empleado
    public boolean borrar(String inss) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        
        //Instancia de conexión con la base de datos
        cnx = new MS_SQLServer();
        
        // Cadena que almacenara la consulta
        String sql;

        sql = "EXECUTE eliminar_empleado ";
        sql += "?";
        
        //Establecer los parámetros a pasar a la consulta
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setString(1, inss);
        
        //Retornará verdadero si hubieron registros afectados false sino es así
        return cnx.pst.executeUpdate() > 0;
    }//Fin
}
