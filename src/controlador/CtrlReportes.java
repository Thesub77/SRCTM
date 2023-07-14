package controlador;

import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import negocio.Reportes;

public class CtrlReportes {

    public static void listar(javax.swing.JTable tModel) throws
            ClassNotFoundException,
            InstantiationException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        DefaultTableModel modelo = (DefaultTableModel) tModel.getModel();
        //Obtener la lista de la capa de negocio
        Reportes rep = new Reportes();
        List<Reportes> t = rep.SeminariosPorCarrera();

        //Recorrer los elementos de la lista
        for (Reportes ans : t) {
            modelo.addRow(new Object[]{ans.getCarrera(), ans.getTitulo(), ans.getFecha()});
        }//Fin de la instrucción foreach  
    }//Fin
}
