package datos;

import java.util.ArrayList;
import java.util.List;
import negocio.Reportes;
import servicios.Conexion;
import servicios.MS_SQLServer;

public class DB_Reportes {
    
    private Reportes con; //Instancia de Tutor
    private Conexion cnx; //= null; //Manejador de conexión

    // Constructores
    public DB_Reportes() {
        con = null;
    }

    public DB_Reportes(Reportes pt) {
        this.con = pt;
    }
    
    // Metodo para listar reporte de Seminarios por Carrera
    public List<Reportes> seminariosPorCarrera () 
                                    throws java.lang.ClassNotFoundException,
                                           java.lang.InstantiationException,
                                           java.lang.IllegalAccessException,
                                           java.sql.SQLException
                                           
    {
      //Definir el ArrayList que contendra los nombres de las Carreras
        List<Reportes> lstFact = null;        
      //Crear la instancia de conexión
        cnx = new MS_SQLServer ();
      //Definir el String que se encarga de llamar a la vista
       String sql = "EXECUTE SeminarioPorCarreraReport";
       cnx.pst = cnx.conexion.prepareStatement(sql);
       //cnx.pst.setString(1, con.getTitulo());
       cnx.resultado = cnx.pst.executeQuery();
       
       //Verificar resultados de la consulta
       if (cnx.resultado != null)
       {
           lstFact = new ArrayList<> ();
           while (cnx.resultado.next()) {
               Reportes con = new Reportes();
               con.setCarrera(cnx.resultado.getString("descripcion_carrera"));
               //con.setModalidad(cnx.resultado.getString("descripcion_modalidadGraduacion"));
               con.setTitulo(cnx.resultado.getString("titulo_trabajo"));
               con.setFecha(cnx.resultado.getString("fecha_trabajo"));
               //con.setResumen(cnx.resultado.getString("resumen_trabajo"));
               
               // Agregamos el resultado a la lista
               lstFact.add(con);
           }//Fin de la instrucción while
       }//Fin del condicional if
      return lstFact; 
    }//Fin
}
