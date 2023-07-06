package datos;

import java.sql.SQLException;
import negocio.ModalidadGraduacion;
import servicios.Conexion;
import servicios.MS_SQLServer;

public class DB_ModalidadGraduacion {

    // Variables de instancia
    private ModalidadGraduacion mod; //Instancia de Modalidad
    private Conexion cnx; //= null; //Manejador de conexión

    // Constructores
    public DB_ModalidadGraduacion() {
        mod = null;
    }

    public DB_ModalidadGraduacion(ModalidadGraduacion pt) {
        this.mod = pt;
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
            sql = "EXECUTE insertar_modalidadGraduacion ";
            sql += "?, ?, ?";

            //Preparar la consulta y establecer los valores del PreparedStatement
            cnx.pst = cnx.conexion.prepareStatement(sql);
            cnx.pst.setString(1, mod.getCodigoModalidad());
            cnx.pst.setString(2, mod.getDescripcion());
            cnx.pst.setInt(3, 1);
        } else {
            //La Operación se trata de una actualización de Registro
            sql = "EXECUTE actualizar_modalidadGraduacion ";
            sql += "?, ?";

            //Establecer los parámetros a pasar a la consulta
            cnx.pst = cnx.conexion.prepareStatement(sql);
            cnx.pst.setString(1, mod.getCodigoModalidad());
            cnx.pst.setString(2, mod.getDescripcion());
        }//Fin

        return cnx.pst.executeUpdate();
    }// Fin

    // Buscar un registro de Modalidad
    public ModalidadGraduacion buscarModalidad(String codigo) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        // Objeto Modalidad que guardara el resultado de la consulta
        ModalidadGraduacion mod = null;

        String sql = "EXECUTE buscar_modalidadGraduacion ";
        sql += "?";

        cnx = new MS_SQLServer();
        //Preparar la conexión hacia el SGBD para obtener registros
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setString(1, codigo);
        cnx.resultado = cnx.pst.executeQuery();

        //Recorrer los resultados obtenidos en la consulta si los hay
        if (cnx.resultado.next()) {
            //Recuperar los valores del registro y asignar al objeto p
            mod = new ModalidadGraduacion(cnx.resultado.getString("codigo_modalidadGraduacion"),
                    cnx.resultado.getString("descripcion_modalidadGraduacion"));
        }//Fin

        return mod;//Retornar el objeto con los valores encontrados
    }//Fin

    // Metodo para verificar la existencia de un registro de Modalidad
    public boolean verificarModalidad() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        //Instancia de conexión con la base de datos
        cnx = new MS_SQLServer();

        //Establecer la Sentencia SQL de consulta en la base de datos
        String sql = "EXECUTE verificar_modalidadGraduacion ?";// Pendiente aniadir el stored procedure

        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setString(1, mod.getCodigoModalidad()); //Indicar el número de INSS
        cnx.resultado = cnx.pst.executeQuery();
        //Retornar el resultado obtenido en la consulta
        return cnx.resultado.next();
    }//Fin

    // Metodo para borrar un registro de Modalidad
    public boolean borrar(String codigo) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        //Instancia de conexión con la base de datos
        cnx = new MS_SQLServer();

        // Cadena que almacenara la consulta
        String sql;

        sql = "EXECUTE eliminar_modalidadGraduacion ";
        sql += "?";

        //Establecer los parámetros a pasar a la consulta
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setString(1, codigo);

        //Retornará verdadero si hubieron registros afectados false sino es así
        return cnx.pst.executeUpdate() > 0;
    }//Fin
}
