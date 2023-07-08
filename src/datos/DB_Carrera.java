package datos;

import java.sql.SQLException;
import negocio.Carrera;
import servicios.Conexion;
import servicios.MS_SQLServer;

public class DB_Carrera {
    // Variables de instancia
    private Carrera carr; //Instancia de Tutor
    private Conexion cnx; //= null; //Manejador de conexión

    // Constructores
    public DB_Carrera() {
        carr = null;
    }

    public DB_Carrera(Carrera pt) {
        this.carr = pt;
    }
    
    // Metodo para insertar una Carrera
    public int insertar(boolean op) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        cnx = new MS_SQLServer();
        String sql; //Define la cadena de SQL a procesar
        //Si op (operación) no es true se trata de un nuevo registro
        if (!op) {
            sql = "EXECUTE insertar_carrera ";
            sql += "?, ?, ?";

            //Preparar la consulta y establecer los valores del PreparedStatement
            cnx.pst = cnx.conexion.prepareStatement(sql);
            cnx.pst.setString(1, carr.getCodigoCarrera());
            cnx.pst.setString(2, carr.getDescripcion());
            cnx.pst.setInt(3, 1);
        } else {
            //La Operación se trata de una actualización de Registro
            sql = "EXECUTE actualizar_carrera ";
            sql += "?, ?";
            //sql += "WHERE \"INSS_tutor\" = ?";
            //Establecer los parámetros a pasar a la consulta
            cnx.pst = cnx.conexion.prepareStatement(sql);
            cnx.pst.setString(1, carr.getCodigoCarrera());
            cnx.pst.setString(2, carr.getDescripcion());
        }//Fin
        
        return cnx.pst.executeUpdate();
    }// Fin
    
    // Buscar un registro de Carrera
    public Carrera buscarCarrera(String codigo) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        // Objeto Carrera que guardara el resultado de la consulta
        Carrera carr = null;

        String sql = "EXECUTE buscar_carrera ";
        sql += "?";

        cnx = new MS_SQLServer();
        //Preparar la conexión hacia el SGBD para obtener registros
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setString(1, codigo);
        cnx.resultado = cnx.pst.executeQuery();

        //Recorrer los resultados obtenidos en la consulta si los hay
        if (cnx.resultado.next()) {
            //Recuperar los valores del registro y asignar al objeto p
            carr = new Carrera(cnx.resultado.getString("codigo_carrera"),
                    cnx.resultado.getString("descripcion_carrera"));
        }//Fin

        return carr;//Retornar el objeto con los valores encontrados
    }//Fin
    
    // Metodo para verificar la existencia de un registro de Modalidad
    public boolean verificarCarrera() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        //Instancia de conexión con la base de datos
        cnx = new MS_SQLServer();

        //Establecer la Sentencia SQL de consulta en la base de datos
        String sql = "EXECUTE verificar_carrera ?";// Pendiente aniadir el stored procedure

        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setString(1, carr.getCodigoCarrera()); //Indicar el número de INSS
        cnx.resultado = cnx.pst.executeQuery();
        //Retornar el resultado obtenido en la consulta
        return cnx.resultado.next();
    }//Fin
    
    // Metodo para borrar un registro de Carrera
    public boolean borrar(String codigo) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        //Instancia de conexión con la base de datos
        cnx = new MS_SQLServer();

        // Cadena que almacenara la consulta
        String sql;

        sql = "EXECUTE eliminar_carrera ";
        sql += "?";

        //Establecer los parámetros a pasar a la consulta
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setString(1, codigo);

        //Retornará verdadero si hubieron registros afectados false sino es así
        return cnx.pst.executeUpdate() > 0;
    }//Fin
}
