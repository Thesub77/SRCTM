package datos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import negocio.Estudiante;
import servicios.Conexion;
import servicios.MS_SQLServer;

public class DB_Estudiante {

    // Variables de instancia
    private Estudiante es;
    private Conexion cnx; //= null; //Manejador de conexión

    // Constructores
    public DB_Estudiante() {
        es = null;
    }

    public DB_Estudiante(Estudiante pt) {
        this.es = pt;
    }

    // Metodo para insertar un Estudiante
    public int insertar(boolean op) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        cnx = new MS_SQLServer();
        
        String sql; //Define la cadena de SQL a procesar
        
        //Si op (operación) no es true se trata de un nuevo registro
        if (!op) {
            sql = "EXECUTE insertar_estudiante ";
            sql += "?, ?, ?, ?, ?, ?";

            //Preparar la consulta y establecer los valores del PreparedStatement
            cnx.pst = cnx.conexion.prepareStatement(sql);
            cnx.pst.setString(1, es.getCarnet());
            cnx.pst.setString(2, es.getNombre());
            cnx.pst.setString(3, es.getP_apellido());
            cnx.pst.setString(4, es.getS_apellido());
            cnx.pst.setInt(5, 1);
            cnx.pst.setInt(6, 1);
        } else {
            //La Operación se trata de una actualización de Registro
            sql = "EXECUTE actualizar_estudiante ";
            sql += "?, ?, ?, ?";

            //Establecer los parámetros a pasar a la consulta
            cnx.pst = cnx.conexion.prepareStatement(sql);
            cnx.pst.setString(1, es.getCarnet());
            cnx.pst.setString(2, es.getNombre());
            cnx.pst.setString(3, es.getP_apellido());
            cnx.pst.setString(4, es.getS_apellido());
        }//Fin

        return cnx.pst.executeUpdate();
    }// Fin

    // Metodo para buscar un Estudiante
    public Estudiante buscarEstudiante(String carnet) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        // Objeto Estudiante que guardara el resultado de la consulta
        Estudiante es = null;

        String sql = "EXECUTE buscar_estudiante ";
        sql += "?";
        
        cnx = new MS_SQLServer();
    
        //Procesar la ejecución de la consulta en la base de datos
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setString(1, carnet);
        cnx.resultado = cnx.pst.executeQuery();

        //Recorrer los resultados obtenidos en la consulta si los hay
        if (cnx.resultado.next()) {
            //Recuperar los valores del registro y asignar al objeto p
            /*es = new Estudiante(cnx.resultado.getString("carnet_estudiante"),
                    cnx.resultado.getString("nombre_estudiante"),
                    cnx.resultado.getString("p_apellido_estudiante"),
                    cnx.resultado.getString("s_apellido_estudiante"));*/
            
            es = new Estudiante();
            es.setIdEst(cnx.resultado.getInt("id_estudiante"));
            es.setCarnet(cnx.resultado.getString("carnet_estudiante"));
            es.setNombre(cnx.resultado.getString("nombre_estudiante"));
            es.setP_apellido(cnx.resultado.getString("p_apellido_estudiante"));
            es.setS_apellido(cnx.resultado.getString("s_apellido_estudiante"));
        }//Fin

        return es;//Retornar el objeto con los valores encontrados
    }//Fin

    // Metodo para verificar la existencia de un registro de Estudiante
    public boolean verificarEstudiante() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        
        //Instancia de conexión con la base de datos
        cnx = new MS_SQLServer();

        //Establecer la Sentencia SQL de consulta en la base de datos
        String sql = "EXECUTE verificar_estudiante ?";// Pendiente aniadir el stored procedure

        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setString(1, es.getCarnet()); //Indicar el número de INSS
        cnx.resultado = cnx.pst.executeQuery();
        
        //Retornar el resultado obtenido en la consulta
        return cnx.resultado.next();
    }//Fin

    // Metodo para borrar un registro de Estudiante
    public boolean borrar(String carnet) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        //boolean rst = false;  //Variable para indicar el proceso de la consulta
        //Instancia de conexión con la base de datos
        cnx = new MS_SQLServer();

        // Cadena que almacenara la consulta
        String sql;

        sql = "EXECUTE eliminar_estudiante ";
        sql += "?";

        //Establecer los parámetros a pasar a la consulta
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setString(1, carnet);

        //Retornará verdadero si hubieron registros afectados false sino es así
        return cnx.pst.executeUpdate() > 0;
    }//Fin
    
    public List<Estudiante> listadoEstudiantes () throws ClassNotFoundException,
                                                     InstantiationException,
                                                     IllegalAccessException,
                                                     SQLException
    {
       List<Estudiante> list = null; //Lista de instancia a retornar
        cnx = new MS_SQLServer (); //Establecer la instancia para la conexión
        //Consultar todos los registros que estan activo para retornarlos
        String sql = "EXECUTE listar_estudiante";
               //sql += " correo_institucional, funcion_laboral";
               //sql += " FROM personal_operativo WHERE \"anulado\" <> 0";
        
        cnx.pst = cnx.conexion.prepareStatement(sql);
        //Ejecutar la consulta del PreparedStatement
        cnx.resultado = cnx.pst.executeQuery();
        
        //Verificar que se obtuvieron registros, si hay se procesan        
        if (cnx.resultado != null){
            list = new ArrayList<>();//ArrayList almacen
            while (cnx.resultado.next()) {
              Estudiante p = new Estudiante (); //Generar instanc
              p.setCarnet(cnx.resultado.getString("carnet_estudiante"));
              p.setNombre(cnx.resultado.getString("nombre_estudiante"));
              p.setP_apellido(cnx.resultado.getString("p_apellido_estudiante") + " " + cnx.resultado.getString("s_apellido_estudiante"));
              //p.setS_apellido(cnx.resultado.getString("s_apellido_tutor"));
              list.add(p); //Agregar el resultado a la lista
            }//Fin de la instrucción While
        }//Fin de la instrucción if
        
        return list;
    }//Fin
}
