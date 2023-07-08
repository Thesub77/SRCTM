package controlador;

import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import negocio.Tutor;

public class CtrlTutor {

    // Metodo para mandar a insertar un Tutor
    public static int insertar_tutor(String inss, String nomb, String apell1,
            String apell2)
            throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Tutor tut = new Tutor(inss, nomb, apell1, apell2);
        return tut.insertarRegistro();
    }

    // Metodo para mandar a leer un registro de Tutor
    public static Tutor leerRegistro(String inss) throws
            ClassNotFoundException,
            InstantiationException,
            InstantiationException,
            IllegalAccessException,
            SQLException {

        Tutor tut = new Tutor();
        return (Tutor) tut.leerRegistro(inss);
    }

    // Metodo para mandar a eliminar un registro de Tutor
    public static boolean eliminar(String inss) throws ClassNotFoundException,
            InstantiationException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        Tutor t = new Tutor();
        return t.borrarRegistro(inss);
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
        Tutor tut = new Tutor ();
        List<Tutor> t = tut.leerTutores();
        
        //Recorrer los elementos de la lista
        for (Tutor ans : t) {
            modelo.addRow(new Object [] {ans.getInss(), ans.getNombre(),
                          ans.getP_apellido()});
        }//Fin de la instrucción foreach  
    }//Fin
}
