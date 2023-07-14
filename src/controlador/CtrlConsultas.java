package controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import negocio.Consulta;

public class CtrlConsultas {
    
    // Listado de trabajos por titulo
    /*public static ArrayList<String> listaPorTitulo (String titulo) throws ClassNotFoundException,
                                              InstantiationException,
                                              IllegalAccessException,
                                              SQLException
    {
       Consulta con = new Consulta (titulo);
       return con.listaTrabajosPorTit();
    }*/
    
    // Listar tutores en tabla
    public static void listar (javax.swing.JTable tModel, String titulo) throws
                                                  ClassNotFoundException,
                                                  InstantiationException,
                                                  InstantiationException,
                                                  IllegalAccessException,
                                                  SQLException
    {
        DefaultTableModel modelo = (DefaultTableModel) tModel.getModel();
        //Obtener la lista de la capa de negocio
        Consulta tut = new Consulta (titulo);
        List<Consulta> t = tut.listaTrabajosPorTit();
        
        //Recorrer los elementos de la lista
        for (Consulta ans : t) {
            modelo.addRow(new Object [] {ans.getCarrera(), ans.getModalidad(),
                          ans.getTitulo(), ans.getFecha(), ans.getResumen()});
        }//Fin de la instrucción foreach  
    }//Fin
}
