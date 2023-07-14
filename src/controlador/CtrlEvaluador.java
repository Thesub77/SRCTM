package controlador;

import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import negocio.Evaluador;

public class CtrlEvaluador {

    // Metodo para mandar a crear un objeto de Evaluador
    public static int insertar_evaluador(String inss, String nomb, String apell1,
            String apell2)
            throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Evaluador eva = new Evaluador(inss, nomb, apell1, apell2);
        return eva.insertarRegistro();
    }
    
    // Metodo para mandar a leer un registro de Evaluador
    public static Evaluador leerRegistro(String inss) throws
            ClassNotFoundException,
            InstantiationException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Evaluador eva = new Evaluador();
        return (Evaluador) eva.leerRegistro(inss);
    }
    
    // Metodo para mandar a eliminar un registro de Evaluador
    public static boolean eliminar(String inss) throws ClassNotFoundException,
            InstantiationException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        
        Evaluador e = new Evaluador();
        return e.borrarRegistro(inss);
    }
    
    public static void listar (javax.swing.JTable tModel) throws
                                                  ClassNotFoundException,
                                                  InstantiationException,
                                                  InstantiationException,
                                                  IllegalAccessException,
                                                  SQLException
    {
        DefaultTableModel modelo = (DefaultTableModel) tModel.getModel();
        //Obtener la lista de la capa de negocio
        Evaluador tut = new Evaluador ();
        List<Evaluador> t = tut.leerEvaluadores();
        
        //Recorrer los elementos de la lista
        for (Evaluador ans : t) {
            modelo.addRow(new Object [] {ans.getInss(), ans.getNombre(),
                          ans.getP_apellido()});
        }//Fin de la instrucción foreach  
    }//Fin
}
