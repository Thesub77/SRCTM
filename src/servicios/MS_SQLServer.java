package servicios;
import java.sql.SQLException;
import java.sql.DriverManager;

public class MS_SQLServer extends Conexion {
    
    // Variables de instancia
    private final boolean isCertificate; //Verificación de certificado de SQL
    private final boolean isEncrypt; //Cifrar la información a procesar
    private final boolean isSecurity; //Conexión por Autenticación Windows
    
    // Constructor
    public MS_SQLServer  () throws ClassNotFoundException,
                                   InstantiationException,
                                   IllegalAccessException,
                                   SQLException
    {
      super (); //Invocar al constructor de la clase padre
      //puerto = 1433; //Puerto por default del SGBD SQL Server
      isCertificate = true; //Indicar que se use el certificado de SQL Server
      isEncrypt = true;  //Indicar que los datos se deben cifrar
      isSecurity = true; //Permitir conexión en SQL Server por Autenticación Win
      this.initdb (); //Método inicializador de la conexión
    }//Fin constructor
    
    // Inicializador de las instancias
    @Override
    public void initdb () throws ClassNotFoundException,
                                 InstantiationException,
                                 IllegalAccessException,
                                 SQLException
    {
        //jdbc + host + ":" + puerto  + ";" + "databaseName=" + database +
        super.initdb(); //Invocar al método original para inicializar la cadena
        s_conexion +=";trustServerCertificate=" + isCertificate + ";encrypt=" 
                   + isEncrypt + ";integratedSecurity=" + isSecurity;
        //Instancia anonima para conexión
        Class.forName(driver);
        conexion = DriverManager.getConnection(s_conexion);      
    }//Fin método
}//Fin de la clase