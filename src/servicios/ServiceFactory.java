package servicios;

import java.sql.SQLException;

public class ServiceFactory {

    // Variables de instancia
    private Conexion cnn; //Definir una variable para instanciar a Conexion
    //Variable de instancia para que se comparta por cualquier clase instancia
    // de la Clase ServiceFactory
    private static ServiceFactory instancia; //Manejar la instancia actual

    // Constructor
    public ServiceFactory() {
        //Constructor por default para que no modifique el estado de las variables de instancia
    }//Fin de constructor

    /*
    Método sincronizado que determina si hay actualmente instancias en uso y
    la retorna, si no se han establecido instancia, crea una nueva para 
    establecer uso de la conexión
    */
    public static synchronized ServiceFactory getInstancia() {
        //Determinar si no hay una instancia en uso
        return (instancia != null) ? instancia : new ServiceFactory();
    }//Fin de la clase

    public Conexion getConexion() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        if (cnn == null) {
            //Tomar del archivo de configuración el nombre especifico de la clase
            // con la que se generará instancia de conexión
            String nombClass = System.getProperty("databaseclass");
        }//Fin de condicional if
        //cnn = (Conexion) Class.forName(nombClass);
        return cnn;
    }//Fin método de conexión
}//Fin de la clase
