package datos;

import java.sql.SQLException;
import java.sql.Date;
import negocio.Seminario;
import servicios.Conexion;
import servicios.MS_SQLServer;

public class DB_Seminario {

    // Variables de instancia
    private Seminario sem; //Instancia de Seminario
    private Conexion cnx; //= null; //Manejador de conexión

    // Constructores
    public DB_Seminario() {
        sem = null;
    }

    public DB_Seminario(Seminario pt) {
        this.sem = pt;
    }

    // Metodo para insertar un Seminario
    public int insertar(boolean op) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        cnx = new MS_SQLServer();
        String sql; //Define la cadena de SQL a procesar
        //Si op (operación) no es true se trata de un nuevo registro
        if (!op) {
            sql = "EXECUTE insertar_seminario ";
            sql += "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?";

            //Preparar la consulta y establecer los valores del PreparedStatement
            cnx.pst = cnx.conexion.prepareStatement(sql);
            cnx.pst.setInt(1, sem.getTutor());
            cnx.pst.setString(2, sem.getTitulo_trabajo());
            cnx.pst.setString(3, sem.getResumen_trabajo());
            cnx.pst.setDate(4, Date.valueOf(sem.getFecha()));
            cnx.pst.setInt(5, sem.getSemestre());
            cnx.pst.setInt(6, 1);
            cnx.pst.setInt(7, 1);
            cnx.pst.setInt(8, 1);
            cnx.pst.setInt(9, sem.getCarrera());
            cnx.pst.setInt(10, 1);
            cnx.pst.setInt(11, sem.getEstudiante1());
            cnx.pst.setInt(12, sem.getEstudiante2());
            cnx.pst.setInt(13, sem.getEstudiante3());
        } else {
            //La Operación se trata de una actualización de Registro
            sql = "EXECUTE actualizar_seminario ";
            sql += "?, ?, ?, ?, ?, ?";
            
            //Establecer los parámetros a pasar a la consulta
            cnx.pst.setString(1, sem.getResumen_trabajo());
            cnx.pst.setInt(2, sem.getTutor());
            cnx.pst.setString(3, sem.getTitulo_trabajo());
            cnx.pst.setString(4, sem.getFecha());
            cnx.pst.setInt(5, sem.getSemestre());
            cnx.pst.setInt(6, sem.getCarrera());
        }//Fin

        return cnx.pst.executeUpdate();
    }// Fin

    // Metodo para verificar la existencia de un registro de Tutor
    public boolean verificarSeminario() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        //Instancia de conexión con la base de datos
        cnx = new MS_SQLServer();

        //Establecer la Sentencia SQL de consulta en la base de datos
        String sql = "SELECT id_maestro_detalle "
                + "FROM Trabajo_Culminacion "
                + "WHERE resumen_trabajo = ?";

        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setString(1, sem.getResumen_trabajo());
        cnx.resultado = cnx.pst.executeQuery();
        //Retornar el resultado obtenido en la consulta
        return cnx.resultado.next();
    }//Fin
}
