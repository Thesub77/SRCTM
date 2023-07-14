package datos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
    
    // Listado para combobox
    public ArrayList<String> leerCarreras () 
                                    throws java.lang.ClassNotFoundException,
                                           java.lang.InstantiationException,
                                           java.lang.IllegalAccessException,
                                           java.sql.SQLException
                                           
    {
      //Definir el ArrayList que contendra los nombres de las Carreras
        ArrayList<String> lstFact = null;        
      //Crear la instancia de conexión
        cnx = new MS_SQLServer ();
      //Definir el String que se encarga de llamar a la vista
       String sql = "SELECT descripcion_carrera FROM Carrera";
       cnx.pst = cnx.conexion.prepareStatement(sql);
       cnx.resultado = cnx.pst.executeQuery();
       
       //Verificar resultados de la consulta
       if (cnx.resultado != null)
       {
           lstFact = new ArrayList<> ();
           while (cnx.resultado.next()) {
               lstFact.add(cnx.resultado.getString("descripcion_carrera"));
           }//Fin de la instrucción while
       }//Fin del condicional if
      return lstFact; 
    }//Fin
    
    // Buscar el id de una carrera con su descripcion
    public int leerId (String descripcionCarrera) throws  java.lang.ClassNotFoundException,
                                            java.lang.InstantiationException,
                                            java.lang.IllegalAccessException,
                                            java.sql.SQLException
    {
       int value = 0;
        //Definir la instancia de conexión con la base de datos
        cnx = new MS_SQLServer ();
        /*Esta vez la sentencia es una cadena que invoca un procedimiento 
          que contiene un parámetro de salida*/
        String sql = "SELECT id_carrera FROM Carrera ";
               sql += "WHERE \"descripcion_carrera\" = ?";
        //Invocar a instancia de la clase CallableStatement que ejecuta consulta 
        cnx.pst = cnx.conexion.prepareStatement(sql);
        cnx.pst.setString(1, descripcionCarrera);
        cnx.resultado = cnx.pst.executeQuery();
        
        //Verificar resultados de la consulta
       if (cnx.resultado.next())       
           value = cnx.resultado.getInt("id_carrera");        
        //Retornar el valor obtenido
        return value;
    }
    
    public List<Carrera> listadoCarrerasTb () throws ClassNotFoundException,
                                                     InstantiationException,
                                                     IllegalAccessException,
                                                     SQLException
    {
       List<Carrera> list = null; //Lista de instancia a retornar
        cnx = new MS_SQLServer (); //Establecer la instancia para la conexión
        //Consultar todos los registros que estan activo para retornarlos
        String sql = "EXECUTE listar_carrera";
               //sql += " correo_institucional, funcion_laboral";
               //sql += " FROM personal_operativo WHERE \"anulado\" <> 0";
        
        cnx.pst = cnx.conexion.prepareStatement(sql);
        //Ejecutar la consulta del PreparedStatement
        cnx.resultado = cnx.pst.executeQuery();
        
        //Verificar que se obtuvieron registros, si hay se procesan        
        if (cnx.resultado != null){
            list = new ArrayList<>();//ArrayList almacen
            while (cnx.resultado.next()) {
              Carrera p = new Carrera (); //Generar instanc
              p.setCodigoCarrera(cnx.resultado.getString("codigo_carrera"));
              p.setDescripcion(cnx.resultado.getString("descripcion_carrera"));
              //p.setP_apellido(cnx.resultado.getString("p_apellido_tutor") + " " + cnx.resultado.getString("s_apellido_tutor"));
              //p.setS_apellido(cnx.resultado.getString("s_apellido_tutor"));
              list.add(p); //Agregar el resultado a la lista
            }//Fin de la instrucción While
        }//Fin de la instrucción if
        
        return list;
    }//Fin
}
