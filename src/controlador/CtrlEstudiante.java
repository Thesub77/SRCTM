package controlador;

import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import negocio.Estudiante;

public class CtrlEstudiante {

    // Metodo para mandar a insertar un Estudiante
    public static int insertar_estudiante(String carnet, String nomb, String apell1,
            String apell2)
            throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Estudiante es = new Estudiante(carnet, nomb, apell1, apell2);
        return es.insertarRegistro();
    }

    // Metodo para mandar a leer un registro de Estudiante
    public static Estudiante leerRegistro(String carnet) throws
            ClassNotFoundException,
            InstantiationException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Estudiante es = new Estudiante();
        return (Estudiante) es.leerRegistro(carnet);
    }

    // Metodo para mandar a eliminar un registro de Estudiante
    public static boolean eliminar(String carnet) throws ClassNotFoundException,
            InstantiationException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        
        Estudiante es = new Estudiante();
        return es.borrarRegistro(carnet);
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
        Estudiante tut = new Estudiante ();
        List<Estudiante> t = tut.leerEstudiantes();
        
        //Recorrer los elementos de la lista
        for (Estudiante ans : t) {
            modelo.addRow(new Object [] {ans.getCarnet(), ans.getNombre(),
                          ans.getP_apellido()});
        }//Fin de la instrucción foreach  
    }//Fin
}
