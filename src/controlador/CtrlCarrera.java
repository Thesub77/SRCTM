package controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import negocio.Carrera;

public class CtrlCarrera {
    
    // Metodo para mandar a insertar una carrera
    public static int insertar_carrera(String codigo, String descripcion)
            throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Carrera carr = new Carrera(codigo, descripcion);
        return carr.insertarRegistro();
    }
    
    // Metodo para mandar a leer un registro de Carrera
    public static Carrera leerRegistro(String codigo) throws
            ClassNotFoundException,
            InstantiationException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Carrera carr = new Carrera();
        return carr.leerRegistro(codigo);
    }
    
    // Metodo para mandar a eliminar un registro de Carrera
    public static boolean eliminar(String codigo) throws ClassNotFoundException,
            InstantiationException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        
        Carrera carr = new Carrera();
        return carr.borrarRegistro(codigo);
    }
    
    // Listado de carreras
    public static ArrayList<String> listar () throws ClassNotFoundException,
                                              InstantiationException,
                                              IllegalAccessException,
                                              SQLException
    {
       Carrera carr = new Carrera ();
       return carr.listaCarreras();
    }
    
    // Recuperar Id carrera
    public static int recuperarIdCarrera (String descripcionCarrera) throws ClassNotFoundException,
                                                       InstantiationException,
                                                       IllegalAccessException,
                                                       SQLException
    {
        Carrera carr = new Carrera ();
        return carr.buscarIdCarrera(descripcionCarrera);
    }//Fin
    
    // Listar carreras en tabla
    public static void listarTablaCarrera (javax.swing.JTable tModel) throws
                                                  ClassNotFoundException,
                                                  InstantiationException,
                                                  InstantiationException,
                                                  IllegalAccessException,
                                                  SQLException
    {
        DefaultTableModel modelo = (DefaultTableModel) tModel.getModel();
        //Obtener la lista de la capa de negocio
        Carrera tut = new Carrera ();
        List<Carrera> t = tut.leerCarrerasTb();
        
        //Recorrer los elementos de la lista
        for (Carrera ans : t) {
            modelo.addRow(new Object [] {ans.getCodigoCarrera(), ans.getDescripcion()});
        }//Fin de la instrucción foreach  
    }//Fin
}
